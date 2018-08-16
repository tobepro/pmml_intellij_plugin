package editor

import com.intellij.openapi.actionSystem.DataProvider
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.ui.layout.panel
import javax.swing.JPanel

class PmmlFileEditorTab(editor: PmmlFileEditor, project : Project, module : Module, file : VirtualFile) : JPanel(), DataProvider{
    init {
        add(panel {
            row { 
                label("Hello")
            }
        })
    }
    
    override fun getData(dataId: String?): Any? {
        return null
    }
}