// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ModelVerificationElemType interface.
 */
public interface ModelVerification extends DomElement {

	/**
	 * Returns the value of the recordCount child.
	 * @return the value of the recordCount child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getRecordCount();


	/**
	 * Returns the value of the fieldCount child.
	 * @return the value of the fieldCount child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getFieldCount();


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
	 * Returns the value of the VerificationFields child.
	 * @return the value of the VerificationFields child.
	 */
	@NotNull
	@Required
	VerificationFields getVerificationFields();


	/**
	 * Returns the value of the InlineTable child.
	 * @return the value of the InlineTable child.
	 */
	@NotNull
	@Required
	InlineTable getInlineTable();


}
