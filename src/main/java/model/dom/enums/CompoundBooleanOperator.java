// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:booleanOperatorAttrType enumeration.
 */
public enum CompoundBooleanOperator implements com.intellij.util.xml.NamedEnum {
	OR ("or"),
	AND ("and"),
	XOR ("xor"),
	SURROGATE ("surrogate");

	private final String value;
	private CompoundBooleanOperator(String value) { this.value = value; }
	public String getValue() { return value; }

}
