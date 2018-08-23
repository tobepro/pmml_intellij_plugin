package util

import com.intellij.util.ArrayUtil
import enums.OperatorEnum

object MyUtil {
    fun getOperatorType(op : Array<String>) : OperatorEnum {
        return OperatorEnum.values().first { ArrayUtil.equals(it.operator.sortedArray(), op.sortedArray(), String::equals) }
    }
}