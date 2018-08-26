// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:criterionAttrType enumeration.
 */
public enum Criterion implements com.intellij.util.xml.NamedEnum {
	FIRST_HIT ("firstHit"),
	WEIGHTED_MAX ("weightedMax"),
	WEIGHTED_SUM ("weightedSum");

	private final String value;
	private Criterion(String value) { this.value = value; }
	public String getValue() { return value; }

}
