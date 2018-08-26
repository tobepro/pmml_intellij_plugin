package common

import com.intellij.openapi.diagnostic.Logger
import com.intellij.util.ArrayUtil
import enums.DataFieldTypeEnum
import enums.OperatorEnum
import model.dom.DATATYPE

object Util {
    private val logger = Logger.getInstance(Util::class.java)
    fun getOperatorType(op : Array<String>) : OperatorEnum {
        return OperatorEnum.values().first { ArrayUtil.equals(it.operator.sortedArray(), op.sortedArray(), String::equals) }
    }
    fun dataTypeEnumConvert(domType: DATATYPE): DataFieldTypeEnum {
        return DataFieldTypeEnum.values().first { it.dataType == domType.value }
    }

    fun dataTypeEnumReverseConvert(dataType: DataFieldTypeEnum): DATATYPE {
        return DATATYPE.values().first { it.value == dataType.dataType }
    }


}