package editor

import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import common.Util
import editor.table.MyComboBoxTableRenderer
import enums.OperatorEnum
import model.dom.Characteristic
import model.dom.enums.BooleanOperator
import model.dom.enums.DataType
import model.dom.enums.Operator
import model.dom.enums.Type
import org.fest.util.Collections
import java.awt.Component
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class FieldDetailTable(private var fieldType: DataType, prop: Characteristic? ) : JBTable(ModelAdapter(prop)) {
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
    fun updateRows(fieldType: DataType, prop: Characteristic?) {
        (operatorModel.cellRenderer as MyComboBoxTableRenderer<OperatorEnum>).updateValues(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray())
        (operatorModel.cellEditor as MyComboBoxTableRenderer<OperatorEnum>).updateValues(OperatorEnum.values().filter { it.type.contains(fieldType) }.toTypedArray())
        model.reset(prop)
    }

    companion object {
        const val OPERATOR_COLUMN = 0
        const val OPERATOR_VALUE_COLUMN = 1
        const val SCORE_COLUMN = 2

        class ModelAdapter(private var prop: Characteristic?) : AbstractTableModel(), EditableModel {
            private var attrs = prop?.attributes
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
                    SCORE_COLUMN -> Double::class.java
                    else -> String::class.java
                }
            }

            override fun getRowCount(): Int {
                return attrs?.size?:0
            }

            override fun getColumnCount(): Int {
                return 3
            }

            override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
                return if (attrs != null && 0 <= rowIndex && rowIndex < attrs!!.size) {
                    val attr = attrs!![rowIndex]
                    when (columnIndex) {
                        OPERATOR_COLUMN -> when {
                            attr.simpleSetPredicate.exists() ->
                                OperatorEnum.valueOf(attr.simpleSetPredicate.booleanOperator.value.toString())
                            attr.simplePredicate.exists() ->
                                OperatorEnum.valueOf(attr.simplePredicate.operator.value.toString())
                            else ->
                                Util.getOperatorType(attr.compoundPredicate.simplePredicates.map { it.operator.value!!.value }.toTypedArray())
                        }
                        OPERATOR_VALUE_COLUMN -> when {
                            attr.simpleSetPredicate.exists() ->
                                attr.simpleSetPredicate.arrays.joinToString(",", "", "") { it.value }
                            attr.simplePredicate.exists() ->
                                attr.simplePredicate.value.value?: ""
                            else ->
                                attr.compoundPredicate.simplePredicates.map { it.value.value }.joinToString(",", "", "")
                        }
                        SCORE_COLUMN -> attrs!![rowIndex].partialScore.value!!
                        else -> "error"
                    }
                } else {
                    "error"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                val attr = attrs!![rowIndex]
                when {
                    attr.simpleSetPredicate.exists() -> when(columnIndex) {
                        SCORE_COLUMN ->
                            attr.partialScore.value = aValue as Double
                        OPERATOR_COLUMN ->
                            attr.simpleSetPredicate.booleanOperator.value = BooleanOperator.valueOf((aValue as OperatorEnum).toString())
                        OPERATOR_VALUE_COLUMN -> {
                            attr.simpleSetPredicate.arrays.forEach { it.undefine() }
                            (aValue as String).split(",").forEach { v ->
                                attr.simpleSetPredicate.addArray().apply {
                                    type.value = Type.STRING
                                    value = v
                                }
                            }
                        }
                    }
                    attr.simplePredicate.exists() -> when(columnIndex) {
                        SCORE_COLUMN -> attr.partialScore.value = aValue as Double
                        OPERATOR_COLUMN -> attr.simplePredicate.operator.value = Operator.valueOf((aValue as OperatorEnum).type[0].toString())
                        OPERATOR_VALUE_COLUMN -> attr.simplePredicate.value.value = aValue as String
                    }
                    attr.compoundPredicate.exists() -> when(columnIndex) {
                        SCORE_COLUMN ->
                            attr.partialScore.value = aValue as Double
                        OPERATOR_COLUMN -> {
                            (aValue as OperatorEnum).operator.forEachIndexed { index, op ->
                                attr.compoundPredicate.addSimplePredicate().apply {
                                    operator.value = Operator.values().first { it.value == op }
                                }
                            }
                        }
                        OPERATOR_VALUE_COLUMN -> {
                            val values = (aValue as String).split(",")
                            attr.compoundPredicate.simplePredicates.forEachIndexed { index, simplePredicate ->
                                simplePredicate.value.value = values[index]
                            }
                        }
                    }
                }
                fireTableCellUpdated(rowIndex, columnIndex)
            }

            override fun removeRow(idx: Int) {
                attrs!!.removeAt(idx)
                fireTableRowsDeleted(idx, idx)
            }

            override fun exchangeRows(oldIndex: Int, newIndex: Int) {
                attrs!!.add(newIndex, attrs!!.removeAt(oldIndex))
                fireTableRowsUpdated(Math.min(oldIndex, newIndex), Math.min(oldIndex, newIndex))
            }

            override fun canExchangeRows(oldIndex: Int, newIndex: Int): Boolean {
                return false
            }

            override fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean {
                return true
            }

            override fun addRow() {
                prop?.addAttribute()
                if (!Collections.isNullOrEmpty(attrs)) {
                    fireTableRowsInserted(attrs!!.size - 1, attrs!!.size - 1)
                }
            }

            fun reset(prop: Characteristic?) {
                this.prop = prop
                attrs = prop?.attributes
                fireTableDataChanged()
            }
        }

        private class SimpleRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}