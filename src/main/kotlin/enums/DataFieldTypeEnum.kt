package enums

enum class DataFieldTypeEnum(val dataType: String, val opType: String) {
    DOUBLE("double", "continuous"),
    INTEGER("integer", "continuous"),
    STRING("string", "categorical")
}