// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ROCElemType interface.
 */
public interface ROC extends DomElement {

	/**
	 * Returns the value of the positiveTargetFieldValue child.
	 * @return the value of the positiveTargetFieldValue child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getPositiveTargetFieldValue();


	/**
	 * Returns the value of the positiveTargetFieldDisplayValue child.
	 * @return the value of the positiveTargetFieldDisplayValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getPositiveTargetFieldDisplayValue();


	/**
	 * Returns the value of the negativeTargetFieldValue child.
	 * @return the value of the negativeTargetFieldValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getNegativeTargetFieldValue();


	/**
	 * Returns the value of the negativeTargetFieldDisplayValue child.
	 * @return the value of the negativeTargetFieldDisplayValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getNegativeTargetFieldDisplayValue();


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
	 * Returns the value of the ROCGraph child.
	 * @return the value of the ROCGraph child.
	 */
	@NotNull
	@Required
	ROCGraph getROCGraph();


}
