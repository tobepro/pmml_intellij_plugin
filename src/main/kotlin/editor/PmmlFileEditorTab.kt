package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.ToolbarDecorator
import com.intellij.ui.layout.panel
import dom.ScorecardDom
import enums.DataFieldTypeEnum
import java.awt.FlowLayout
import java.awt.event.FocusEvent
import java.awt.event.FocusListener
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project: Project, module: Module, file: VirtualFile) : JPanel(), DataProvider {
    private val logger = Logger.getInstance(PmmlFileEditorTab::class.java)

    init {
        val dom = ScorecardDom(file)
        var dataFieldList = dom.getFields()
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
                dom.save(dataFieldList)
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