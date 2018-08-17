package dom

import com.intellij.openapi.vfs.VirtualFile
import model.Field
import org.dom4j.Element
import org.dom4j.io.SAXReader
import java.io.File

open class ScorecardDom(file : VirtualFile) {
    companion object {
        private const val FIELD_OUT_END = "Score"
    }
    
    private val doc = SAXReader().read(File(file.path))
    private val rootElement = doc.rootElement
    private val dicElement = rootElement.element("DataDictionary")
    private val sdElement = rootElement.element("Scorecard")
    private val miningsElement = sdElement.element("MiningSchema")
    private val charsElement = sdElement.element("Characteristics")

    open fun getFields() : List<Field> {
        return dicElement.elements().map {
            Field(it.attributeValue("name"),
                    it.attributeValue("optype"),
                    it.attributeValue("dataType"),
                    it.attributeValue("displayName"))
        }
    }

    open fun updateField(field: Field) {
        dicElement.elements()
                .filter { it.name == field.name }
                .forEach {
                    it.apply {
                        addAttribute("optype", field.optype)
                        addAttribute("dataType", field.dataType)
                        addAttribute("displayName", field.displayName)
                    }
                }
    }

    open fun addField(field: Field) {
        dicElement.addElement("DataField").apply {
            addAttribute("name", field.name)
            addAttribute("optype", field.optype)
            addAttribute("dataType", field.dataType)
            addAttribute("displayName", field.displayName)
        }

        miningsElement.addElement("MinindField").apply {
            addAttribute("name", field.name)
            addAttribute("invalidValueTreatment", "asMissing")
        }

        charsElement.addElement("Characteristic").apply {
            addAttribute("name", field.name + FIELD_OUT_END)
            addAttribute("reasonCode", field.name + FIELD_OUT_END)
            addAttribute("baselineScore", "0")
        }
    }

    open fun deleteField(field: Field) {
        val fieldElement = dicElement.elements()
                .first { it.attributeValue("name") == field.name }
        dicElement.remove(fieldElement)

        val miningFieldElement = miningsElement.elements()
                .first { it.attributeValue("name") == field.name }
        miningsElement.remove(miningFieldElement)
        
        val charElement = charsElement.elements()
                .first { it.attributeValue("name") == field.name + FIELD_OUT_END }
        sdElement.element("Characteristics").remove(charElement)
    }
    
    open fun updateCharElement(fieldName: String, elements: List<Element>) {
        val charElement = charsElement.elements()
                .first { it.attributeValue("name") == fieldName + FIELD_OUT_END }
        charElement.selectNodes("/Attribute")
                .forEach { charElement.remove(it) }
        elements.forEach(charElement::add)
    }
    
    open fun setInitScore(score: Double) {
        sdElement.attributeValue("initialScore", score.toString())
    }
}