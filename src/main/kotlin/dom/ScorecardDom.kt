package dom

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.vfs.VirtualFile
import enums.DataFieldTypeEnum
import enums.OperatorEnum
import model.Attribute
import model.DataField
import model.FieldDetail
import org.dom4j.io.SAXReader
import util.MyUtil
import java.io.File

open class ScorecardDom(file: VirtualFile) {
    companion object {
        private val logger = Logger.getInstance(ScorecardDom::class.java)
        private const val FIELD_OUT_END = "Score"
    }

    private val doc = SAXReader().read(File(file.path))
    private val rootElement = doc.rootElement
    private val dicElement = rootElement.element("DataDictionary")
    private val sdElement = rootElement.element("Scorecard")
    private val miningsElement = sdElement.element("MiningSchema")
    private val charsElement = sdElement.element("Characteristics")

    open fun getFields(): List<DataField> {
        return dicElement.elements()
                .filter { it.attributeValue("name") != "finalScore" }
                .map {
                    DataField(it.attributeValue("name"),
                            getFieldType(it.attributeValue("dataType")),
                            getFieldDetailByName(it.attributeValue("name"), DataFieldTypeEnum.valueOf(it.attributeValue("dataType").toUpperCase()))
                    )
                }
    }

    private fun getFieldType(dataType: String): DataFieldTypeEnum {
        return DataFieldTypeEnum.valueOf(dataType.toUpperCase())
    }

    open fun deleteField(dataField: DataField) {
        val fieldElement = dicElement.elements()
                .first { it.attributeValue("name") == dataField.name }
        dicElement.remove(fieldElement)

        val miningFieldElement = miningsElement.elements()
                .first { it.attributeValue("name") == dataField.name }
        miningsElement.remove(miningFieldElement)

        val charElement = charsElement.elements()
                .first { it.attributeValue("name") == dataField.name + FIELD_OUT_END }
        sdElement.element("Characteristics").remove(charElement)
    }

    open fun setInitScore(score: Double) {
        sdElement.attributeValue("initialScore", score.toString())
    }

    open fun getFieldDetailByName(name: String, type: DataFieldTypeEnum): FieldDetail {
        val ele = charsElement.elements().filter {
            it.attributeValue("name") == name
        }.firstOrNull()

        val attrs = ele?.elements()?.map {
            val attr = Attribute(score = it.attributeValue("partialScore"))
            if (it.elements("CompoundPredicate").size > 0) {
                val opElements = it.element("CompoundPredicate").elements("SimplePredicate")
                attr.operatorValue = opElements.joinToString(",", "", "") { ele ->
                    ele.attributeValue("value")
                }
                if (opElements.size < 2) {
                    throw RuntimeException("field=$name attribute is empty")
                }
                attr.operator = MyUtil.getOperatorType(opElements.map { ele ->
                    ele.attributeValue("operator")
                }.toTypedArray())
            } else {
                it.element("SimplePredicate").apply {
                    attr.operator = MyUtil.getOperatorType(arrayOf(attributeValue("operator")))
                    attr.operatorValue = if (attr.operator in arrayOf(OperatorEnum.IS_MISSING, OperatorEnum.IS_NOT_MISSING))
                        "missing"
                    else
                        attributeValue("value")
                }
            }
            attr
        }?: arrayListOf(Attribute())
        return FieldDetail(name, type, attrs)
    }

}