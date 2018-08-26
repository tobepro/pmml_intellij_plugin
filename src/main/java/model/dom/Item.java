// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ItemElemType interface.
 */
public interface Item extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the category child.
	 * @return the value of the category child.
	 */
	@NotNull
	GenericAttributeValue<String> getCategory();


	/**
	 * Returns the value of the mappedValue child.
	 * @return the value of the mappedValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getMappedValue();


	/**
	 * Returns the value of the weight child.
	 * @return the value of the weight child.
	 */
	@NotNull
	GenericAttributeValue<Double> getWeight();


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
