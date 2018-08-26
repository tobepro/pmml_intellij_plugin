// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:MISSING-VALUE-STRATEGY enumeration.
 */
public enum MISSINGVALUESTRATEGY implements com.intellij.util.xml.NamedEnum {
	AGGREGATE_NODES ("aggregateNodes"),
	DEFAULT_CHILD ("defaultChild"),
	LAST_PREDICTION ("lastPrediction"),
	NONE ("none"),
	NULL_PREDICTION ("nullPrediction"),
	WEIGHTED_CONFIDENCE ("weightedConfidence");

	private final String value;
	private MISSINGVALUESTRATEGY(String value) { this.value = value; }
	public String getValue() { return value; }

}
