// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:MINING-FUNCTION enumeration.
 */
public enum MININGFUNCTION implements com.intellij.util.xml.NamedEnum {
	ASSOCIATION_RULES ("associationRules"),
	CLASSIFICATION ("classification"),
	CLUSTERING ("clustering"),
	MIXED ("mixed"),
	REGRESSION ("regression"),
	SEQUENCES ("sequences"),
	TIME_SERIES ("timeSeries");

	private final String value;
	private MININGFUNCTION(String value) { this.value = value; }
	public String getValue() { return value; }

}
