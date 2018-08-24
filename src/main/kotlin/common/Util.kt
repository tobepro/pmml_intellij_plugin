package common

import com.intellij.openapi.diagnostic.Logger
import com.intellij.util.ArrayUtil
import enums.OperatorEnum

object Util {
    private val logger = Logger.getInstance(Util::class.java)
    fun getOperatorType(op : Array<String>) : OperatorEnum {
        return OperatorEnum.values().first { ArrayUtil.equals(it.operator.sortedArray(), op.sortedArray(), String::equals) }
    }
}