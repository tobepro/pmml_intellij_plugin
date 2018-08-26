// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:PredictiveModelQualityElemType interface.
 */
public interface PredictiveModelQuality extends DomElement {

	/**
	 * Returns the value of the targetField child.
	 * @return the value of the targetField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getTargetField();


	/**
	 * Returns the value of the dataName child.
	 * @return the value of the dataName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDataName();


	/**
	 * Returns the value of the dataUsage child.
	 * @return the value of the dataUsage child.
	 */
	@NotNull
	GenericAttributeValue<DataUsage> getDataUsage();


	/**
	 * Returns the value of the meanError child.
	 * @return the value of the meanError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMeanError();


	/**
	 * Returns the value of the meanAbsoluteError child.
	 * @return the value of the meanAbsoluteError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMeanAbsoluteError();


	/**
	 * Returns the value of the meanSquaredError child.
	 * @return the value of the meanSquaredError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMeanSquaredError();


	/**
	 * Returns the value of the rootMeanSquaredError child.
	 * @return the value of the rootMeanSquaredError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRootMeanSquaredError();


	/**
	 * Returns the value of the r-squared child.
	 * @return the value of the r-squared child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRSquared();


	/**
	 * Returns the value of the adj-r-squared child.
	 * @return the value of the adj-r-squared child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAdjRSquared();


	/**
	 * Returns the value of the sumSquaredError child.
	 * @return the value of the sumSquaredError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSumSquaredError();


	/**
	 * Returns the value of the sumSquaredRegression child.
	 * @return the value of the sumSquaredRegression child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSumSquaredRegression();


	/**
	 * Returns the value of the numOfRecords child.
	 * @return the value of the numOfRecords child.
	 */
	@NotNull
	GenericAttributeValue<Double> getNumOfRecords();


	/**
	 * Returns the value of the numOfRecordsWeighted child.
	 * @return the value of the numOfRecordsWeighted child.
	 */
	@NotNull
	GenericAttributeValue<Double> getNumOfRecordsWeighted();


	/**
	 * Returns the value of the numOfPredictors child.
	 * @return the value of the numOfPredictors child.
	 */
	@NotNull
	GenericAttributeValue<Double> getNumOfPredictors();


	/**
	 * Returns the value of the degreesOfFreedom child.
	 * @return the value of the degreesOfFreedom child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDegreesOfFreedom();


	/**
	 * Returns the value of the fStatistic child.
	 * @return the value of the fStatistic child.
	 */
	@NotNull
	GenericAttributeValue<Double> getFStatistic();


	/**
	 * Returns the value of the AIC child.
	 * @return the value of the AIC child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAIC();


	/**
	 * Returns the value of the BIC child.
	 * @return the value of the BIC child.
	 */
	@NotNull
	GenericAttributeValue<Double> getBIC();


	/**
	 * Returns the value of the AICc child.
	 * @return the value of the AICc child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAICc();


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
	 * Returns the value of the ConfusionMatrix child.
	 * @return the value of the ConfusionMatrix child.
	 */
	@NotNull
	ConfusionMatrix getConfusionMatrix();


	/**
	 * Returns the list of LiftData children.
	 * @return the list of LiftData children.
	 */
	@NotNull
	java.util.List<LiftData> getLiftDatas();
	/**
	 * Adds new child to the list of LiftData children.
	 * @return created child
	 */
	LiftData addLiftData();


	/**
	 * Returns the value of the ROC child.
	 * @return the value of the ROC child.
	 */
	@NotNull
	ROC getROC();


}
