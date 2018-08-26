// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:localTermWeightsAttrType enumeration.
 */
public enum LocalTermWeights implements com.intellij.util.xml.NamedEnum {
	AUGMENTED_NORMALIZED_TERM_FREQUENCY ("augmentedNormalizedTermFrequency"),
	BINARY ("binary"),
	LOGARITHMIC ("logarithmic"),
	TERM_FREQUENCY ("termFrequency");

	private final String value;
	private LocalTermWeights(String value) { this.value = value; }
	public String getValue() { return value; }

}
