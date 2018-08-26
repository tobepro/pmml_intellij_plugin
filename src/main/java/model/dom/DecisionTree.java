// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DecisionTreeElemType interface.
 */
public interface DecisionTree extends DomElement {

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
	 * Returns the value of the missingValueStrategy child.
	 * @return the value of the missingValueStrategy child.
	 */
	@NotNull
	GenericAttributeValue<MISSINGVALUESTRATEGY> getMissingValueStrategy();


	/**
	 * Returns the value of the missingValuePenalty child.
	 * @return the value of the missingValuePenalty child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMissingValuePenalty();


	/**
	 * Returns the value of the noTrueChildStrategy child.
	 * @return the value of the noTrueChildStrategy child.
	 */
	@NotNull
	GenericAttributeValue<NOTRUECHILDSTRATEGY> getNoTrueChildStrategy();


	/**
	 * Returns the value of the splitCharacteristic child.
	 * @return the value of the splitCharacteristic child.
	 */
	@NotNull
	GenericAttributeValue<SplitCharacteristic> getSplitCharacteristic();


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
	 * Returns the list of ResultField children.
	 * @return the list of ResultField children.
	 */
	@NotNull
	java.util.List<ResultField> getResultFields();
	/**
	 * Adds new child to the list of ResultField children.
	 * @return created child
	 */
	ResultField addResultField();


	/**
	 * Returns the value of the Node child.
	 * @return the value of the Node child.
	 */
	@NotNull
	@Required
	Node getNode();


}
