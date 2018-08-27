// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import model.dom.enums.BooleanOperator;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:SimpleSetPredicateElemType interface.
 */
public interface SimpleSetPredicate extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


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
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	@SubTagList("Array")
	Array getArray();


}
