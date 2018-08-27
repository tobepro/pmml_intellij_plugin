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
import model.dom.Characteristic
import model.dom.DataField
import model.dom.PMML
import java.awt.FlowLayout
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project: Project, module: Module, file: VirtualFile) : JPanel(), DataProvider {
    private val logger = Logger.getInstance(PmmlFileEditorTab::class.java)
    private var pmml: PMML
    private var dataTable: DataFieldTable
    private var detailTable: FieldDetailTable
    private var dataFieldList: List<DataField>
    private var characteristics: List<Characteristic>

    init {
        val document = FileDocumentManager.getInstance().getDocument(file)
        val psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document!!)
        val manager = DomManager.getDomManager(project)
        manager.registerFileDescription(DomFileDescription(PMML::class.java, "PMML"))
        pmml = manager
                .getFileElement(psiFile as XmlFile, PMML::class.java)!!
                .rootElement

        // 初始化参数列表
        dataTable = DataFieldTable(pmml.dataDictionary)
        dataFieldList = pmml.dataDictionary.dataFields
        characteristics = pmml.scorecard.characteristics.characteristics
        dataTable.setRowSelectionInterval(0, 0)

        // 初始化详情数据
        val field = dataFieldList[0]
        val type = field.dataType.value!!
        detailTable = FieldDetailTable(type, characteristics.first { it.name.value == field.name.value })

        // 字段选择变动时更新字段详情
        dataTable.selectionModel.addListSelectionListener { e ->
            val rowNum = if (dataTable.selectedRow < 0) e.firstIndex else dataTable.selectedRow
            detailTable.updateRows(dataFieldList[rowNum].dataType.value!!, characteristics.firstOrNull { it.name.value == dataFieldList[rowNum].name.value!! })
        }

        // 实时保存字段详情
//        @Suppress("UNCHECKED_CAST")
//        detailTable.model.addTableModelListener { e ->
//            if (dataTable.selectedRow >= 0) {
//            }
//        }

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

//    private fun saveAttrsByName(name: String, attrs: List<Attribute>) {
//        val fieldType = pmml.dataDictionary.dataFields.first { it.name.value == name }.dataType.value
//        pmml.scorecard.characteristics.characteristics.first { it.name.value == name }.undefine()
//        pmml.scorecard
//                .characteristics
//                .addCharacteristic()
//                .apply {
//            this.name.value = name
//            reasonCode.value = name
//            baselineScore.value = 0.0
//            attrs.forEach { attr ->
//                addAttribute().let { a ->
//                    a.partialScore.value = attr.score
//                    when {
//                        attr.operator in arrayOf(OperatorEnum.IS_IN, OperatorEnum.IS_NOT_IN) ->
//                            a.addSimpleSetPredicate().apply {
//                                dataField.value = name
//                                booleanOperator.value = BooleanOperator.valueOf(attr.operator.toString())
//                                attr.operatorValue.split(",").forEach { v ->
//                                    addArray().apply {
//                                        type.value = when (fieldType) {
//                                            DataType.DOUBLE -> Type.REAL
//                                            DataType.INTEGER -> Type.INT
//                                            DataType.STRING -> Type.STRING
//                                            else -> Type.STRING
//                                        }
//                                        value = v
//                                    }
//                                }
//                            }
//                        attr.operator.type.size == 1 ->
//                            a.addSimplePredicate().apply {
//                                dataField.value = name
//                                operator.value = Operator.valueOf(attr.operator.type[0].toString())
//                                value.value = attr.operatorValue
//                            }
//                        else ->
//                            a.addCompoundPredicate().apply {
//                                attr.operator.type.forEachIndexed { index, opType ->
//                                    addSimplePredicate().apply {
//                                        dataField.value = name
//                                        operator.value = Operator.valueOf(opType.toString())
//                                        value.value = attr.operatorValue.split(",")[index]
//                                    }
//                                }
//                            }
//                    }
//                }
//            }
//        }
//    }

    override fun getData(dataId: String?): Any? {
        return null
    }
}