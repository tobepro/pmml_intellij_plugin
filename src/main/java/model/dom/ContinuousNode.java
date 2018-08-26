// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ContinuousNodeElemType interface.
 */
public interface ContinuousNode extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the count child.
	 * @return the value of the count child.
	 */
	@NotNull
	GenericAttributeValue<Double> getCount();


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


	/**
	 * Returns the list of DerivedField children.
	 * @return the list of DerivedField children.
	 */
	@NotNull
	java.util.List<DerivedField> getDerivedFields();
	/**
	 * Adds new child to the list of DerivedField children.
	 * @return created child
	 */
	DerivedField addDerivedField();


	/**
	 * Returns the list of ContinuousConditionalProbability children.
	 * @return the list of ContinuousConditionalProbability children.
	 */
	@NotNull
	java.util.List<ContinuousConditionalProbability> getContinuousConditionalProbabilities();
	/**
	 * Adds new child to the list of ContinuousConditionalProbability children.
	 * @return created child
	 */
	ContinuousConditionalProbability addContinuousConditionalProbability();


	/**
	 * Returns the list of ContinuousDistribution children.
	 * @return the list of ContinuousDistribution children.
	 */
	@NotNull
	java.util.List<ContinuousDistribution> getContinuousDistributions();
	/**
	 * Adds new child to the list of ContinuousDistribution children.
	 * @return created child
	 */
	ContinuousDistribution addContinuousDistribution();


}
