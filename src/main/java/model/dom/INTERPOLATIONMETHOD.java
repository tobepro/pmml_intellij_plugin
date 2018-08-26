// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:INTERPOLATION-METHOD enumeration.
 */
public enum INTERPOLATIONMETHOD implements com.intellij.util.xml.NamedEnum {
	CUBIC_SPLINE ("cubicSpline"),
	EXPONENTIAL_SPLINE ("exponentialSpline"),
	LINEAR ("linear"),
	NONE ("none");

	private final String value;
	private INTERPOLATIONMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
