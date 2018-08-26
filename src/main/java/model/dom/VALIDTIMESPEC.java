// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:VALID-TIME-SPEC enumeration.
 */
public enum VALIDTIMESPEC implements com.intellij.util.xml.NamedEnum {
	EXCLUDE_FROM_TO ("excludeFromTo"),
	EXCLUDE_SET ("excludeSet"),
	INCLUDE_ALL ("includeAll"),
	INCLUDE_FROM_TO ("includeFromTo"),
	INCLUDE_SET ("includeSet");

	private final String value;
	private VALIDTIMESPEC(String value) { this.value = value; }
	public String getValue() { return value; }

}
