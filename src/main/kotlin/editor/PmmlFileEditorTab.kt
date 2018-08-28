package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.command.WriteCommandAction
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
import common.Constants
import model.dom.Characteristic
import model.dom.DataField
import model.dom.PMML
import model.dom.enums.DataType
import java.awt.FlowLayout
import javax.swing.JLabel
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project: Project, module: Module, file: VirtualFile) : JPanel(), DataProvider {
    private val logger = Logger.getInstance(PmmlFileEditorTab::class.java)
    private val document = FileDocumentManager.getInstance().getDocument(file)
    private val psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document!!)
    private val manager = DomManager.getDomManager(project)
    private val writeAction = WriteCommandAction.writeCommandAction(project, psiFile)
    private val pmml: PMML
    private val dataTable: DataFieldTable
    private val detailTable: FieldDetailTable
    private var dataFieldList: List<DataField>
    private var characteristics: List<Characteristic>
    private val scorecardName = JTextField()
    private val initScoreText = JTextField()

    init {
        manager.registerFileDescription(DomFileDescription(PMML::class.java, "PMML"))
        pmml = manager.getFileElement(psiFile as XmlFile, PMML::class.java)!!.rootElement

        // 初始化参数列表
        dataTable = DataFieldTable(pmml.dataDictionary, writeAction)
        dataFieldList = pmml.dataDictionary.dataFields.filter { it.name.value != Constants.FINAL_SCORE_FIELD }
        characteristics = pmml.scorecard.characteristics.characteristics
        dataTable.setRowSelectionInterval(0, 0)

        // 初始化详情数据
        val type = if (dataFieldList.isNotEmpty()) {
            dataFieldList[0].dataType.value!!
        } else {
            DataType.INTEGER
        }
        val name = if (dataFieldList.isNotEmpty()) {
            dataFieldList[0].name.value!!
        } else {
            ""
        }
        
        detailTable = FieldDetailTable(type, characteristics.firstOrNull { it.name.value == name }, writeAction)

        // 添加工具栏
        val dataTablePanel = ToolbarDecorator.createDecorator(dataTable).disableUpDownActions().createPanel()
        val detailTablePanel = ToolbarDecorator.createDecorator(detailTable).disableUpDownActions().createPanel()

        // 布局
        layout = FlowLayout(FlowLayout.LEFT)
        add(panel {
            row("名称") { 
                scorecardName(grow, push)
            }
            row("初始分") {
                initScoreText(grow, growX)
            }
            row {
                dataTablePanel()
                right { detailTablePanel(grow, push) }
            }
        })

        // 字段选择变动时监听器
        dataTable.selectionModel.addListSelectionListener { e ->
            dataFieldList = pmml.dataDictionary.dataFields
            characteristics = pmml.scorecard.characteristics.characteristics

            val rowNum = if (dataTable.selectedRow < 0) e.firstIndex else dataTable.selectedRow
            detailTable.updateRows(dataFieldList[rowNum].dataType.value!!, characteristics.firstOrNull { it.name.value == dataFieldList[rowNum].name.value!! })
        }
        
        initScoreText.addActionListener {
            writeAction.run<Exception> {
                pmml.scorecard.initialScore.value = initScoreText.text.toDouble()
            }
        }
        scorecardName.addActionListener {
            writeAction.run<Exception> { 
                pmml.scorecard.modelName.value = scorecardName.text
            }
        }
    }

    override fun getData(dataId: String?): Any? {
        return null
    }
}