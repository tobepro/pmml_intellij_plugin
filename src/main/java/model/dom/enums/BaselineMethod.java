// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:baselineMethodAttrType enumeration.
 */
public enum BaselineMethod implements com.intellij.util.xml.NamedEnum {
	MAX ("max"),
	MEAN ("mean"),
	MIN ("min"),
	NEUTRAL ("neutral"),
	OTHER ("other");

	private final String value;
	private BaselineMethod(String value) { this.value = value; }
	public String getValue() { return value; }

}
