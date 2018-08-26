// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:FIELD-USAGE-TYPE enumeration.
 */
public enum FIELDUSAGETYPE implements com.intellij.util.xml.NamedEnum {
	ACTIVE ("active"),
	ANALYSIS_WEIGHT ("analysisWeight"),
	FREQUENCY_WEIGHT ("frequencyWeight"),
	GROUP ("group"),
	ORDER ("order"),
	PREDICTED ("predicted"),
	SUPPLEMENTARY ("supplementary"),
	TARGET ("target");

	private final String value;
	private FIELDUSAGETYPE(String value) { this.value = value; }
	public String getValue() { return value; }

}
