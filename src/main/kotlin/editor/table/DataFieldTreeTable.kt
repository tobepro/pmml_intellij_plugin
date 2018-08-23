package editor.table

import com.intellij.openapi.ui.ComboBoxTableRenderer
import com.intellij.openapi.ui.StripeTable
import com.intellij.ui.components.JBTextField
import com.intellij.ui.treeStructure.treetable.TreeTable
import enums.DataFieldTypeEnum
import model.DataField
import javax.swing.DefaultCellEditor
import javax.swing.ListSelectionModel
import javax.swing.table.TableCellRenderer
import javax.swing.tree.DefaultMutableTreeNode

class DataFieldTreeTable(private val model: DataFieldTreeTableModel) : TreeTable(model) {
    companion object {
        const val NAME_COLUMN = 0
        const val DATA_TYPE_COLUMN = 1
    }
    
    init {
        emptyText.text = "未设置字段"
        StripeTable.apply(this)
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
        
        val nameColumn = getColumnModel().getColumn(NAME_COLUMN)
        val nameCellRenderer = JBTextField().apply {
            isEnabled = false
            emptyText.text = "name"
        }
        
        nameColumn.cellRenderer = TableCellRenderer { _, value, _, _, _, _ ->
            nameCellRenderer.also {
                it.text = ((value as DefaultMutableTreeNode).userObject as DataField).name 
            }
        }
        
        val typeColumn = getColumnModel().getColumn(DATA_TYPE_COLUMN)
        typeColumn.cellRenderer = object : ComboBoxTableRenderer<DataFieldTypeEnum>(DataFieldTypeEnum.values()) {
            override fun getTextFor(value: DataFieldTypeEnum): String {
                return value.dataType
            }
        }
        typeColumn.cellEditor = object : ComboBoxTableRenderer<DataFieldTypeEnum>(DataFieldTypeEnum.values()) {
            override fun getTextFor(value: DataFieldTypeEnum): String {
                return value.dataType
            }
        }
    }
}