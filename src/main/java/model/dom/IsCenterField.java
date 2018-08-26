// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:isCenterFieldAttrType enumeration.
 */
public enum IsCenterField implements com.intellij.util.xml.NamedEnum {
	FALSE ("false"),
	TRUE ("true");

	private final String value;
	private IsCenterField(String value) { this.value = value; }
	public String getValue() { return value; }

}
