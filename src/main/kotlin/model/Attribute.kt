package model

import enums.OperatorEnum

data class Attribute(var score: String = "", var operator : OperatorEnum = OperatorEnum.EQUAL, var operatorValue: String = "")