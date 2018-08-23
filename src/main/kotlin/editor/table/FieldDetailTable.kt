package editor.table

import com.intellij.openapi.ui.ComboBoxTableRenderer
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import enums.OperatorEnum
import model.Attribute
import model.FieldDetail
import java.awt.Component
import javax.swing.JTable
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class FieldDetailTable(detail : FieldDetail) : JBTable(ModelAdapter(detail)){
    init {
        autoResizeMode = JTable.AUTO_RESIZE_LAST_COLUMN
        val columnModel = getColumnModel()
        val operatorModel = columnModel.getColumn(OPERATOR_COLUMN)
        operatorModel.cellRenderer = object : ComboBoxTableRenderer<OperatorEnum>(OperatorEnum.values().filter { it.type.contains(detail.type) }.toTypedArray()) {
            override fun getTextFor(value: OperatorEnum): String {
                return value.key
            }
        }
        operatorModel.cellEditor = object : ComboBoxTableRenderer<OperatorEnum>(OperatorEnum.values().filter { it.type.contains(detail.type) }.toTypedArray()) {
            override fun getTextFor(value: OperatorEnum): String {
                return value.key
            }
        }
        val operatorValueModel = columnModel.getColumn(OPERATOR_VALUE_COLUMN)
        operatorValueModel.cellRenderer = SimpleRenderer()
        val scoreModel = columnModel.getColumn(SCORE_COLUMN)
        scoreModel.cellRenderer = SimpleRenderer()
    }
    
    companion object {
        const val OPERATOR_COLUMN = 0
        const val OPERATOR_VALUE_COLUMN = 1
        const val SCORE_COLUMN = 2
        
        class ModelAdapter(private val detail: FieldDetail) : AbstractTableModel(), EditableModel {
            private val attrs = detail.attrs.toMutableList()
            
            override fun getColumnName(column: Int): String {
                return when(column) {
                    OPERATOR_COLUMN -> "操作符"
                    OPERATOR_VALUE_COLUMN -> "值"
                    SCORE_COLUMN -> "得分"
                    else -> "其它"
                }
            }

            override fun getColumnClass(columnIndex: Int): Class<*> {
                return when(columnIndex) {
                    OPERATOR_COLUMN -> OperatorEnum::class.java
                    OPERATOR_VALUE_COLUMN -> String::class.java
                    SCORE_COLUMN -> String::class.java
                    else -> String::class.java
                }
            }
            
            override fun getRowCount(): Int {
                return attrs.size
            }

            override fun getColumnCount(): Int {
                return 3
            }

            override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
                return if (0 <= rowIndex && rowIndex < attrs.size) {
                    when(columnIndex) {
                        OPERATOR_COLUMN -> attrs[rowIndex].operator.key
                        OPERATOR_VALUE_COLUMN -> attrs[rowIndex].operatorValue
                        SCORE_COLUMN -> attrs[rowIndex].score
                        else -> "error"
                    }
                } else {
                    "error"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                when(columnIndex) {
                    OPERATOR_COLUMN -> attrs[rowIndex].operator = aValue as OperatorEnum
                    OPERATOR_VALUE_COLUMN -> attrs[rowIndex].operatorValue = aValue as String
                    SCORE_COLUMN -> attrs[rowIndex].score = aValue as String
                }
                fireTableCellUpdated(rowIndex, columnIndex)
            }

            override fun removeRow(idx: Int) {
                attrs.removeAt(idx)
                fireTableRowsDeleted(idx, idx)
            }

            override fun exchangeRows(oldIndex: Int, newIndex: Int) {
                attrs.add(newIndex, attrs.removeAt(oldIndex))
                fireTableRowsUpdated(Math.min(oldIndex, newIndex), Math.min(oldIndex, newIndex))
            }

            override fun canExchangeRows(oldIndex: Int, newIndex: Int): Boolean {
                return true
            }

            override fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean {
                return true
            }

            override fun addRow() {
                val attr = Attribute("", OperatorEnum.EQUAL, "")
                attrs.add(attr)
                fireTableRowsInserted(attrs.size - 1, attrs.size - 1)
            }
            
            fun getFieldDetail() : FieldDetail {
                return FieldDetail(detail.name, detail.type, attrs)
            }
            
            fun add(attr : Attribute) {
                attrs.add(attr)
                fireTableRowsInserted(attrs.size - 1, attrs.size - 1)
            }
            
            fun remove(index : Int) : Attribute {
                val attr = attrs.removeAt(index)
                fireTableRowsDeleted(index, index)
                return attr
            }
            
            fun reset(original : FieldDetail) {
                detail.apply { 
                    name = original.name
                    type = original.type
                }
                attrs.clear()
                attrs.addAll(original.attrs)
            }
            
            fun moveUp(index: Int) : Int {
                if (index > 0) {
                    val attr = attrs[index]
                    attrs.removeAt(index)
                    attrs.add(index - 1, attr)
                    fireTableRowsUpdated(index - 1, index)
                    return index - 1
                }
                return -1
            }
            
            fun moveDown(index : Int) : Int {
                if (index > rowCount - 1) {
                    val attr = attrs[index]
                    attrs.removeAt(index)
                    attrs.add(index + 1, attr)
                    fireTableRowsUpdated(index, index + 1)
                    return index + 1
                }
                return -1
            }
        }
        
        private class SimpleRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}