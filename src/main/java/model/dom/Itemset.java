// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ItemsetElemType interface.
 */
public interface Itemset extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the support child.
	 * @return the value of the support child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSupport();


	/**
	 * Returns the value of the numberOfItems child.
	 * @return the value of the numberOfItems child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfItems();


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
	 * Returns the list of ItemRef children.
	 * @return the list of ItemRef children.
	 */
	@NotNull
	java.util.List<ItemRef> getItemRefs();
	/**
	 * Adds new child to the list of ItemRef children.
	 * @return created child
	 */
	ItemRef addItemRef();


}
