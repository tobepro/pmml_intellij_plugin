package editor

import com.intellij.openapi.ui.ComboBoxTableRenderer
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import enums.DataFieldTypeEnum
import model.DataField
import java.awt.Component
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class DataFieldTable(private val dataFieldList: List<DataField>) : JBTable(ModelAdapter(dataFieldList.toMutableList())) {
    init {
        autoResizeMode = JTable.AUTO_RESIZE_LAST_COLUMN
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
        
        val columnModel = getColumnModel()
        val nameColumn = columnModel.getColumn(NAME_COLUMN)
        nameColumn.cellRenderer = NameRenderer()
        val typeColumn = columnModel.getColumn(DATA_TYPE_COLUMN)
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
        emptyText.text = "暂无数据"
    }

    override fun isCellEditable(row: Int, column: Int): Boolean {
        val dataField = model.getSelectDataField(row)
        return (selectedColumn == DATA_TYPE_COLUMN && dataField.attrs.isEmpty())
    }
    
    override fun getModel(): ModelAdapter {
        return super.getModel() as ModelAdapter
    }
    
    companion object {
        const val NAME_COLUMN = 0
        const val DATA_TYPE_COLUMN = 1
        
        class ModelAdapter(private val dataFieldList : MutableList<DataField>) : AbstractTableModel(),EditableModel {
            override fun getColumnName(column: Int): String {
                return if (column == NAME_COLUMN) "字段名" else "数据类型"
            }
            override fun getRowCount(): Int {
                return dataFieldList.size
            }

            override fun getColumnCount(): Int {
                return 2
            }

            override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
                return if (0 <= rowIndex && rowIndex < dataFieldList.size) {
                    if (columnIndex == NAME_COLUMN) {
                        dataFieldList[rowIndex].name
                    } else {
                        dataFieldList[rowIndex].type
                    }
                } else {
                    "should not be happened"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                when(columnIndex) {
                    NAME_COLUMN -> {
                        dataFieldList[rowIndex].name = aValue as String
                    }
                    DATA_TYPE_COLUMN -> {
                        dataFieldList[rowIndex].type = aValue as DataFieldTypeEnum
                    }
                }
                fireTableCellUpdated(rowIndex, columnIndex)
            }

            override fun removeRow(idx: Int) {
                dataFieldList.removeAt(idx)
                fireTableRowsDeleted(idx, idx)
            }

            override fun exchangeRows(oldIndex: Int, newIndex: Int) {
                dataFieldList.add(newIndex, dataFieldList.removeAt(oldIndex))
                fireTableRowsUpdated(Math.min(oldIndex, newIndex), Math.max(oldIndex, newIndex))
            }

            override fun canExchangeRows(oldIndex: Int, newIndex: Int): Boolean {
                return true
            }

            override fun getColumnClass(columnIndex: Int): Class<*> {
                return if (DATA_TYPE_COLUMN == columnIndex) DataFieldTypeEnum::class.java else String::class.java
            }

            override fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean {
                return columnIndex == DATA_TYPE_COLUMN
            }

            override fun addRow() {
                FieldCreateDialog().run { 
                    show()
                    if (exitCode == 0) {
                        add(getDataField())
                    }
                }
            }
            
            fun getAllDataField() : MutableList<DataField> {
                return dataFieldList
            }
            
            fun add(dataField : DataField) {
                dataFieldList.add(dataField)
                fireTableRowsInserted(dataFieldList.size - 1, dataFieldList.size - 1)
            }
            
            fun remove(index : Int) : DataField {
                val dataField = dataFieldList.removeAt(index)
                fireTableRowsDeleted(index, index)
                return dataField
            }
            
            fun reset(original : List<DataField>) {
                dataFieldList.clear()
                dataFieldList.addAll(original)
                fireTableDataChanged()
            }
            
            fun moveUp(index : Int) : Int {
                if (index > 0) {
                    val dataField = dataFieldList[index]
                    dataFieldList.removeAt(index)
                    dataFieldList.add(index - 1, dataField)
                    fireTableRowsUpdated(index - 1, index)
                    return index - 1
                }
                return -1
            }
            
            fun moveDown(index : Int) : Int {
                if (index > rowCount - 1) {
                    val dataField = dataFieldList[index]
                    dataFieldList.removeAt(index)
                    dataFieldList.add(index + 1, dataField)
                    fireTableRowsUpdated(index, index + 1)
                    return index + 1
                }
                return -1
            }
            
            fun getSelectDataField(row : Int) : DataField {
                return dataFieldList[row]
            }
        }
        
        private class NameRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}