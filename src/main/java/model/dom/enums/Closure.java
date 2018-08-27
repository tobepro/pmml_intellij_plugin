// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom.enums;

/**
 * http://www.dmg.org/PMML-4_3:closureAttrType enumeration.
 */
public enum Closure implements com.intellij.util.xml.NamedEnum {
	CLOSED_CLOSED ("closedClosed"),
	CLOSED_OPEN ("closedOpen"),
	OPEN_CLOSED ("openClosed"),
	OPEN_OPEN ("openOpen");

	private final String value;
	private Closure(String value) { this.value = value; }
	public String getValue() { return value; }

}
