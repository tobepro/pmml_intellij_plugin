// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ChildParentElemType interface.
 */
public interface ChildParent extends DomElement {

	/**
	 * Returns the value of the childField child.
	 * @return the value of the childField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getChildField();


	/**
	 * Returns the value of the parentField child.
	 * @return the value of the parentField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getParentField();


	/**
	 * Returns the value of the parentLevelField child.
	 * @return the value of the parentLevelField child.
	 */
	@NotNull
	GenericAttributeValue<String> getParentLevelField();


	/**
	 * Returns the value of the isRecursive child.
	 * @return the value of the isRecursive child.
	 */
	@NotNull
	GenericAttributeValue<IsRecursive> getIsRecursive();


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
	 * Returns the list of FieldColumnPair children.
	 * @return the list of FieldColumnPair children.
	 */
	@NotNull
	java.util.List<FieldColumnPair> getFieldColumnPairs();
	/**
	 * Adds new child to the list of FieldColumnPair children.
	 * @return created child
	 */
	FieldColumnPair addFieldColumnPair();


	/**
	 * Returns the value of the TableLocator child.
	 * @return the value of the TableLocator child.
	 */
	@NotNull
	@Required
	TableLocator getTableLocator();


	/**
	 * Returns the value of the InlineTable child.
	 * @return the value of the InlineTable child.
	 */
	@NotNull
	@Required
	InlineTable getInlineTable();


}
