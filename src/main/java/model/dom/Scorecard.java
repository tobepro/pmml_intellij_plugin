// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import model.dom.enums.BaselineMethod;
import model.dom.enums.MiningFunction;
import model.dom.enums.ReasonCodeAlgorithm;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:ScorecardElemType interface.
 */
public interface Scorecard extends MyDomElement {

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
	GenericAttributeValue<MiningFunction> getFunctionName();


	/**
	 * Returns the value of the algorithmName child.
	 * @return the value of the algorithmName child.
	 */
	@NotNull
	GenericAttributeValue<String> getAlgorithmName();


	/**
	 * Returns the value of the initialScore child.
	 * @return the value of the initialScore child.
	 */
	@NotNull
	GenericAttributeValue<Double> getInitialScore();


	/**
	 * Returns the value of the useReasonCodes child.
	 * @return the value of the useReasonCodes child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getUseReasonCodes();


	/**
	 * Returns the value of the reasonCodeAlgorithm child.
	 * @return the value of the reasonCodeAlgorithm child.
	 */
	@NotNull
	GenericAttributeValue<ReasonCodeAlgorithm> getReasonCodeAlgorithm();


	/**
	 * Returns the value of the baselineScore child.
	 * @return the value of the baselineScore child.
	 */
	@NotNull
	GenericAttributeValue<Double> getBaselineScore();


	/**
	 * Returns the value of the baselineMethod child.
	 * @return the value of the baselineMethod child.
	 */
	@NotNull
	GenericAttributeValue<BaselineMethod> getBaselineMethod();


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
	 * Returns the value of the Targets child.
	 * @return the value of the Targets child.
	 */
	@NotNull
	Targets getTargets();

	/**
	 * Returns the value of the Characteristics child.
	 * @return the value of the Characteristics child.
	 */
	@NotNull
	@Required
	Characteristics getCharacteristics();
}
