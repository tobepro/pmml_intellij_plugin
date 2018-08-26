// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:documentNormalizationAttrType enumeration.
 */
public enum DocumentNormalization implements com.intellij.util.xml.NamedEnum {
	COSINE ("cosine"),
	NONE ("none");

	private final String value;
	private DocumentNormalization(String value) { this.value = value; }
	public String getValue() { return value; }

}
