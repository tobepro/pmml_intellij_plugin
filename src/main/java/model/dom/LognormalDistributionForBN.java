// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:LognormalDistributionForBNElemType interface.
 */
public interface LognormalDistributionForBN extends DomElement {

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
	 * Returns the value of the Mean child.
	 * @return the value of the Mean child.
	 */
	@NotNull
	@Required
	Mean getMean();


	/**
	 * Returns the value of the Variance child.
	 * @return the value of the Variance child.
	 */
	@NotNull
	@Required
	Variance getVariance();


}
