// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SigmoidKernelTypeElemType interface.
 */
public interface SigmoidKernelType extends DomElement {

	/**
	 * Returns the value of the description child.
	 * @return the value of the description child.
	 */
	@NotNull
	GenericAttributeValue<String> getDescription();


	/**
	 * Returns the value of the gamma child.
	 * @return the value of the gamma child.
	 */
	@NotNull
	GenericAttributeValue<Double> getGamma();


	/**
	 * Returns the value of the coef0 child.
	 * @return the value of the coef0 child.
	 */
	@NotNull
	GenericAttributeValue<Double> getCoef0();


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
