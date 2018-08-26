// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:rankOrderAttrType enumeration.
 */
public enum RankOrder implements com.intellij.util.xml.NamedEnum {
	ASCENDING ("ascending"),
	DESCENDING ("descending");

	private final String value;
	private RankOrder(String value) { this.value = value; }
	public String getValue() { return value; }

}
