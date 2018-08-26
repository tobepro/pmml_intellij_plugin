// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:MISSING-VALUE-TREATMENT-METHOD enumeration.
 */
public enum MISSINGVALUETREATMENTMETHOD implements com.intellij.util.xml.NamedEnum {
	AS_IS ("asIs"),
	AS_MEAN ("asMean"),
	AS_MEDIAN ("asMedian"),
	AS_MODE ("asMode"),
	AS_VALUE ("asValue");

	private final String value;
	private MISSINGVALUETREATMENTMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
