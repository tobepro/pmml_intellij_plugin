// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:CompoundRuleElemType interface.
 */
public interface CompoundRule extends DomElement {

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
	SimplePredicate getSimplePredicate();


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


	/**
	 * Returns the list of SimpleRule children.
	 * @return the list of SimpleRule children.
	 */
	@NotNull
	java.util.List<SimpleRule> getSimpleRules();
	/**
	 * Adds new child to the list of SimpleRule children.
	 * @return created child
	 */
	SimpleRule addSimpleRule();


	/**
	 * Returns the list of CompoundRule children.
	 * @return the list of CompoundRule children.
	 */
	@NotNull
	java.util.List<CompoundRule> getCompoundRules();
	/**
	 * Adds new child to the list of CompoundRule children.
	 * @return created child
	 */
	CompoundRule addCompoundRule();


}
