// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:DELIMITER enumeration.
 */
public enum DELIMITER implements com.intellij.util.xml.NamedEnum {
	ACROSS_TIME_WINDOWS ("acrossTimeWindows"),
	SAME_TIME_WINDOW ("sameTimeWindow");

	private final String value;
	private DELIMITER(String value) { this.value = value; }
	public String getValue() { return value; }

}
