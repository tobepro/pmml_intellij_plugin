// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AggregateElemType interface.
 */
public interface Aggregate extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the function child.
	 * @return the value of the function child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Function> getFunction();


	/**
	 * Returns the value of the groupField child.
	 * @return the value of the groupField child.
	 */
	@NotNull
	GenericAttributeValue<String> getGroupField();


	/**
	 * Returns the value of the sqlWhere child.
	 * @return the value of the sqlWhere child.
	 */
	@NotNull
	GenericAttributeValue<String> getSqlWhere();


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
