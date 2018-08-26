// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:RegressionTableElemType interface.
 */
public interface RegressionTable extends DomElement {

	/**
	 * Returns the value of the intercept child.
	 * @return the value of the intercept child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getIntercept();


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
	 * Returns the list of NumericPredictor children.
	 * @return the list of NumericPredictor children.
	 */
	@NotNull
	java.util.List<NumericPredictor> getNumericPredictors();
	/**
	 * Adds new child to the list of NumericPredictor children.
	 * @return created child
	 */
	NumericPredictor addNumericPredictor();


	/**
	 * Returns the list of CategoricalPredictor children.
	 * @return the list of CategoricalPredictor children.
	 */
	@NotNull
	java.util.List<CategoricalPredictor> getCategoricalPredictors();
	/**
	 * Adds new child to the list of CategoricalPredictor children.
	 * @return created child
	 */
	CategoricalPredictor addCategoricalPredictor();


	/**
	 * Returns the list of PredictorTerm children.
	 * @return the list of PredictorTerm children.
	 */
	@NotNull
	java.util.List<PredictorTerm> getPredictorTerms();
	/**
	 * Adds new child to the list of PredictorTerm children.
	 * @return created child
	 */
	PredictorTerm addPredictorTerm();


}
