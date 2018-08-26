// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:SVM-REPRESENTATION enumeration.
 */
public enum SVMREPRESENTATION implements com.intellij.util.xml.NamedEnum {
	COEFFICIENTS ("Coefficients"),
	SUPPORT_VECTORS ("SupportVectors");

	private final String value;
	private SVMREPRESENTATION(String value) { this.value = value; }
	public String getValue() { return value; }

}
