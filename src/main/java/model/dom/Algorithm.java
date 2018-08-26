// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:algorithmAttrType enumeration.
 */
public enum Algorithm implements com.intellij.util.xml.NamedEnum {
	EXCLUSIVE_RECOMMENDATION ("exclusiveRecommendation"),
	RECOMMENDATION ("recommendation"),
	RULE_ASSOCIATION ("ruleAssociation");

	private final String value;
	private Algorithm(String value) { this.value = value; }
	public String getValue() { return value; }

}
