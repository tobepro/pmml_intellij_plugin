// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:MULTIPLE-MODEL-METHOD enumeration.
 */
public enum MULTIPLEMODELMETHOD implements com.intellij.util.xml.NamedEnum {
	AVERAGE ("average"),
	MAJORITY_VOTE ("majorityVote"),
	MAX ("max"),
	MEDIAN ("median"),
	MODEL_CHAIN ("modelChain"),
	SELECT_ALL ("selectAll"),
	SELECT_FIRST ("selectFirst"),
	SUM ("sum"),
	WEIGHTED_AVERAGE ("weightedAverage"),
	WEIGHTED_MAJORITY_VOTE ("weightedMajorityVote");

	private final String value;
	private MULTIPLEMODELMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
