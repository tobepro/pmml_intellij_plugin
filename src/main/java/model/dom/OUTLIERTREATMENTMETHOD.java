// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:OUTLIER-TREATMENT-METHOD enumeration.
 */
public enum OUTLIERTREATMENTMETHOD implements com.intellij.util.xml.NamedEnum {
	AS_EXTREME_VALUES ("asExtremeValues"),
	AS_IS ("asIs"),
	AS_MISSING_VALUES ("asMissingValues");

	private final String value;
	private OUTLIERTREATMENTMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
