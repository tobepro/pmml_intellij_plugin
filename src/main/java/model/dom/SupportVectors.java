// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SupportVectorsElemType interface.
 */
public interface SupportVectors extends DomElement {

	/**
	 * Returns the value of the numberOfSupportVectors child.
	 * @return the value of the numberOfSupportVectors child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfSupportVectors();


	/**
	 * Returns the value of the numberOfAttributes child.
	 * @return the value of the numberOfAttributes child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfAttributes();


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
	 * Returns the list of SupportVector children.
	 * @return the list of SupportVector children.
	 */
	@NotNull
	@Required
	java.util.List<SupportVector> getSupportVectors();
	/**
	 * Adds new child to the list of SupportVector children.
	 * @return created child
	 */
	SupportVector addSupportVector();


}
