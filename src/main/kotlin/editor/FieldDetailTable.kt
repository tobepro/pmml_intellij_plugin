package editor

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import editor.table.MyComboBoxTableRenderer
import enums.OperatorEnum
import model.dom.Characteristic
import model.dom.enums.*
import org.fest.util.Collections
import util.TypeUtil
import java.awt.Component
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class FieldDetailTable(private var fieldType: DataType, prop: Characteristic?, writeAction: WriteCommandAction.Builder) : JBTable(ModelAdapter(prop, writeAction)) {
    private val operatorModel = getColumnModel().getColumn(OPERATOR_COLUMN)

    init {
        // 表格设置
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

    // 更新详情数据
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

        class ModelAdapter(private var prop: Characteristic?, private val writeAction: WriteCommandAction.Builder) : AbstractTableModel(), EditableModel {
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
                    SCORE_COLUMN -> String::class.java
                    else -> String::class.java
                }
            }

            override fun getRowCount(): Int {
                return attrs?.size ?: 0
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
                                TypeUtil.getOperatorType(attr.compoundPredicate.simplePredicates.map { it.operator.value!!.value }.toTypedArray())
                        }
                        OPERATOR_VALUE_COLUMN -> when {
                            attr.simpleSetPredicate.exists() ->
                                attr.simpleSetPredicate.array.value
                            attr.simplePredicate.exists() ->
                                attr.simplePredicate.value.value ?: ""
                            else ->
                                attr.compoundPredicate.simplePredicates.map { it.value.value }.joinToString(",", "", "")
                        }
                        SCORE_COLUMN -> attrs!![rowIndex].partialScore.value!!.toString()
                        else -> "error"
                    }
                } else {
                    "error"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                val attr = attrs!![rowIndex]
                writeAction.run<Exception> {
                    when (columnIndex) {
                        SCORE_COLUMN -> attr.partialScore.value = (aValue as String).toDouble()
                        OPERATOR_COLUMN -> {
                            val opType = (aValue as OperatorEnum)
                            val opValue = getValueAt(rowIndex, OPERATOR_VALUE_COLUMN) as String
                            when {
                                opType in arrayOf(OperatorEnum.IS_IN, OperatorEnum.IS_NOT_IN) -> {
                                    attr.simpleSetPredicate.apply {
                                        field.value = prop!!.name.value
                                        booleanOperator.value = SimpleBooleanOperator.valueOf(opType.toString())
                                        array.type.value = Type.STRING
                                        array.value = opValue
                                    }
                                    if (attr.simplePredicate.exists()) {
                                        attr.simplePredicate.undefine()
                                    }
                                    if (attr.compoundPredicate.exists()) {
                                        attr.compoundPredicate.undefine()
                                    }
                                }
                                opType.operator.size == 1 -> {
                                    attr.simplePredicate.apply {
                                        field.value = prop!!.name.value
                                        operator.value = Operator.valueOf(opType.toString())
                                        value.value = opValue
                                    }
                                    if (attr.simpleSetPredicate.exists()) {
                                        attr.simpleSetPredicate.undefine()
                                    }
                                    if (attr.compoundPredicate.exists()) {
                                        attr.compoundPredicate.undefine()
                                    }
                                }
                                else -> {
                                    if (attr.simplePredicate.exists()) {
                                        attr.simplePredicate.undefine()
                                    }
                                    if (attr.simpleSetPredicate.exists()) {
                                        attr.simpleSetPredicate.undefine()
                                    }

                                    attr.compoundPredicate.apply {
                                        booleanOperator.value = CompoundBooleanOperator.AND
                                        if (simplePredicates.size > 0) {
                                            simplePredicates.forEach { it.undefine() }
                                        }
                                        val opValueArray = opValue.split(",")
                                        opType.operator.forEachIndexed { index, s ->
                                            addSimplePredicate().apply {
                                                field.value = prop!!.name.value
                                                operator.value = Operator.values().first { it.value == s }
                                                value.value = if (opValueArray.size > 1) opValueArray[index] else ""
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        OPERATOR_VALUE_COLUMN -> {
                            val opType = getValueAt(rowIndex, OPERATOR_COLUMN) as OperatorEnum
                            val opValue = (aValue as String)
                            when {
                                opType in arrayOf(OperatorEnum.IS_IN, OperatorEnum.IS_NOT_IN) -> {
                                    attr.simpleSetPredicate.array.value = opValue
                                }
                                opType.operator.size == 1 -> {
                                    attr.simplePredicate.value.value = opValue
                                }
                                else -> {
                                    attr.compoundPredicate.simplePredicates.forEachIndexed { index, simplePredicate ->
                                        simplePredicate.value.value = opValue.split(",")[index]
                                    }
                                }
                            }
                        }
                    }
                }

                fireTableCellUpdated(rowIndex, columnIndex)
            }

            override fun removeRow(idx: Int) {
                writeAction.run<Exception> {
                    prop!!.attributes[idx].undefine()
                    attrs = prop!!.attributes
                }
                fireTableRowsDeleted(idx, idx)
            }

            // 暂时不允许调顺序
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
                writeAction.run<Exception> {
                    prop?.addAttribute()!!.apply { 
                        partialScore.value = 0.0
                        simplePredicate.apply { 
                            field.value = prop!!.name.value
                            operator.value = Operator.EQUAL
                            value.value = ""
                        }
                        attrs = prop!!.attributes
                    }
                }
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