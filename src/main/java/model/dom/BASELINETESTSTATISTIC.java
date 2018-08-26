// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:BASELINE-TEST-STATISTIC enumeration.
 */
public enum BASELINETESTSTATISTIC implements com.intellij.util.xml.NamedEnum {
	CUSUM ("CUSUM"),
	CHI_SQUARE_DISTRIBUTION ("chiSquareDistribution"),
	CHI_SQUARE_INDEPENDENCE ("chiSquareIndependence"),
	SCALAR_PRODUCT ("scalarProduct"),
	Z_VALUE ("zValue");

	private final String value;
	private BASELINETESTSTATISTIC(String value) { this.value = value; }
	public String getValue() { return value; }

}
