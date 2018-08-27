package model.dom.enums;

public enum Type implements com.intellij.util.xml.NamedEnum {
    INT ("int"),
    REAL ("real"),
    STRING ("string");

    private final String value;
    private Type(String value) { this.value = value; }
    public String getValue() { return value; }
}