// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:CountsElemType interface.
 */
public interface Counts extends MyDomElement {

	/**
	 * Returns the value of the totalFreq child.
	 * @return the value of the totalFreq child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getTotalFreq();


	/**
	 * Returns the value of the missingFreq child.
	 * @return the value of the missingFreq child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMissingFreq();


	/**
	 * Returns the value of the invalidFreq child.
	 * @return the value of the invalidFreq child.
	 */
	@NotNull
	GenericAttributeValue<Double> getInvalidFreq();


	/**
	 * Returns the value of the cardinality child.
	 * @return the value of the cardinality child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getCardinality();


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
