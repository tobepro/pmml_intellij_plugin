// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:RESULT-FEATURE enumeration.
 */
public enum RESULTFEATURE implements com.intellij.util.xml.NamedEnum {
	AFFINITY ("affinity"),
	ANTECEDENT ("antecedent"),
	CLUSTER_AFFINITY ("clusterAffinity"),
	CLUSTER_ID ("clusterId"),
	CONFIDENCE ("confidence"),
	CONSEQUENT ("consequent"),
	DECISION ("decision"),
	ENTITY_AFFINITY ("entityAffinity"),
	ENTITY_ID ("entityId"),
	LEVERAGE ("leverage"),
	LIFT ("lift"),
	PREDICTED_DISPLAY_VALUE ("predictedDisplayValue"),
	PREDICTED_VALUE ("predictedValue"),
	PROBABILITY ("probability"),
	REASON_CODE ("reasonCode"),
	RESIDUAL ("residual"),
	RULE ("rule"),
	RULE_ID ("ruleId"),
	RULE_VALUE ("ruleValue"),
	STANDARD_ERROR ("standardError"),
	SUPPORT ("support"),
	TRANSFORMED_VALUE ("transformedValue"),
	WARNING ("warning");

	private final String value;
	private RESULTFEATURE(String value) { this.value = value; }
	public String getValue() { return value; }

}
