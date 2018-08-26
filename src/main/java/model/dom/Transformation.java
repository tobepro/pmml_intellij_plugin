// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:transformationAttrType enumeration.
 */
public enum Transformation implements com.intellij.util.xml.NamedEnum {
	LOGARITHMIC ("logarithmic"),
	NONE ("none"),
	SQUAREROOT ("squareroot");

	private final String value;
	private Transformation(String value) { this.value = value; }
	public String getValue() { return value; }

}
