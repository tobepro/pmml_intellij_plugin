// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SupportVectorMachineModelElemType interface.
 */
public interface SupportVectorMachineModel extends DomElement {

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
	 * Returns the value of the threshold child.
	 * @return the value of the threshold child.
	 */
	@NotNull
	GenericAttributeValue<Double> getThreshold();


	/**
	 * Returns the value of the svmRepresentation child.
	 * @return the value of the svmRepresentation child.
	 */
	@NotNull
	GenericAttributeValue<SVMREPRESENTATION> getSvmRepresentation();


	/**
	 * Returns the value of the classificationMethod child.
	 * @return the value of the classificationMethod child.
	 */
	@NotNull
	GenericAttributeValue<SVMCLASSIFICATIONMETHOD> getClassificationMethod();


	/**
	 * Returns the value of the maxWins child.
	 * @return the value of the maxWins child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getMaxWins();


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
	 * Returns the value of the VectorDictionary child.
	 * @return the value of the VectorDictionary child.
	 */
	@NotNull
	@Required
	VectorDictionary getVectorDictionary();


	/**
	 * Returns the list of SupportVectorMachine children.
	 * @return the list of SupportVectorMachine children.
	 */
	@NotNull
	@Required
	java.util.List<SupportVectorMachine> getSupportVectorMachines();
	/**
	 * Adds new child to the list of SupportVectorMachine children.
	 * @return created child
	 */
	SupportVectorMachine addSupportVectorMachine();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


	/**
	 * Returns the value of the LinearKernelType child.
	 * @return the value of the LinearKernelType child.
	 */
	@NotNull
	@Required
	LinearKernelType getLinearKernelType();


	/**
	 * Returns the value of the PolynomialKernelType child.
	 * @return the value of the PolynomialKernelType child.
	 */
	@NotNull
	@Required
	PolynomialKernelType getPolynomialKernelType();


	/**
	 * Returns the value of the RadialBasisKernelType child.
	 * @return the value of the RadialBasisKernelType child.
	 */
	@NotNull
	@Required
	RadialBasisKernelType getRadialBasisKernelType();


	/**
	 * Returns the value of the SigmoidKernelType child.
	 * @return the value of the SigmoidKernelType child.
	 */
	@NotNull
	@Required
	SigmoidKernelType getSigmoidKernelType();


}
