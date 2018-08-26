// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DiscreteConditionalProbabilityElemType interface.
 */
public interface DiscreteConditionalProbability extends DomElement {

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
	 * Returns the list of ParentValue children.
	 * @return the list of ParentValue children.
	 */
	@NotNull
	@Required
	java.util.List<ParentValue> getParentValues();
	/**
	 * Adds new child to the list of ParentValue children.
	 * @return created child
	 */
	ParentValue addParentValue();


	/**
	 * Returns the list of ValueProbability children.
	 * @return the list of ValueProbability children.
	 */
	@NotNull
	@Required
	java.util.List<ValueProbability> getValueProbabilities();
	/**
	 * Adds new child to the list of ValueProbability children.
	 * @return created child
	 */
	ValueProbability addValueProbability();


}
