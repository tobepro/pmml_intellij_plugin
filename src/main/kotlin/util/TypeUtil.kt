package util

import com.intellij.openapi.diagnostic.Logger
import com.intellij.util.ArrayUtil
import enums.OperatorEnum
import java.util.*

object TypeUtil {
    private val logger = Logger.getInstance(TypeUtil::class.java)
    fun getOperatorType(op : Array<String>) : OperatorEnum {
        return OperatorEnum.values().first { ArrayUtil.equals(it.operator.sortedArray(), op.sortedArray(), String::equals) }
    }
}