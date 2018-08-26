// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:countHitsAttrType enumeration.
 */
public enum CountHits implements com.intellij.util.xml.NamedEnum {
	ALL_HITS ("allHits"),
	BEST_HITS ("bestHits");

	private final String value;
	private CountHits(String value) { this.value = value; }
	public String getValue() { return value; }

}
