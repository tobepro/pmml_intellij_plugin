// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ClusteringModelElemType interface.
 */
public interface ClusteringModel extends DomElement {

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
	 * Returns the value of the modelClass child.
	 * @return the value of the modelClass child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<ModelClass> getModelClass();


	/**
	 * Returns the value of the numberOfClusters child.
	 * @return the value of the numberOfClusters child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfClusters();


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
	 * Returns the value of the LocalTransformations child.
	 * @return the value of the LocalTransformations child.
	 */
	@NotNull
	LocalTransformations getLocalTransformations();


	/**
	 * Returns the value of the ComparisonMeasure child.
	 * @return the value of the ComparisonMeasure child.
	 */
	@NotNull
	@Required
	ComparisonMeasure getComparisonMeasure();


	/**
	 * Returns the list of ClusteringField children.
	 * @return the list of ClusteringField children.
	 */
	@NotNull
	@Required
	java.util.List<ClusteringField> getClusteringFields();
	/**
	 * Adds new child to the list of ClusteringField children.
	 * @return created child
	 */
	ClusteringField addClusteringField();


	/**
	 * Returns the value of the MissingValueWeights child.
	 * @return the value of the MissingValueWeights child.
	 */
	@NotNull
	MissingValueWeights getMissingValueWeights();


	/**
	 * Returns the list of Cluster children.
	 * @return the list of Cluster children.
	 */
	@NotNull
	@Required
	java.util.List<Cluster> getClusters();
	/**
	 * Adds new child to the list of Cluster children.
	 * @return created child
	 */
	Cluster addCluster();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


}
