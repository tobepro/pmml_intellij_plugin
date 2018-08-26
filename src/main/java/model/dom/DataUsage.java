// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:dataUsageAttrType enumeration.
 */
public enum DataUsage implements com.intellij.util.xml.NamedEnum {
	TEST ("test"),
	TRAINING ("training"),
	VALIDATION ("validation");

	private final String value;
	private DataUsage(String value) { this.value = value; }
	public String getValue() { return value; }

}
