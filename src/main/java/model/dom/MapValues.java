// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:MapValuesElemType interface.
 */
public interface MapValues extends DomElement {

	/**
	 * Returns the value of the mapMissingTo child.
	 * @return the value of the mapMissingTo child.
	 */
	@NotNull
	GenericAttributeValue<String> getMapMissingTo();


	/**
	 * Returns the value of the defaultValue child.
	 * @return the value of the defaultValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getDefaultValue();


	/**
	 * Returns the value of the outputColumn child.
	 * @return the value of the outputColumn child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getOutputColumn();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	GenericAttributeValue<DataType> getDataType();


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
