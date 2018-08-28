package editor

import com.google.common.base.Strings
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBTextField
import com.intellij.ui.layout.panel
import model.FieldDialog
import model.dom.enums.DataType
import javax.swing.JComponent
import javax.swing.JLabel

class FieldCreateDialog : DialogWrapper(true) {
    private var myFieldData = FieldDialog("", DataType.DOUBLE)
    private val myNameText = JBTextField(1)
    private val myComboBox = ComboBox(DataType.values().map { it.value }.toTypedArray())

    init {
        title = "添加字段"
        myComboBox.selectedItem = DataType.DOUBLE
        setResizable(false)
        init()
    }

    override fun createCenterPanel(): JComponent? {
        myNameText.addActionListener { _ ->
            updateOKButton()
        }

        val nameLabel = JLabel("字段名")
        nameLabel.labelFor = myNameText
        val typeLabel = JLabel("类型")
        typeLabel.labelFor = myComboBox

        return panel {
            row {
                cell {
                    nameLabel(grow, push)
                    myNameText(grow, push)
                }
            }
            row {
                cell {
                    typeLabel(grow, push)
                    myComboBox(grow, push)
                }
            }
        }
    }

    override fun doOKAction() {
        close(OK_EXIT_CODE)
        myFieldData.apply { 
            name = myNameText.text
            dataType = myComboBox.selectedItem as DataType
        }
    }

    override fun getPreferredFocusedComponent(): JComponent? {
        return myNameText
    }

    override fun isOKActionEnabled(): Boolean {
        return !Strings.isNullOrEmpty(myNameText.text)
    }

    fun getDataField(): FieldDialog {
        return myFieldData
    }

    private fun updateOKButton() {
        okAction.isEnabled = isOKActionEnabled
    }
}