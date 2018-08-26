// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:ResultFieldElemType interface.
 */
public interface ResultField extends DomElement {

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
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	GenericAttributeValue<DataType> getDataType();


	/**
	 * Returns the value of the feature child.
	 * @return the value of the feature child.
	 */
	@NotNull
	GenericAttributeValue<RESULTFEATURE> getFeature();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


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
