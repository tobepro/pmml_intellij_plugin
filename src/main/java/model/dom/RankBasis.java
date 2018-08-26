// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:rankBasisAttrType enumeration.
 */
public enum RankBasis implements com.intellij.util.xml.NamedEnum {
	AFFINITY ("affinity"),
	CONFIDENCE ("confidence"),
	LEVERAGE ("leverage"),
	LIFT ("lift"),
	SUPPORT ("support");

	private final String value;
	private RankBasis(String value) { this.value = value; }
	public String getValue() { return value; }

}
