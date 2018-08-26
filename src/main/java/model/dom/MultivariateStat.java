// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:MultivariateStatElemType interface.
 */
public interface MultivariateStat extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the category child.
	 * @return the value of the category child.
	 */
	@NotNull
	GenericAttributeValue<String> getCategory();


	/**
	 * Returns the value of the exponent child.
	 * @return the value of the exponent child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getExponent();


	/**
	 * Returns the value of the isIntercept child.
	 * @return the value of the isIntercept child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getIsIntercept();


	/**
	 * Returns the value of the importance child.
	 * @return the value of the importance child.
	 */
	@NotNull
	GenericAttributeValue<Double> getImportance();


	/**
	 * Returns the value of the stdError child.
	 * @return the value of the stdError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getStdError();


	/**
	 * Returns the value of the tValue child.
	 * @return the value of the tValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getTValue();


	/**
	 * Returns the value of the chiSquareValue child.
	 * @return the value of the chiSquareValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getChiSquareValue();


	/**
	 * Returns the value of the fStatistic child.
	 * @return the value of the fStatistic child.
	 */
	@NotNull
	GenericAttributeValue<Double> getFStatistic();


	/**
	 * Returns the value of the dF child.
	 * @return the value of the dF child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDF();


	/**
	 * Returns the value of the pValueAlpha child.
	 * @return the value of the pValueAlpha child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPValueAlpha();


	/**
	 * Returns the value of the pValueInitial child.
	 * @return the value of the pValueInitial child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPValueInitial();


	/**
	 * Returns the value of the pValueFinal child.
	 * @return the value of the pValueFinal child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPValueFinal();


	/**
	 * Returns the value of the confidenceLevel child.
	 * @return the value of the confidenceLevel child.
	 */
	@NotNull
	GenericAttributeValue<Double> getConfidenceLevel();


	/**
	 * Returns the value of the confidenceLowerBound child.
	 * @return the value of the confidenceLowerBound child.
	 */
	@NotNull
	GenericAttributeValue<Double> getConfidenceLowerBound();


	/**
	 * Returns the value of the confidenceUpperBound child.
	 * @return the value of the confidenceUpperBound child.
	 */
	@NotNull
	GenericAttributeValue<Double> getConfidenceUpperBound();


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
