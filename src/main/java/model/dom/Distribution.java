// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:distributionAttrType enumeration.
 */
public enum Distribution implements com.intellij.util.xml.NamedEnum {
	BINOMIAL ("binomial"),
	GAMMA ("gamma"),
	IGAUSS ("igauss"),
	NEGBIN ("negbin"),
	NORMAL ("normal"),
	POISSON ("poisson"),
	TWEEDIE ("tweedie");

	private final String value;
	private Distribution(String value) { this.value = value; }
	public String getValue() { return value; }

}
