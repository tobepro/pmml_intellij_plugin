// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:kindAttrType enumeration.
 */
public enum Kind implements com.intellij.util.xml.NamedEnum {
	ANY ("any"),
	DIAGONAL ("diagonal"),
	SYMMETRIC ("symmetric");

	private final String value;
	private Kind(String value) { this.value = value; }
	public String getValue() { return value; }

}
