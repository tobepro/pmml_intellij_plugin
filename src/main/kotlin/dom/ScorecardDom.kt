package dom

import com.intellij.openapi.vfs.VirtualFile
import model.Field
import org.dom4j.Element
import org.dom4j.io.SAXReader
import java.io.File

open class ScorecardDom(file : VirtualFile) {
    private val rootElement = SAXReader().read(File(file.path)).rootElement
    private val dicElement = rootElement.element("DataDictionary")
    private val sdElement = rootElement.element("Scorecard")

    open fun getFields() : List<Field> {
        return dicElement.elements("DataField").filterIsInstance<Element>().map {
            Field(it.attributeValue("name"),
                    it.attributeValue("optype"),
                    it.attributeValue("dataType"),
                    it.attributeValue("displayName"))
        }
    }

    open fun updateField(field: Field) {
        dicElement.elements("DataField")
                .filterIsInstance<Element>()
                .filter { it.name == field.name }
                .forEach {
                    it.apply {
                        setAttributeValue("name", field.name)
                        setAttributeValue("optype", field.optype)
                        setAttributeValue("dataType", field.dataType)
                        setAttributeValue("displayName", field.displayName)
                    }
                }
    }

    open fun addField(field: Field) {
        dicElement.addElement("DataField").apply {
            setAttributeValue("name", field.name)
            setAttributeValue("optype", field.optype)
            setAttributeValue("dataType", field.dataType)
            setAttributeValue("displayName", field.displayName)
        }

        sdElement.apply {
            element("MiningSchema").addElement("MinindField").apply {
                attributeValue("name", field.name)
                attributeValue("invalidValueTreatment", "asMissing")
            }

            element("Output").addElement("OutputField").apply {
                attributeValue("name", field.name + "Score")
                attributeValue("rank", )
            }

            element("Characteristics").addElement("Characteristic").apply {
                attributeValue("name", field.name + "Score")
                attributeValue("reasonCode", field.name + "ReasonCode")
            }
        }

    }

    open fun deleteField(field: Field) {
        val fieldElement = dicElement.elements("DataField")
                .filterIsInstance<Element>()
                .filter { it.attributeValue("name") == field.name }
                .first()
        dicElement.remove(fieldElement)

        val miningElement = sdElement.element("MiningSchema")
                .elements("MinindField")
                .filter { it.attributeValue("name") == field.name }
                .first()
        sdElement.element("MiningSchema").remove(miningElement)
    }
}