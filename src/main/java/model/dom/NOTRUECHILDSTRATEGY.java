// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:NO-TRUE-CHILD-STRATEGY enumeration.
 */
public enum NOTRUECHILDSTRATEGY implements com.intellij.util.xml.NamedEnum {
	RETURN_LAST_PREDICTION ("returnLastPrediction"),
	RETURN_NULL_PREDICTION ("returnNullPrediction");

	private final String value;
	private NOTRUECHILDSTRATEGY(String value) { this.value = value; }
	public String getValue() { return value; }

}
