// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:INVALID-VALUE-TREATMENT-METHOD enumeration.
 */
public enum INVALIDVALUETREATMENTMETHOD implements com.intellij.util.xml.NamedEnum {
	AS_IS ("asIs"),
	AS_MISSING ("asMissing"),
	RETURN_INVALID ("returnInvalid");

	private final String value;
	private INVALIDVALUETREATMENTMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
