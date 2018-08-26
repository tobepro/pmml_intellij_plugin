// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:COUNT-TABLE-TYPE interface.
 */
public interface COUNTTABLETYPE extends DomElement {

	/**
	 * Returns the value of the sample child.
	 * @return the value of the sample child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSample();


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
	 * Returns the list of FieldValue children.
	 * @return the list of FieldValue children.
	 */
	@NotNull
	@Required
	java.util.List<FieldValue> getFieldValues();
	/**
	 * Adds new child to the list of FieldValue children.
	 * @return created child
	 */
	FieldValue addFieldValue();


	/**
	 * Returns the list of FieldValueCount children.
	 * @return the list of FieldValueCount children.
	 */
	@NotNull
	@Required
	java.util.List<FieldValueCount> getFieldValueCounts();
	/**
	 * Adds new child to the list of FieldValueCount children.
	 * @return created child
	 */
	FieldValueCount addFieldValueCount();


}
