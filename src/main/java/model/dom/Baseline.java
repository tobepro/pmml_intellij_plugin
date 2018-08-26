// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:BaselineElemType interface.
 */
public interface Baseline extends DomElement, CONTINUOUSDISTRIBUTIONTYPES {

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
	 * Returns the value of the CountTable child.
	 * @return the value of the CountTable child.
	 */
	@NotNull
	@Required
	COUNTTABLETYPE getCountTable();


	/**
	 * Returns the value of the NormalizedCountTable child.
	 * @return the value of the NormalizedCountTable child.
	 */
	@NotNull
	@Required
	COUNTTABLETYPE getNormalizedCountTable();


	/**
	 * Returns the list of FieldRef children.
	 * @return the list of FieldRef children.
	 */
	@NotNull
	@Required
	java.util.List<FieldRef> getFieldRefs();
	/**
	 * Adds new child to the list of FieldRef children.
	 * @return created child
	 */
	FieldRef addFieldRef();


	/**
	 * Returns the value of the AnyDistribution child.
	 * @return the value of the AnyDistribution child.
	 */
	@NotNull
	@Required
	AnyDistribution getAnyDistribution();


	/**
	 * Returns the value of the GaussianDistribution child.
	 * @return the value of the GaussianDistribution child.
	 */
	@NotNull
	@Required
	GaussianDistribution getGaussianDistribution();


	/**
	 * Returns the value of the PoissonDistribution child.
	 * @return the value of the PoissonDistribution child.
	 */
	@NotNull
	@Required
	PoissonDistribution getPoissonDistribution();


	/**
	 * Returns the value of the UniformDistribution child.
	 * @return the value of the UniformDistribution child.
	 */
	@NotNull
	@Required
	UniformDistribution getUniformDistribution();


}
