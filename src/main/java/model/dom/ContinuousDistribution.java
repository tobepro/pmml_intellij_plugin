// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ContinuousDistributionElemType interface.
 */
public interface ContinuousDistribution extends DomElement {

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
	 * Returns the value of the TriangularDistributionForBN child.
	 * @return the value of the TriangularDistributionForBN child.
	 */
	@NotNull
	@Required
	TriangularDistributionForBN getTriangularDistributionForBN();


	/**
	 * Returns the value of the NormalDistributionForBN child.
	 * @return the value of the NormalDistributionForBN child.
	 */
	@NotNull
	@Required
	NormalDistributionForBN getNormalDistributionForBN();


	/**
	 * Returns the value of the LognormalDistributionForBN child.
	 * @return the value of the LognormalDistributionForBN child.
	 */
	@NotNull
	@Required
	LognormalDistributionForBN getLognormalDistributionForBN();


	/**
	 * Returns the value of the UniformDistributionForBN child.
	 * @return the value of the UniformDistributionForBN child.
	 */
	@NotNull
	@Required
	UniformDistributionForBN getUniformDistributionForBN();


}
