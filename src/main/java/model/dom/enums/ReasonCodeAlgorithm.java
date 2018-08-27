// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:reasonCodeAlgorithmAttrType enumeration.
 */
public enum ReasonCodeAlgorithm implements com.intellij.util.xml.NamedEnum {
	POINTS_ABOVE ("pointsAbove"),
	POINTS_BELOW ("pointsBelow");

	private final String value;
	private ReasonCodeAlgorithm(String value) { this.value = value; }
	public String getValue() { return value; }

}
