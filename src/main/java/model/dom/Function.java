// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:functionAttrType enumeration.
 */
public enum Function implements com.intellij.util.xml.NamedEnum {
	AVERAGE ("average"),
	COUNT ("count"),
	MAX ("max"),
	MIN ("min"),
	MULTISET ("multiset"),
	SUM ("sum");

	private final String value;
	private Function(String value) { this.value = value; }
	public String getValue() { return value; }

}
