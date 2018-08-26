// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NearestNeighborModelElemType interface.
 */
public interface NearestNeighborModel extends DomElement {

	/**
	 * Returns the value of the modelName child.
	 * @return the value of the modelName child.
	 */
	@NotNull
	GenericAttributeValue<String> getModelName();


	/**
	 * Returns the value of the functionName child.
	 * @return the value of the functionName child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<MININGFUNCTION> getFunctionName();


	/**
	 * Returns the value of the algorithmName child.
	 * @return the value of the algorithmName child.
	 */
	@NotNull
	GenericAttributeValue<String> getAlgorithmName();


	/**
	 * Returns the value of the numberOfNeighbors child.
	 * @return the value of the numberOfNeighbors child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfNeighbors();


	/**
	 * Returns the value of the continuousScoringMethod child.
	 * @return the value of the continuousScoringMethod child.
	 */
	@NotNull
	GenericAttributeValue<CONTSCORINGMETHOD> getContinuousScoringMethod();


	/**
	 * Returns the value of the categoricalScoringMethod child.
	 * @return the value of the categoricalScoringMethod child.
	 */
	@NotNull
	GenericAttributeValue<CATSCORINGMETHOD> getCategoricalScoringMethod();


	/**
	 * Returns the value of the instanceIdVariable child.
	 * @return the value of the instanceIdVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getInstanceIdVariable();


	/**
	 * Returns the value of the threshold child.
	 * @return the value of the threshold child.
	 */
	@NotNull
	GenericAttributeValue<Double> getThreshold();


	/**
	 * Returns the value of the isScorable child.
	 * @return the value of the isScorable child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getIsScorable();


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
	 * Returns the value of the MiningSchema child.
	 * @return the value of the MiningSchema child.
	 */
	@NotNull
	@Required
	MiningSchema getMiningSchema();


	/**
	 * Returns the value of the Output child.
	 * @return the value of the Output child.
	 */
	@NotNull
	Output getOutput();


	/**
	 * Returns the value of the ModelStats child.
	 * @return the value of the ModelStats child.
	 */
	@NotNull
	ModelStats getModelStats();


	/**
	 * Returns the value of the ModelExplanation child.
	 * @return the value of the ModelExplanation child.
	 */
	@NotNull
	ModelExplanation getModelExplanation();


	/**
	 * Returns the value of the Targets child.
	 * @return the value of the Targets child.
	 */
	@NotNull
	Targets getTargets();


	/**
	 * Returns the value of the LocalTransformations child.
	 * @return the value of the LocalTransformations child.
	 */
	@NotNull
	LocalTransformations getLocalTransformations();


	/**
	 * Returns the value of the TrainingInstances child.
	 * @return the value of the TrainingInstances child.
	 */
	@NotNull
	@Required
	TrainingInstances getTrainingInstances();


	/**
	 * Returns the value of the ComparisonMeasure child.
	 * @return the value of the ComparisonMeasure child.
	 */
	@NotNull
	@Required
	ComparisonMeasure getComparisonMeasure();


	/**
	 * Returns the value of the KNNInputs child.
	 * @return the value of the KNNInputs child.
	 */
	@NotNull
	@Required
	KNNInputs getKNNInputs();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


}
