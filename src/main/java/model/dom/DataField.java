// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import model.dom.enums.DataType;
import model.dom.enums.Optype;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:DataFieldElemType interface.
 */
public interface DataField extends MyDomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the displayName child.
	 * @return the value of the displayName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisplayName();


	/**
	 * Returns the value of the optype child.
	 * @return the value of the optype child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<DataType> getDataType();


	/**
	 * Returns the value of the taxonomy child.
	 * @return the value of the taxonomy child.
	 */
	@NotNull
	GenericAttributeValue<String> getTaxonomy();

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
	 * Returns the list of Interval children.
	 * @return the list of Interval children.
	 */
	@NotNull
	java.util.List<Interval> getIntervals();
	/**
	 * Adds new child to the list of Interval children.
	 * @return created child
	 */
	Interval addInterval();


	/**
	 * Returns the list of Value children.
	 * @return the list of Value children.
	 */
	@NotNull
	java.util.List<Value> getValues();
	/**
	 * Adds new child to the list of Value children.
	 * @return created child
	 */
	Value addValue();


}
