// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ConstraintsElemType interface.
 */
public interface Constraints extends DomElement {

	/**
	 * Returns the value of the minimumNumberOfItems child.
	 * @return the value of the minimumNumberOfItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMinimumNumberOfItems();


	/**
	 * Returns the value of the maximumNumberOfItems child.
	 * @return the value of the maximumNumberOfItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaximumNumberOfItems();


	/**
	 * Returns the value of the minimumNumberOfAntecedentItems child.
	 * @return the value of the minimumNumberOfAntecedentItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMinimumNumberOfAntecedentItems();


	/**
	 * Returns the value of the maximumNumberOfAntecedentItems child.
	 * @return the value of the maximumNumberOfAntecedentItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaximumNumberOfAntecedentItems();


	/**
	 * Returns the value of the minimumNumberOfConsequentItems child.
	 * @return the value of the minimumNumberOfConsequentItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMinimumNumberOfConsequentItems();


	/**
	 * Returns the value of the maximumNumberOfConsequentItems child.
	 * @return the value of the maximumNumberOfConsequentItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaximumNumberOfConsequentItems();


	/**
	 * Returns the value of the minimumSupport child.
	 * @return the value of the minimumSupport child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumSupport();


	/**
	 * Returns the value of the minimumConfidence child.
	 * @return the value of the minimumConfidence child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumConfidence();


	/**
	 * Returns the value of the minimumLift child.
	 * @return the value of the minimumLift child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumLift();


	/**
	 * Returns the value of the minimumTotalSequenceTime child.
	 * @return the value of the minimumTotalSequenceTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumTotalSequenceTime();


	/**
	 * Returns the value of the maximumTotalSequenceTime child.
	 * @return the value of the maximumTotalSequenceTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMaximumTotalSequenceTime();


	/**
	 * Returns the value of the minimumItemsetSeparationTime child.
	 * @return the value of the minimumItemsetSeparationTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumItemsetSeparationTime();


	/**
	 * Returns the value of the maximumItemsetSeparationTime child.
	 * @return the value of the maximumItemsetSeparationTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMaximumItemsetSeparationTime();


	/**
	 * Returns the value of the minimumAntConsSeparationTime child.
	 * @return the value of the minimumAntConsSeparationTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimumAntConsSeparationTime();


	/**
	 * Returns the value of the maximumAntConsSeparationTime child.
	 * @return the value of the maximumAntConsSeparationTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMaximumAntConsSeparationTime();


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
