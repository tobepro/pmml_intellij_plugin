// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TestDistributionsElemType interface.
 */
public interface TestDistributions extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the testStatistic child.
	 * @return the value of the testStatistic child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<BASELINETESTSTATISTIC> getTestStatistic();


	/**
	 * Returns the value of the resetValue child.
	 * @return the value of the resetValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getResetValue();


	/**
	 * Returns the value of the windowSize child.
	 * @return the value of the windowSize child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getWindowSize();


	/**
	 * Returns the value of the weightField child.
	 * @return the value of the weightField child.
	 */
	@NotNull
	GenericAttributeValue<String> getWeightField();


	/**
	 * Returns the value of the normalizationScheme child.
	 * @return the value of the normalizationScheme child.
	 */
	@NotNull
	GenericAttributeValue<String> getNormalizationScheme();


	/**
	 * Returns the value of the Baseline child.
	 * @return the value of the Baseline child.
	 */
	@NotNull
	@Required
	Baseline getBaseline();


	/**
	 * Returns the value of the Alternate child.
	 * @return the value of the Alternate child.
	 */
	@NotNull
	Alternate getAlternate();


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
