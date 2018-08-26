// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:UniformDistributionElemType interface.
 */
public interface UniformDistribution extends DomElement {

	/**
	 * Returns the value of the lower child.
	 * @return the value of the lower child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getLower();


	/**
	 * Returns the value of the upper child.
	 * @return the value of the upper child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getUpper();


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
