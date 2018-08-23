package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.layout.panel
import dom.ScorecardDom
import editor.table.*
import java.awt.FlowLayout
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project: Project, module: Module, file: VirtualFile) : JPanel(), DataProvider {

    init {
        val dom = ScorecardDom(file)
        val dataFieldList = dom.getFields()
        val dataTable = DataFieldTable(dataFieldList)
        val detailTable = FieldDetailTable(dom.getFieldDetailByName(dataFieldList[0].name, dataFieldList[0].type))
        
        layout = FlowLayout(FlowLayout.LEFT)
        add(panel {
            row("评分卡名称") { JTextField()(growX, push) }
            row {
                scrollPane(dataTable)
                right { scrollPane(detailTable) }
            }
        })

    }

    override fun getData(dataId: String?): Any? {
        return null
    }
}