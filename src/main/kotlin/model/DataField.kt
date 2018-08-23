package model

import enums.DataFieldTypeEnum

data class DataField(var name: String, var type: DataFieldTypeEnum, var fieldDetail : FieldDetail? = null)