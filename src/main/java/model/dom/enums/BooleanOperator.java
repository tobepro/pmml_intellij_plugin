// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:booleanOperatorAttrType enumeration.
 */
public enum BooleanOperator implements com.intellij.util.xml.NamedEnum {
	IS_IN ("isIn"),
	IS_NOT_IN ("isNotIn");

	private final String value;
	private BooleanOperator(String value) { this.value = value; }
	public String getValue() { return value; }

}