// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:trendAttrType enumeration.
 */
public enum Trend implements com.intellij.util.xml.NamedEnum {
	ADDITIVE ("additive"),
	DAMPED_ADDITIVE ("damped_additive"),
	DAMPED_MULTIPLICATIVE ("damped_multiplicative"),
	MULTIPLICATIVE ("multiplicative"),
	POLYNOMIAL_EXPONENTIAL ("polynomial_exponential");

	private final String value;
	private Trend(String value) { this.value = value; }
	public String getValue() { return value; }

}
