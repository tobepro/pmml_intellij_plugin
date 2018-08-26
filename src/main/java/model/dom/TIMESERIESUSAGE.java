// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:TIMESERIES-USAGE enumeration.
 */
public enum TIMESERIESUSAGE implements com.intellij.util.xml.NamedEnum {
	LOGICAL ("logical"),
	ORIGINAL ("original"),
	PREDICTION ("prediction");

	private final String value;
	private TIMESERIESUSAGE(String value) { this.value = value; }
	public String getValue() { return value; }

}
