// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:CAT-SCORING-METHOD enumeration.
 */
public enum CATSCORINGMETHOD implements com.intellij.util.xml.NamedEnum {
	MAJORITY_VOTE ("majorityVote"),
	WEIGHTED_MAJORITY_VOTE ("weightedMajorityVote");

	private final String value;
	private CATSCORINGMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
