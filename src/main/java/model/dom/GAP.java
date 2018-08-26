// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:GAP enumeration.
 */
public enum GAP implements com.intellij.util.xml.NamedEnum {
	FALSE ("false"),
	TRUE ("true"),
	UNKNOWN ("unknown");

	private final String value;
	private GAP(String value) { this.value = value; }
	public String getValue() { return value; }

}
