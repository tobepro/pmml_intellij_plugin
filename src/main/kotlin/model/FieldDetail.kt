package model

import enums.DataFieldTypeEnum

data class FieldDetail(var name: String, var type: DataFieldTypeEnum, var attrs : List<Attribute>)