// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:GaussianDistributionElemType interface.
 */
public interface GaussianDistribution extends DomElement {

	/**
	 * Returns the value of the mean child.
	 * @return the value of the mean child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getMean();


	/**
	 * Returns the value of the variance child.
	 * @return the value of the variance child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getVariance();


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
