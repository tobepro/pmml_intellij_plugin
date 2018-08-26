// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AssociationRuleElemType interface.
 */
public interface AssociationRule extends DomElement {

	/**
	 * Returns the value of the antecedent child.
	 * @return the value of the antecedent child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getAntecedent();


	/**
	 * Returns the value of the consequent child.
	 * @return the value of the consequent child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getConsequent();


	/**
	 * Returns the value of the support child.
	 * @return the value of the support child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getSupport();


	/**
	 * Returns the value of the confidence child.
	 * @return the value of the confidence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getConfidence();


	/**
	 * Returns the value of the lift child.
	 * @return the value of the lift child.
	 */
	@NotNull
	GenericAttributeValue<Float> getLift();


	/**
	 * Returns the value of the leverage child.
	 * @return the value of the leverage child.
	 */
	@NotNull
	GenericAttributeValue<Float> getLeverage();


	/**
	 * Returns the value of the affinity child.
	 * @return the value of the affinity child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAffinity();


	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	GenericAttributeValue<String> getId();


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
