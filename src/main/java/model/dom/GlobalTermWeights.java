// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:globalTermWeightsAttrType enumeration.
 */
public enum GlobalTermWeights implements com.intellij.util.xml.NamedEnum {
	GFIDF ("GFIDF"),
	INVERSE_DOCUMENT_FREQUENCY ("inverseDocumentFrequency"),
	NONE ("none"),
	NORMAL ("normal"),
	PROBABILISTIC_INVERSE ("probabilisticInverse");

	private final String value;
	private GlobalTermWeights(String value) { this.value = value; }
	public String getValue() { return value; }

}
