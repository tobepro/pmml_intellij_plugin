// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:AttributeElemType interface.
 */
public interface Attribute extends MyDomElement {

	/**
	 * Returns the value of the reasonCode child.
	 * @return the value of the reasonCode child.
	 */
	@NotNull
	GenericAttributeValue<String> getReasonCode();


	/**
	 * Returns the value of the partialScore child.
	 * @return the value of the partialScore child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getPartialScore();


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
	 * Returns the value of the ComplexPartialScore child.
	 * @return the value of the ComplexPartialScore child.
	 */
	@NotNull
	ComplexPartialScore getComplexPartialScore();


	/**
	 * Returns the value of the SimplePredicate child.
	 * @return the value of the SimplePredicate child.
	 */
	@NotNull
	SimplePredicate getSimplePredicate();

	/**
	 * Returns the value of the CompoundPredicate child.
	 * @return the value of the CompoundPredicate child.
	 */
	@NotNull
	CompoundPredicate getCompoundPredicate();


	/**
	 * Returns the value of the SimpleSetPredicate child.
	 * @return the value of the SimpleSetPredicate child.
	 */
	@NotNull
	SimpleSetPredicate getSimpleSetPredicate();

	/**
	 * Returns the value of the True child.
	 * @return the value of the True child.
	 */
	@NotNull
	True getTrue();


	/**
	 * Returns the value of the False child.
	 * @return the value of the False child.
	 */
	@NotNull
	False getFalse();


}
