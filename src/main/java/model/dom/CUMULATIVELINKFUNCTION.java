// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:CUMULATIVE-LINK-FUNCTION enumeration.
 */
public enum CUMULATIVELINKFUNCTION implements com.intellij.util.xml.NamedEnum {
	CAUCHIT ("cauchit"),
	CLOGLOG ("cloglog"),
	LOGIT ("logit"),
	LOGLOG ("loglog"),
	PROBIT ("probit");

	private final String value;
	private CUMULATIVELINKFUNCTION(String value) { this.value = value; }
	public String getValue() { return value; }

}
