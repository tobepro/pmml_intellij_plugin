// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:splitCharacteristicAttrType enumeration.
 */
public enum SplitCharacteristic implements com.intellij.util.xml.NamedEnum {
	BINARY_SPLIT ("binarySplit"),
	MULTI_SPLIT ("multiSplit");

	private final String value;
	private SplitCharacteristic(String value) { this.value = value; }
	public String getValue() { return value; }

}
