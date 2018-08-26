// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:COMPARE-FUNCTION enumeration.
 */
public enum COMPAREFUNCTION implements com.intellij.util.xml.NamedEnum {
	ABS_DIFF ("absDiff"),
	DELTA ("delta"),
	EQUAL ("equal"),
	GAUSS_SIM ("gaussSim"),
	TABLE ("table");

	private final String value;
	private COMPAREFUNCTION(String value) { this.value = value; }
	public String getValue() { return value; }

}
