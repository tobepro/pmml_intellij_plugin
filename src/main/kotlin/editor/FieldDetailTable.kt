package editor

import com.intellij.openapi.diagnostic.Logger
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import editor.table.MyComboBoxTableRenderer
import enums.DataFieldTypeEnum
import enums.OperatorEnum
import model.Attribute
import java.awt.Component
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class FieldDetailTable(private var fieldType: DataFieldTypeEnum, attrs: List<Attribute>) : JBTable(ModelAdapter(attrs)) {
    private val operatorModel = getColumnModel().getColumn(OPERATOR_COLUMN)

    init {
        autoResizeMode = JTable.AUTO_RESIZE_LAST_COLUMN
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION)

        // 设置render
        val columnModel = getColumnModel()
        operatorModel.cellRenderer = object : MyComboBoxTableRenderer<OperatorEnum>(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray()) {
            override fun getTextFor(value: OperatorEnum): String {
                return value.key
            }
        }
        operatorModel.cellEditor = object : MyComboBoxTableRenderer<OperatorEnum>(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray()) {
            override fun getTextFor(value: OperatorEnum): String {
                return value.key
            }
        }
        val operatorValueModel = columnModel.getColumn(OPERATOR_VALUE_COLUMN)
        operatorValueModel.cellRenderer = SimpleRenderer()
        val scoreModel = columnModel.getColumn(SCORE_COLUMN)
        scoreModel.cellRenderer = SimpleRenderer()
        // 空数据展示
        emptyText.text = "暂无数据"
    }

    override fun getModel(): ModelAdapter {
        return super.getModel() as ModelAdapter
    }

    @Suppress("UNCHECKED_CAST")
    fun updateRows(fieldType: DataFieldTypeEnum, attrs: List<Attribute>) {
        (operatorModel.cellRenderer as MyComboBoxTableRenderer<OperatorEnum>).updateValues(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray())
        (operatorModel.cellEditor as MyComboBoxTableRenderer<OperatorEnum>).updateValues(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray())
        model.reset(attrs)
    }

    companion object {
        private val logger = Logger.getInstance(FieldDetailTable::class.java)

        const val OPERATOR_COLUMN = 0
        const val OPERATOR_VALUE_COLUMN = 1
        const val SCORE_COLUMN = 2

        class ModelAdapter(attrs: List<Attribute>) : AbstractTableModel(), EditableModel {
            private var attrs = attrs.toMutableList()

            override fun getColumnName(column: Int): String {
                return when (column) {
                    OPERATOR_COLUMN -> "操作符"
                    OPERATOR_VALUE_COLUMN -> "值"
                    SCORE_COLUMN -> "得分"
                    else -> "其它"
                }
            }

            override fun getColumnClass(columnIndex: Int): Class<*> {
                return when (columnIndex) {
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
                    when (columnIndex) {
                        OPERATOR_COLUMN -> attrs[rowIndex].operator
                        OPERATOR_VALUE_COLUMN -> attrs[rowIndex].operatorValue
                        SCORE_COLUMN -> attrs[rowIndex].score
                        else -> "error"
                    }
                } else {
                    "error"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                when (columnIndex) {
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

            fun add(attr: Attribute) {
                attrs.add(attr)
                fireTableRowsInserted(attrs.size - 1, attrs.size - 1)
            }

            fun remove(index: Int): Attribute {
                val attr = attrs.removeAt(index)
                fireTableRowsDeleted(index, index)
                return attr
            }

            fun reset(original: List<Attribute>) {
                attrs = original.toMutableList()
                fireTableDataChanged()
            }

            fun moveUp(index: Int): Int {
                if (index > 0) {
                    val attr = attrs[index]
                    attrs.removeAt(index)
                    attrs.add(index - 1, attr)
                    fireTableRowsUpdated(index - 1, index)
                    return index - 1
                }
                return -1
            }

            fun moveDown(index: Int): Int {
                if (index > rowCount - 1) {
                    val attr = attrs[index]
                    attrs.removeAt(index)
                    attrs.add(index + 1, attr)
                    fireTableRowsUpdated(index, index + 1)
                    return index + 1
                }
                return -1
            }

            fun getAttrList(): List<Attribute> {
                return attrs
            }
        }

        private class SimpleRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}