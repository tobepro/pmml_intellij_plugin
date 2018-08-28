package editor

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.ui.ComboBoxTableRenderer
import com.intellij.ui.table.JBTable
import com.intellij.util.ui.EditableModel
import model.dom.DataDictionary
import model.dom.DataField
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
        autoResizeMode = JTable.AUTO_RESIZE_LAST_COLUMN
        setSelectionMode(ListSelectionModel.SINGLE_SELECTION)
        
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
        emptyText.text = "暂无数据"
    }

    override fun isCellEditable(row: Int, column: Int): Boolean {
//        val dataField = model.getSelectDataField(row)
//        return (selectedColumn == DATA_TYPE_COLUMN)
        return false
    }
    
    override fun getModel(): ModelAdapter {
        return super.getModel() as ModelAdapter
    }
    
    companion object {
        const val NAME_COLUMN = 0
        const val DATA_TYPE_COLUMN = 1
        
        class ModelAdapter(private val dic: DataDictionary, private val writeAction: WriteCommandAction.Builder) : AbstractTableModel(),EditableModel {
            private var dataFieldList = dic.dataFields
            
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
                        dataFieldList[rowIndex].name.value!!
                    } else {
                        dataFieldList[rowIndex].dataType.value!!
                    }
                } else {
                    "should not be happened"
                }
            }

            override fun setValueAt(aValue: Any?, rowIndex: Int, columnIndex: Int) {
                writeAction.run<Exception> {
                    when(columnIndex) {
                        NAME_COLUMN -> {
                            dataFieldList[rowIndex].name.value = aValue as String
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
                    pmml.scorecard.miningSchema.miningFields.firstOrNull{ it.name.value == name }?.undefine()
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
                return false
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
                                    DataType.DOUBLE,DataType.INTEGER -> Optype.CONTINUOUS
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
                    }
                }
                fireTableRowsInserted(dataFieldList.size -1, dataFieldList.size - 1)
            }
        }
        
        private class NameRenderer : DefaultTableCellRenderer() {
            override fun getTableCellRendererComponent(table: JTable?, value: Any?, isSelected: Boolean, hasFocus: Boolean, row: Int, column: Int): Component {
                return super.getTableCellRendererComponent(table, value, isSelected, false, row, column)
            }
        }
    }
}