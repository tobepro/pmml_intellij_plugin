package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.fileEditor.FileDocumentManager
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.xml.XmlFile
import com.intellij.ui.ToolbarDecorator
import com.intellij.ui.layout.panel
import com.intellij.util.xml.DomFileDescription
import com.intellij.util.xml.DomManager
import common.Util
import enums.DataFieldTypeEnum
import model.Attribute
import model.DataField
import model.dom.PMML
import java.awt.FlowLayout
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project: Project, module: Module, file: VirtualFile) : JPanel(), DataProvider {
    private val logger = Logger.getInstance(PmmlFileEditorTab::class.java)

    init {
        val document = FileDocumentManager.getInstance().getDocument(file)
        val psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document!!)
        val manager = DomManager.getDomManager(project)
        manager.registerFileDescription(DomFileDescription(PMML::class.java, "PMML"))
        val pmml = manager
                .getFileElement(psiFile as XmlFile, PMML::class.java)!!
                .rootElement

        var dataFieldList = pmml.dataDictionary.dataFields.map { field ->
            DataField(
                    field.name.value!!,
                    Util.dataTypeEnumConvert(field.dataType.value!!),
                    pmml.scorecard.characteristics.characteristics
                            .first { it.name.value == field.name.value }
                            .attributes
                            .map { attr ->
                                val score = attr.partialScore.value
                                val (operator, opValue) = if (attr.compoundPredicate.exists()) {
                                    val operatorArray = arrayListOf<String>()
                                    val opValueArray = arrayListOf<String>()
                                    attr.compoundPredicate
                                            .simplePredicates
                                            .forEach {
                                                operatorArray.add(it.operator.value!!.value)
                                                opValueArray.add(it.value.value!!)
                                            }
                                    val o = Util.getOperatorType(operatorArray.toTypedArray())
                                    Pair(o, opValueArray.joinToString(",", "", ""))
                                } else {
                                    val o = Util.getOperatorType(arrayOf(attr.simplePredicate.operator.value!!.value))
                                    Pair(o, attr.simplePredicate.value.value!!)
                                }
                                Attribute(score.toString(), operator, opValue)
                            }
            )
        }

        val dataTable = DataFieldTable(dataFieldList)
        dataTable.setRowSelectionInterval(0, 0)
        val detailTable = FieldDetailTable(dataFieldList[0].type, dataFieldList[0].attrs)
        // 字段选择变动时更新字段详情
        dataTable.selectionModel.addListSelectionListener { e ->
            if (dataFieldList.isEmpty()) {
                detailTable.updateRows(DataFieldTypeEnum.DOUBLE, arrayListOf())
            } else {
                val rowNum = if (dataTable.selectedRow < 0) e.firstIndex else dataTable.selectedRow
                detailTable.updateRows(dataFieldList[rowNum].type, dataFieldList[rowNum].attrs)
            }
        }

        // 实时保存字段列表
        dataTable.model.addTableModelListener { _ ->
            dataFieldList = dataTable.model.getAllDataField()
        }

        // 实时保存字段详情
        @Suppress("UNCHECKED_CAST")
        detailTable.model.addTableModelListener { e ->
            if (dataTable.selectedRow >= 0) {
                dataFieldList[dataTable.selectedRow].attrs = (e.source as FieldDetailTable.Companion.ModelAdapter).getAttrList()
            }
        }

        addFocusListener(object : FocusListener {
            override fun focusLost(e: FocusEvent?) {
//                dom.save(dataFieldList)
                logger.info("触发保存动作")
            }

            override fun focusGained(e: FocusEvent?) {
                // do nothing
            }

        })

        // 添加工具栏
        val dataTablePanel = ToolbarDecorator.createDecorator(dataTable).disableUpDownActions().createPanel()
        val detailTablePanel = ToolbarDecorator.createDecorator(detailTable).createPanel()

        // 布局
        layout = FlowLayout(FlowLayout.LEFT)
        add(panel {
            row("评分卡名称") { JTextField()(grow, growX) }
            row {
                dataTablePanel()
                right { detailTablePanel(grow, push) }
            }
        })
    }

    override fun getData(dataId: String?): Any? {
        return null
    }
}