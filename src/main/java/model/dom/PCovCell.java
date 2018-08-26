// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:PCovCellElemType interface.
 */
public interface PCovCell extends DomElement {

	/**
	 * Returns the value of the pRow child.
	 * @return the value of the pRow child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getPRow();


	/**
	 * Returns the value of the pCol child.
	 * @return the value of the pCol child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getPCol();


	/**
	 * Returns the value of the tRow child.
	 * @return the value of the tRow child.
	 */
	@NotNull
	GenericAttributeValue<String> getTRow();


	/**
	 * Returns the value of the tCol child.
	 * @return the value of the tCol child.
	 */
	@NotNull
	GenericAttributeValue<String> getTCol();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getValue();


	/**
	 * Returns the value of the targetCategory child.
	 * @return the value of the targetCategory child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetCategory();


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
