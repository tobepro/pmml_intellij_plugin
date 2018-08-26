// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:LINK-FUNCTION enumeration.
 */
public enum LINKFUNCTION implements com.intellij.util.xml.NamedEnum {
	CLOGLOG ("cloglog"),
	IDENTITY ("identity"),
	LOG ("log"),
	LOGC ("logc"),
	LOGIT ("logit"),
	LOGLOG ("loglog"),
	NEGBIN ("negbin"),
	ODDSPOWER ("oddspower"),
	POWER ("power"),
	PROBIT ("probit");

	private final String value;
	private LINKFUNCTION(String value) { this.value = value; }
	public String getValue() { return value; }

}
