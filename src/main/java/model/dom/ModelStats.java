// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ModelStatsElemType interface.
 */
public interface ModelStats extends DomElement {

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
	 * Returns the list of UnivariateStats children.
	 * @return the list of UnivariateStats children.
	 */
	@NotNull
	java.util.List<UnivariateStats> getUnivariateStatses();
	/**
	 * Adds new child to the list of UnivariateStats children.
	 * @return created child
	 */
	UnivariateStats addUnivariateStats();


	/**
	 * Returns the list of MultivariateStats children.
	 * @return the list of MultivariateStats children.
	 */
	@NotNull
	java.util.List<MultivariateStats> getMultivariateStatses();
	/**
	 * Adds new child to the list of MultivariateStats children.
	 * @return created child
	 */
	MultivariateStats addMultivariateStats();


}
