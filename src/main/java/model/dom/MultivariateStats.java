// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:MultivariateStatsElemType interface.
 */
public interface MultivariateStats extends DomElement {

	/**
	 * Returns the value of the targetCategory child.
	 * @return the value of the targetCategory child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetCategory();


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
	 * Returns the list of MultivariateStat children.
	 * @return the list of MultivariateStat children.
	 */
	@NotNull
	@Required
	java.util.List<MultivariateStat> getMultivariateStats();
	/**
	 * Adds new child to the list of MultivariateStat children.
	 * @return created child
	 */
	MultivariateStat addMultivariateStat();


}
