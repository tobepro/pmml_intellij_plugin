// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:QuantileElemType interface.
 */
public interface Quantile extends MyDomElement {

	/**
	 * Returns the value of the quantileLimit child.
	 * @return the value of the quantileLimit child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getQuantileLimit();


	/**
	 * Returns the value of the quantileValue child.
	 * @return the value of the quantileValue child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getQuantileValue();


	/**
	 * Returns the list of Extension children.
	 * @return the list of Extension children.
	 */
	@NotNull
	java.util.List<Extension> getExtensions();
	/**
	 * Adds new child to the list of Extension children.
	 * @return created child
	 */
	Extension addExtension();


}
