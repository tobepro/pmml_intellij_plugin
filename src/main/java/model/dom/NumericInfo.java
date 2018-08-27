// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:NumericInfoElemType interface.
 */
public interface NumericInfo extends MyDomElement {

	/**
	 * Returns the value of the minimum child.
	 * @return the value of the minimum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimum();


	/**
	 * Returns the value of the maximum child.
	 * @return the value of the maximum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMaximum();


	/**
	 * Returns the value of the mean child.
	 * @return the value of the mean child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMean();


	/**
	 * Returns the value of the standardDeviation child.
	 * @return the value of the standardDeviation child.
	 */
	@NotNull
	GenericAttributeValue<Double> getStandardDeviation();


	/**
	 * Returns the value of the median child.
	 * @return the value of the median child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMedian();


	/**
	 * Returns the value of the interQuartileRange child.
	 * @return the value of the interQuartileRange child.
	 */
	@NotNull
	GenericAttributeValue<Double> getInterQuartileRange();


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
	 * Returns the list of Quantile children.
	 * @return the list of Quantile children.
	 */
	@NotNull
	java.util.List<Quantile> getQuantiles();
	/**
	 * Adds new child to the list of Quantile children.
	 * @return created child
	 */
	Quantile addQuantile();


}
