// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AnovaRowElemType interface.
 */
public interface AnovaRow extends DomElement {

	/**
	 * Returns the value of the type child.
	 * @return the value of the type child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Type> getType();


	/**
	 * Returns the value of the sumOfSquares child.
	 * @return the value of the sumOfSquares child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getSumOfSquares();


	/**
	 * Returns the value of the degreesOfFreedom child.
	 * @return the value of the degreesOfFreedom child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getDegreesOfFreedom();


	/**
	 * Returns the value of the meanOfSquares child.
	 * @return the value of the meanOfSquares child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMeanOfSquares();


	/**
	 * Returns the value of the fValue child.
	 * @return the value of the fValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getFValue();


	/**
	 * Returns the value of the pValue child.
	 * @return the value of the pValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPValue();


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
