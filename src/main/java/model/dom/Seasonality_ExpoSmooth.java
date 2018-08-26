// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:Seasonality_ExpoSmoothElemType interface.
 */
public interface Seasonality_ExpoSmooth extends DomElement {

	/**
	 * Returns the value of the type child.
	 * @return the value of the type child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Type> getType();


	/**
	 * Returns the value of the period child.
	 * @return the value of the period child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getPeriod();


	/**
	 * Returns the value of the unit child.
	 * @return the value of the unit child.
	 */
	@NotNull
	GenericAttributeValue<String> getUnit();


	/**
	 * Returns the value of the phase child.
	 * @return the value of the phase child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getPhase();


	/**
	 * Returns the value of the delta child.
	 * @return the value of the delta child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDelta();


	/**
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	Array getArray();


}
