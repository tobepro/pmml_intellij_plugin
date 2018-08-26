// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SupportVectorMachineElemType interface.
 */
public interface SupportVectorMachine extends DomElement {

	/**
	 * Returns the value of the targetCategory child.
	 * @return the value of the targetCategory child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetCategory();


	/**
	 * Returns the value of the alternateTargetCategory child.
	 * @return the value of the alternateTargetCategory child.
	 */
	@NotNull
	GenericAttributeValue<String> getAlternateTargetCategory();


	/**
	 * Returns the value of the threshold child.
	 * @return the value of the threshold child.
	 */
	@NotNull
	GenericAttributeValue<Double> getThreshold();


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
	 * Returns the value of the SupportVectors child.
	 * @return the value of the SupportVectors child.
	 */
	@NotNull
	SupportVectors getSupportVectors();


	/**
	 * Returns the value of the Coefficients child.
	 * @return the value of the Coefficients child.
	 */
	@NotNull
	@Required
	Coefficients getCoefficients();


}
