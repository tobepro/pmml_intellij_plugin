package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.layout.panel
import java.awt.FlowLayout
import javax.swing.JPanel
import javax.swing.JTextField

class PmmlFileEditorTab(editor: PmmlFileEditor, project : Project, module : Module, file : VirtualFile) : JPanel(), DataProvider{
    private val textTitle = JTextField()
    private val textInitScore = JTextField()
    private val panelField = JPanel()
    init {
        val list = arrayListOf("1", "2", "3")
        
        layout = FlowLayout(FlowLayout.LEFT)
        
        add(panel {
            row("标题") { textTitle(growX, push) }
            row("数据源") {
                list.forEach { 
                    row(it) {
                        cell { JPanel() }
                    }
                }
            }
        })
    }
    
    override fun getData(dataId: String?): Any? {
        return null
    }
}