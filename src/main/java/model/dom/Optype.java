// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:OPTYPE enumeration.
 */
public enum Optype implements com.intellij.util.xml.NamedEnum {
	CATEGORICAL ("categorical"),
	CONTINUOUS ("continuous"),
	ORDINAL ("ordinal");

	private final String value;
	private Optype(String value) { this.value = value; }
	public String getValue() { return value; }

}
