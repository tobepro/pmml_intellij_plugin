// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SetPredicateElemType interface.
 */
public interface SetPredicate extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the operator child.
	 * @return the value of the operator child.
	 */
	@NotNull
	GenericAttributeValue<String> getOperator();


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
	Array getArray();


}
