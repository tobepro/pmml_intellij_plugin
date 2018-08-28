// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import model.dom.enums.CompoundBooleanOperator;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:CompoundPredicateElemType interface.
 */
public interface CompoundPredicate extends MyDomElement {

	/**
	 * Returns the value of the booleanOperator child.
	 * @return the value of the booleanOperator child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<CompoundBooleanOperator> getBooleanOperator();


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
	List<SimplePredicate> getSimplePredicates();
	
	SimplePredicate addSimplePredicate();


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
