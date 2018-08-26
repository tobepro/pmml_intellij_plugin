// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:SVM-CLASSIFICATION-METHOD enumeration.
 */
public enum SVMCLASSIFICATIONMETHOD implements com.intellij.util.xml.NamedEnum {
	ONE_AGAINST_ALL ("OneAgainstAll"),
	ONE_AGAINST_ONE ("OneAgainstOne");

	private final String value;
	private SVMCLASSIFICATIONMETHOD(String value) { this.value = value; }
	public String getValue() { return value; }

}
