// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:propertyAttrType enumeration.
 */
public enum Property implements com.intellij.util.xml.NamedEnum {
	INVALID ("invalid"),
	MISSING ("missing"),
	VALID ("valid");

	private final String value;
	private Property(String value) { this.value = value; }
	public String getValue() { return value; }

}
