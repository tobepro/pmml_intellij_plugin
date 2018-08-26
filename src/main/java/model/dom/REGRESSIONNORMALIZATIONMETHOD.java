// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:REGRESSIONNORMALIZATIONMETHOD enumeration.
 */
public enum REGRESSIONNORMALIZATIONMETHOD implements com.intellij.util.xml.NamedEnum {
	CAUCHIT ("cauchit"),
	CLOGLOG ("cloglog"),
	EXP ("exp"),
	LOGIT ("logit"),
	LOGLOG ("loglog"),
	NONE ("none"),
	PROBIT ("probit"),
	SIMPLEMAX ("simplemax"),
	SOFTMAX ("softmax");

	private final String value;
	private REGRESSIONNORMALIZATIONMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
