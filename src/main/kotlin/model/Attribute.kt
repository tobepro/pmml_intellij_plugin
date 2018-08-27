package model

import enums.OperatorEnum

data class Attribute(var score: Double? = null, var operator : OperatorEnum = OperatorEnum.EQUAL, var operatorValue: String = "")