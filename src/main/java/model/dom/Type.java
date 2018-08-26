// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:typeAttrType enumeration.
 */
public enum Type implements com.intellij.util.xml.NamedEnum {
	INT ("int"),
	REAL ("real"),
	STRING ("string");

	private final String value;
	private Type(String value) { this.value = value; }
	public String getValue() { return value; }

}
