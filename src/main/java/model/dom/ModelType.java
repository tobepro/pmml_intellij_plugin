// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

/**
 * http://www.dmg.org/PMML-4_3:modelTypeAttrType enumeration.
 */
public enum ModelType implements com.intellij.util.xml.NamedEnum {
	LINEAR_REGRESSION ("linearRegression"),
	LOGISTIC_REGRESSION ("logisticRegression"),
	STEPWISE_POLYNOMIAL_REGRESSION ("stepwisePolynomialRegression");

	private final String value;
	private ModelType(String value) { this.value = value; }
	public String getValue() { return value; }

}
