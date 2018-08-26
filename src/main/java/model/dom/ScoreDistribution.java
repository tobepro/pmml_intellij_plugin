// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ScoreDistributionElemType interface.
 */
public interface ScoreDistribution extends DomElement {

	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the recordCount child.
	 * @return the value of the recordCount child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getRecordCount();


	/**
	 * Returns the value of the confidence child.
	 * @return the value of the confidence child.
	 */
	@NotNull
	GenericAttributeValue<Double> getConfidence();


	/**
	 * Returns the value of the probability child.
	 * @return the value of the probability child.
	 */
	@NotNull
	GenericAttributeValue<Double> getProbability();


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
