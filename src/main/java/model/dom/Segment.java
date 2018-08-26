// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SegmentElemType interface.
 */
public interface Segment extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the weight child.
	 * @return the value of the weight child.
	 */
	@NotNull
	GenericAttributeValue<Double> getWeight();


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
	 * Returns the value of the SimplePredicate child.
	 * @return the value of the SimplePredicate child.
	 */
	@NotNull
	@Required
	SimplePredicate getSimplePredicate();


	/**
	 * Returns the value of the CompoundPredicate child.
	 * @return the value of the CompoundPredicate child.
	 */
	@NotNull
	@Required
	CompoundPredicate getCompoundPredicate();


	/**
	 * Returns the value of the SimpleSetPredicate child.
	 * @return the value of the SimpleSetPredicate child.
	 */
	@NotNull
	@Required
	SimpleSetPredicate getSimpleSetPredicate();


	/**
	 * Returns the value of the True child.
	 * @return the value of the True child.
	 */
	@NotNull
	@Required
	True getTrue();


	/**
	 * Returns the value of the False child.
	 * @return the value of the False child.
	 */
	@NotNull
	@Required
	False getFalse();


	/**
	 * Returns the value of the AssociationModel child.
	 * @return the value of the AssociationModel child.
	 */
	@NotNull
	@Required
	AssociationModel getAssociationModel();


	/**
	 * Returns the value of the BayesianNetworkModel child.
	 * @return the value of the BayesianNetworkModel child.
	 */
	@NotNull
	@Required
	BayesianNetworkModel getBayesianNetworkModel();


	/**
	 * Returns the value of the BaselineModel child.
	 * @return the value of the BaselineModel child.
	 */
	@NotNull
	@Required
	BaselineModel getBaselineModel();


	/**
	 * Returns the value of the ClusteringModel child.
	 * @return the value of the ClusteringModel child.
	 */
	@NotNull
	@Required
	ClusteringModel getClusteringModel();


	/**
	 * Returns the value of the GaussianProcessModel child.
	 * @return the value of the GaussianProcessModel child.
	 */
	@NotNull
	@Required
	GaussianProcessModel getGaussianProcessModel();


	/**
	 * Returns the value of the GeneralRegressionModel child.
	 * @return the value of the GeneralRegressionModel child.
	 */
	@NotNull
	@Required
	GeneralRegressionModel getGeneralRegressionModel();


	/**
	 * Returns the value of the MiningModel child.
	 * @return the value of the MiningModel child.
	 */
	@NotNull
	@Required
	MiningModel getMiningModel();


	/**
	 * Returns the value of the NaiveBayesModel child.
	 * @return the value of the NaiveBayesModel child.
	 */
	@NotNull
	@Required
	NaiveBayesModel getNaiveBayesModel();


	/**
	 * Returns the value of the NearestNeighborModel child.
	 * @return the value of the NearestNeighborModel child.
	 */
	@NotNull
	@Required
	NearestNeighborModel getNearestNeighborModel();


	/**
	 * Returns the value of the NeuralNetwork child.
	 * @return the value of the NeuralNetwork child.
	 */
	@NotNull
	@Required
	NeuralNetwork getNeuralNetwork();


	/**
	 * Returns the value of the RegressionModel child.
	 * @return the value of the RegressionModel child.
	 */
	@NotNull
	@Required
	RegressionModel getRegressionModel();


	/**
	 * Returns the value of the RuleSetModel child.
	 * @return the value of the RuleSetModel child.
	 */
	@NotNull
	@Required
	RuleSetModel getRuleSetModel();


	/**
	 * Returns the value of the SequenceModel child.
	 * @return the value of the SequenceModel child.
	 */
	@NotNull
	@Required
	SequenceModel getSequenceModel();


	/**
	 * Returns the value of the Scorecard child.
	 * @return the value of the Scorecard child.
	 */
	@NotNull
	@Required
	Scorecard getScorecard();


	/**
	 * Returns the value of the SupportVectorMachineModel child.
	 * @return the value of the SupportVectorMachineModel child.
	 */
	@NotNull
	@Required
	SupportVectorMachineModel getSupportVectorMachineModel();


	/**
	 * Returns the value of the TextModel child.
	 * @return the value of the TextModel child.
	 */
	@NotNull
	@Required
	TextModel getTextModel();


	/**
	 * Returns the value of the TimeSeriesModel child.
	 * @return the value of the TimeSeriesModel child.
	 */
	@NotNull
	@Required
	TimeSeriesModel getTimeSeriesModel();


	/**
	 * Returns the value of the TreeModel child.
	 * @return the value of the TreeModel child.
	 */
	@NotNull
	@Required
	TreeModel getTreeModel();


}
