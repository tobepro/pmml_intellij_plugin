package editor

import com.google.common.base.Strings
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.ui.DialogWrapper
import com.intellij.ui.components.JBTextField
import com.intellij.ui.layout.panel
import enums.DataFieldTypeEnum
import model.DataField
import javax.swing.JComponent
import javax.swing.JLabel

class FieldCreateDialog : DialogWrapper(true) {
    private val myDataField = DataField("", DataFieldTypeEnum.DOUBLE, arrayListOf())
    private val myNameText = JBTextField(1)
    private val myComboBox = ComboBox(DataFieldTypeEnum.values())

    init {
        title = "添加字段"
        myComboBox.selectedItem = DataFieldTypeEnum.DOUBLE
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
        myDataField.apply {
            name = myNameText.text
            type = myComboBox.selectedItem as DataFieldTypeEnum
        }
    }

    override fun getPreferredFocusedComponent(): JComponent? {
        return myNameText
    }

    override fun isOKActionEnabled(): Boolean {
        return !Strings.isNullOrEmpty(myNameText.text)
    }

    fun getDataField(): DataField {
        return myDataField
    }

    private fun updateOKButton() {
        okAction.isEnabled = isOKActionEnabled
    }
}