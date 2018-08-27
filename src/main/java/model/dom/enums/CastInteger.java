// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:castIntegerAttrType enumeration.
 */
public enum CastInteger implements com.intellij.util.xml.NamedEnum {
	CEILING ("ceiling"),
	FLOOR ("floor"),
	ROUND ("round");

	private final String value;
	private CastInteger(String value) { this.value = value; }
	public String getValue() { return value; }

}
