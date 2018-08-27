// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import model.dom.enums.BooleanOperator;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:CompoundPredicateElemType interface.
 */
public interface CompoundPredicate extends DomElement {

	/**
	 * Returns the value of the booleanOperator child.
	 * @return the value of the booleanOperator child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<BooleanOperator> getBooleanOperator();


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
	 * Returns the value of the SimplePredicate child.
	 * @return the value of the SimplePredicate child.
	 */
	@NotNull
	@Required
	@SubTagList("SimplePredicate")
	List<SimplePredicate> getSimplePredicates();
	
	@SubTag("SimplePredicate")
	SimplePredicate addSimplePredicate();


	/**
	 * Returns the value of the CompoundPredicate child.
	 * @return the value of the CompoundPredicate child.
	 */
	@NotNull
	@Required
	CompoundPredicate getCompoundPredicate();


	/**
	 * Returns the value of the SimpleSetPredicate child.
	 * @return the value of the SimpleSetPredicate child.
	 */
	@NotNull
	@Required
	@SubTag("SimpleSetPredicate")
	SimpleSetPredicate getSimpleSetPredicate();


	/**
	 * Returns the value of the True child.
	 * @return the value of the True child.
	 */
	@NotNull
	@Required
	True getTrue();


	/**
	 * Returns the value of the False child.
	 * @return the value of the False child.
	 */
	@NotNull
	@Required
	False getFalse();


}
