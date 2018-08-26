// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:NN-NORMALIZATION-METHOD enumeration.
 */
public enum NNNORMALIZATIONMETHOD implements com.intellij.util.xml.NamedEnum {
	NONE ("none"),
	SIMPLEMAX ("simplemax"),
	SOFTMAX ("softmax");

	private final String value;
	private NNNORMALIZATIONMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
