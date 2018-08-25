package dom

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.vfs.VirtualFile
import common.Constants
import common.Util
import enums.DataFieldTypeEnum
import enums.OperatorEnum
import model.Attribute
import model.DataField
import org.dom4j.dom.DOMElement
import org.dom4j.io.SAXReader
import java.io.File

open class ScorecardDom(file: VirtualFile) {
    companion object {
        private val logger = Logger.getInstance(ScorecardDom::class.java)
    }

    private val doc = SAXReader().read(File(file.path))
    private val rootElement = doc.rootElement
    private val dicElement = rootElement.element("DataDictionary")
    private val sdElement = rootElement.element("Scorecard")
    private val miningsElement = sdElement.element("MiningSchema")
    private val charsElement = sdElement.element("Characteristics")

    open fun getFields(): List<DataField> {
        return dicElement.elements()
                .filter { it.attributeValue("name") != Constants.FINAL_SCORE_FIELD }
                .map {
                    DataField(it.attributeValue("name"),
                            getFieldType(it.attributeValue("dataType")),
                            getFieldDetailByName(it.attributeValue("name"), DataFieldTypeEnum.valueOf(it.attributeValue("dataType").toUpperCase()))
                    )
                }
    }

    open fun save(fieldList: List<DataField>) {
        // DataDictionary 组装
        dicElement.selectNodes("/DataField").forEach { dicElement.remove(it) }
        fieldList.map {
            DOMElement("DataField").apply {
                attributeValue("name", it.name)
                attributeValue("optype", it.type.opType)
                attributeValue("dataType", it.type.dataType)
            }
        }.forEach { dicElement.add(it) }
        dicElement.add(DOMElement("finalScore").apply {
            attributeValue("optype", "continuous")
            attributeValue("dataType", "double")
        })

        // MiningSchema 组装
        miningsElement.selectNodes("/MiningField").forEach { miningsElement.remove(it) }
        fieldList.map {
            DOMElement("MiningField").apply {
                attributeValue("name", it.name)
                attributeValue("invalidValueTreatment", "asMissing")
            }
        }.forEach { miningsElement.add(it) }

        // Characteristics 组装
        charsElement.selectNodes("/Characteristic").forEach { charsElement.remove(it) }
        fieldList.map { dataField ->
            DOMElement("Characteristic").apply {
                attributeValue("name", dataField.name)
                attributeValue("reasonCode", dataField.name)
                attributeValue("baselineScore", "0")
                dataField.attrs.forEach { attr ->
                    element("Attribute").apply {
                        attributeValue("partialScore", attr.score)
                        when (attr.operator.operator.size) {
                            0 -> throw RuntimeException("未找到操作符")
                            1 ->
                                element("SimplePredicate").apply {
                                    attributeValue("dataField", dataField.name)
                                    attributeValue("operator", attr.operator.operator.first())
                                    attributeValue("value", attr.operatorValue)
                                }

                            2 ->
                                element("CompoundPredicate").apply {
                                    attributeValue("booleanOperator", "and")
                                    attr.operator.operator.forEachIndexed { index, op ->
                                        element("SimplePredicate").apply {
                                            attributeValue("dataField", dataField.name)
                                            attributeValue("operator", op)
                                            attributeValue("value", attr.operatorValue.split(",")[index])
                                        }
                                    }
                                }
                            else ->
                                element("CompoundPredicate").apply {
                                    attributeValue("booleanOperator", "and")
                                    attr.operatorValue.split(",").forEach {
                                        element("SimplePredicate").apply {
                                            attributeValue("dataField", dataField.name)
                                            attributeValue("operator", attr.operator.operator.first())
                                            attributeValue("value", it)
                                        }
                                    }
                                }
                        }
                    }
                }
            }
        }.forEach { charsElement.add(it) }
    }

    private fun getFieldType(dataType: String): DataFieldTypeEnum {
        return DataFieldTypeEnum.valueOf(dataType.toUpperCase())
    }

    open fun setInitScore(score: Double) {
        sdElement.attributeValue("initialScore", score.toString())
    }

    open fun getFieldDetailByName(name: String, type: DataFieldTypeEnum): List<Attribute> {
        val ele = charsElement.elements().firstOrNull {
            it.attributeValue("name") == name
        }

        return ele?.elements()?.map {
            val attr = Attribute(score = it.attributeValue("partialScore"))
            if (it.elements("CompoundPredicate").size > 0) {
                val opElements = it.element("CompoundPredicate").elements("SimplePredicate")
                attr.operatorValue = opElements.joinToString(",", "", "") { ele ->
                    ele.attributeValue("value")
                }
                if (opElements.size < 2) {
                    throw RuntimeException("field=$name attribute is empty")
                }
                attr.operator = Util.getOperatorType(opElements.map { ele ->
                    ele.attributeValue("operator")
                }.toTypedArray())
            } else {
                it.element("SimplePredicate").apply {
                    attr.operator = Util.getOperatorType(arrayOf(attributeValue("operator")))
                    attr.operatorValue = if (attr.operator in arrayOf(OperatorEnum.IS_MISSING, OperatorEnum.IS_NOT_MISSING))
                        ""
                    else
                        attributeValue("value")
                }
            }
            attr
        } ?: arrayListOf()
    }

    override fun toString(): String {
        return doc.asXML()
    }
}