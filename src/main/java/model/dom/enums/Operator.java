// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:operatorAttrType enumeration.
 */
public enum Operator implements com.intellij.util.xml.NamedEnum {
	EQUAL ("equal"),
	GREATER_OR_EQUAL ("greaterOrEqual"),
	GREATER_THAN ("greaterThan"),
	IS_MISSING ("isMissing"),
	IS_NOT_MISSING ("isNotMissing"),
	LESS_OR_EQUAL ("lessOrEqual"),
	LESS_THAN ("lessThan"),
	NOT_EQUAL ("notEqual");

	private final String value;
	private Operator(String value) { this.value = value; }
	public String getValue() { return value; }

}
