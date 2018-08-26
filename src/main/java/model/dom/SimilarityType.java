// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:similarityTypeAttrType enumeration.
 */
public enum SimilarityType implements com.intellij.util.xml.NamedEnum {
	COSINE ("cosine"),
	EUCLIDEAN ("euclidean");

	private final String value;
	private SimilarityType(String value) { this.value = value; }
	public String getValue() { return value; }

}
