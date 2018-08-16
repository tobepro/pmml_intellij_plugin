package editor

import com.intellij.openapi.fileEditor.FileEditor
import com.intellij.openapi.fileEditor.FileEditorPolicy
import com.intellij.openapi.fileEditor.FileEditorProvider
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.vfs.VirtualFile

class PmmlFileEditorProvider : FileEditorProvider, DumbAware {
    override fun getEditorTypeId(): String {
        return "pmml-editor"
    }

    override fun accept(project: Project, file: VirtualFile): Boolean {
        return "pmml" == file.extension
    }

    override fun createEditor(project: Project, file: VirtualFile): FileEditor {
        return PmmlFileEditor(project, file)
    }

    override fun getPolicy(): FileEditorPolicy {
        return FileEditorPolicy.PLACE_BEFORE_DEFAULT_EDITOR
    }
}