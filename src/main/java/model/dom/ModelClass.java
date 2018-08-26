// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:modelClassAttrType enumeration.
 */
public enum ModelClass implements com.intellij.util.xml.NamedEnum {
	CENTER_BASED ("centerBased"),
	DISTRIBUTION_BASED ("distributionBased");

	private final String value;
	private ModelClass(String value) { this.value = value; }
	public String getValue() { return value; }

}
