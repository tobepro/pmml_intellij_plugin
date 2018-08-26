// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NeuralNetworkElemType interface.
 */
public interface NeuralNetwork extends DomElement {

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
	 * Returns the value of the activationFunction child.
	 * @return the value of the activationFunction child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<ACTIVATIONFUNCTION> getActivationFunction();


	/**
	 * Returns the value of the normalizationMethod child.
	 * @return the value of the normalizationMethod child.
	 */
	@NotNull
	GenericAttributeValue<NNNORMALIZATIONMETHOD> getNormalizationMethod();


	/**
	 * Returns the value of the threshold child.
	 * @return the value of the threshold child.
	 */
	@NotNull
	GenericAttributeValue<Double> getThreshold();


	/**
	 * Returns the value of the width child.
	 * @return the value of the width child.
	 */
	@NotNull
	GenericAttributeValue<Double> getWidth();


	/**
	 * Returns the value of the altitude child.
	 * @return the value of the altitude child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAltitude();


	/**
	 * Returns the value of the numberOfLayers child.
	 * @return the value of the numberOfLayers child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfLayers();


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
	 * Returns the value of the NeuralInputs child.
	 * @return the value of the NeuralInputs child.
	 */
	@NotNull
	@Required
	NeuralInputs getNeuralInputs();


	/**
	 * Returns the list of NeuralLayer children.
	 * @return the list of NeuralLayer children.
	 */
	@NotNull
	@Required
	java.util.List<NeuralLayer> getNeuralLayers();
	/**
	 * Adds new child to the list of NeuralLayer children.
	 * @return created child
	 */
	NeuralLayer addNeuralLayer();


	/**
	 * Returns the value of the NeuralOutputs child.
	 * @return the value of the NeuralOutputs child.
	 */
	@NotNull
	NeuralOutputs getNeuralOutputs();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


}
