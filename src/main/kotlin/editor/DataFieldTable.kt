package editor

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.ui.ComboBoxTableRenderer
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import common.Constants
import model.dom.DataDictionary
import model.dom.PMML
import model.dom.enums.DataType
import model.dom.enums.InvalidValueTreatmentMethod
import model.dom.enums.Optype
import java.awt.Component
import javax.swing.JTable
import javax.swing.ListSelectionModel
import javax.swing.table.AbstractTableModel
import javax.swing.table.DefaultTableCellRenderer

class DataFieldTable(dic: DataDictionary, writeAction: WriteCommandAction.Builder) : JBTable(ModelAdapter(dic, writeAction)) {
    init {
        autoResizeMode = JTable.AUTO_RESIZE_NEXT_COLUMN
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
        emptyText.text = "暂无数据"

        val columnModel = getColumnModel()
        val nameColumn = columnModel.getColumn(NAME_COLUMN)
        nameColumn.cellRenderer = NameRenderer()
        val typeColumn = columnModel.getColumn(DATA_TYPE_COLUMN)
        typeColumn.cellRenderer = object : ComboBoxTableRenderer<DataType>(DataType.values()) {
            override fun getTextFor(value: DataType): String {
                return value.value
            }
        }
        typeColumn.cellEditor = object : ComboBoxTableRenderer<DataType>(DataType.values()) {
            override fun getTextFor(value: DataType): String {
                return value.value
            }
        }
        
    }

    override fun getModel(): ModelAdapter {
        return super.getModel() as ModelAdapter
    }

    companion object {
        const val NAME_PRE_COLUMN = 0
        const val NAME_COLUMN = 1
        const val DATA_TYPE_COLUMN = 2

        class ModelAdapter(private val dic: DataDictionary, private val writeAction: WriteCommandAction.Builder) : AbstractTableModel(), EditableModel {
            private var dataFieldList = dic.dataFields

            override fun getColumnName(column: Int): String {
                return when(column) {
                    NAME_PRE_COLUMN -> "类"
                    NAME_COLUMN -> "字段名"
                    else -> "类型"
                }
            }

            override fun getRowCount(): Int {
                return dataFieldList.size
            }

            override fun getColumnCount(): Int {
                return 3
            }

            override fun getValueAt(rowIndex: Int, columnIndex: Int): Any {
                return if (0 <= rowIndex && rowIndex < dataFieldList.size) {
                    when (columnIndex) {
                        NAME_PRE_COLUMN -> dataFieldList[rowIndex].name.value!!.split(".")[0]
                        NAME_COLUMN -> dataFieldList[rowIndex].name.value!!.run { if (contains(".")) split(".")[1] else "" }
                        else -> dataFieldList[rowIndex].dataType.value!!
                    }
                } else {
                    "should not be happened"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                writeAction.run<Exception> {
                    when (columnIndex) {
                        NAME_PRE_COLUMN, NAME_COLUMN -> {
                            val name = "${getValueAt(rowIndex, NAME_PRE_COLUMN)}.${aValue as String}"
                            val oldName = "${getValueAt(rowIndex, NAME_PRE_COLUMN)}.${getValueAt(rowIndex, NAME_COLUMN)}"
                            dataFieldList[rowIndex].name.value = name
                            val pmml = dic.parent as PMML
                            pmml.scorecard.miningSchema.miningFields.firstOrNull { it.name.value == oldName }?.name?.value = name
                            val characteristic = pmml.scorecard.characteristics.characteristics.firstOrNull { it.name.value == oldName }
                            characteristic?.apply {
                                attributes.forEach { attr ->
                                    if (attr.simplePredicate.exists()) {
                                        attr.simplePredicate.field.value = name
                                    }
                                    if (attr.simpleSetPredicate.exists()) {
                                        attr.simpleSetPredicate.field.value = name
                                    }
                                    if (attr.compoundPredicate.exists()) {
                                        attr.compoundPredicate.simplePredicates.forEach {
                                            it.field.value = name
                                        }
                                    }
                                }
                                this.name.value = name
                            }
                        }
                        DATA_TYPE_COLUMN -> {
                            dataFieldList[rowIndex].dataType.value = aValue as DataType
                        }
                    }
                }
                fireTableCellUpdated(rowIndex, columnIndex)
            }

            override fun removeRow(idx: Int) {
                writeAction.run<Exception> {
                    val name = dic.dataFields[idx].name.value
                    dic.dataFields[idx].undefine()
                    dataFieldList = dic.dataFields

                    val pmml = dic.parent as PMML
                    pmml.scorecard.miningSchema.miningFields.firstOrNull { it.name.value == name }?.undefine()
                    pmml.scorecard.characteristics.characteristics.firstOrNull { it.name.value == name }?.undefine()
                }
                fireTableRowsDeleted(idx, idx)
            }

            override fun exchangeRows(oldIndex: Int, newIndex: Int) {
                dataFieldList.add(newIndex, dataFieldList.removeAt(oldIndex))
                fireTableRowsUpdated(Math.min(oldIndex, newIndex), Math.max(oldIndex, newIndex))
            }

            override fun canExchangeRows(oldIndex: Int, newIndex: Int): Boolean {
                return false
            }

            override fun getColumnClass(columnIndex: Int): Class<*> {
                return if (DATA_TYPE_COLUMN == columnIndex) DataType::class.java else String::class.java
            }

            override fun isCellEditable(rowIndex: Int, columnIndex: Int): Boolean {
                return DATA_TYPE_COLUMN != columnIndex
                        && NAME_PRE_COLUMN != columnIndex
                        && getValueAt(rowIndex, NAME_PRE_COLUMN) != Constants.FINAL_SCORE_FIELD
                        && getValueAt(rowIndex, NAME_COLUMN) != Constants.FINAL_SCORE_FIELD
            }

            override fun addRow() {
                FieldCreateDialog().run {
                    show()
                    if (exitCode == 0) {
                        val fieldDialog = getDataField()
                        writeAction.run<Exception> {
                            val pmml = dic.parent as PMML
                            dic.addDataField().apply {
                                name.value = fieldDialog.name
                                dataType.value = fieldDialog.dataType
                                optype.value = when (fieldDialog.dataType) {
                                    DataType.STRING -> Optype.CATEGORICAL
                                    DataType.DOUBLE, DataType.INTEGER -> Optype.CONTINUOUS
                                    else -> Optype.CATEGORICAL
                                }
                            }
                            pmml.scorecard.characteristics.addCharacteristic().apply {
                                name.value = fieldDialog.name
                                reasonCode.value = fieldDialog.name
                                baselineScore.value = 0.0
                            }
                            pmml.scorecard.miningSchema.addMiningField().apply {
                                name.value = fieldDialog.name
                                invalidValueTreatment.value = InvalidValueTreatmentMethod.AS_MISSING
                            }

                            dataFieldList = dic.dataFields
                        }
                        fireTableRowsInserted(dataFieldList.size - 1, dataFieldList.size - 1)
                    }
                }
            }
        }

        private class NameRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}