// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:isRecursiveAttrType enumeration.
 */
public enum IsRecursive implements com.intellij.util.xml.NamedEnum {
	NO ("no"),
	YES ("yes");

	private final String value;
	private IsRecursive(String value) { this.value = value; }
	public String getValue() { return value; }

}
