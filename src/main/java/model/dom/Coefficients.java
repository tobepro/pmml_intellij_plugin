// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:CoefficientsElemType interface.
 */
public interface Coefficients extends DomElement {

	/**
	 * Returns the value of the numberOfCoefficients child.
	 * @return the value of the numberOfCoefficients child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfCoefficients();


	/**
	 * Returns the value of the absoluteValue child.
	 * @return the value of the absoluteValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAbsoluteValue();


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
	 * Returns the list of Coefficient children.
	 * @return the list of Coefficient children.
	 */
	@NotNull
	@Required
	java.util.List<Coefficient> getCoefficients();
	/**
	 * Adds new child to the list of Coefficient children.
	 * @return created child
	 */
	Coefficient addCoefficient();


}
