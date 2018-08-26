// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:GeneralRegressionModelElemType interface.
 */
public interface GeneralRegressionModel extends DomElement {

	/**
	 * Returns the value of the targetVariableName child.
	 * @return the value of the targetVariableName child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetVariableName();


	/**
	 * Returns the value of the modelType child.
	 * @return the value of the modelType child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<ModelType> getModelType();


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
	 * Returns the value of the targetReferenceCategory child.
	 * @return the value of the targetReferenceCategory child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetReferenceCategory();


	/**
	 * Returns the value of the cumulativeLink child.
	 * @return the value of the cumulativeLink child.
	 */
	@NotNull
	GenericAttributeValue<CUMULATIVELINKFUNCTION> getCumulativeLink();


	/**
	 * Returns the value of the linkFunction child.
	 * @return the value of the linkFunction child.
	 */
	@NotNull
	GenericAttributeValue<LINKFUNCTION> getLinkFunction();


	/**
	 * Returns the value of the linkParameter child.
	 * @return the value of the linkParameter child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLinkParameter();


	/**
	 * Returns the value of the trialsVariable child.
	 * @return the value of the trialsVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getTrialsVariable();


	/**
	 * Returns the value of the trialsValue child.
	 * @return the value of the trialsValue child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getTrialsValue();


	/**
	 * Returns the value of the distribution child.
	 * @return the value of the distribution child.
	 */
	@NotNull
	GenericAttributeValue<Distribution> getDistribution();


	/**
	 * Returns the value of the distParameter child.
	 * @return the value of the distParameter child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDistParameter();


	/**
	 * Returns the value of the offsetVariable child.
	 * @return the value of the offsetVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getOffsetVariable();


	/**
	 * Returns the value of the offsetValue child.
	 * @return the value of the offsetValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getOffsetValue();


	/**
	 * Returns the value of the modelDF child.
	 * @return the value of the modelDF child.
	 */
	@NotNull
	GenericAttributeValue<Double> getModelDF();


	/**
	 * Returns the value of the endTimeVariable child.
	 * @return the value of the endTimeVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getEndTimeVariable();


	/**
	 * Returns the value of the startTimeVariable child.
	 * @return the value of the startTimeVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getStartTimeVariable();


	/**
	 * Returns the value of the subjectIDVariable child.
	 * @return the value of the subjectIDVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getSubjectIDVariable();


	/**
	 * Returns the value of the statusVariable child.
	 * @return the value of the statusVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getStatusVariable();


	/**
	 * Returns the value of the baselineStrataVariable child.
	 * @return the value of the baselineStrataVariable child.
	 */
	@NotNull
	GenericAttributeValue<String> getBaselineStrataVariable();


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
	 * Returns the value of the ParameterList child.
	 * @return the value of the ParameterList child.
	 */
	@NotNull
	@Required
	ParameterList getParameterList();


	/**
	 * Returns the value of the FactorList child.
	 * @return the value of the FactorList child.
	 */
	@NotNull
	FactorList getFactorList();


	/**
	 * Returns the value of the CovariateList child.
	 * @return the value of the CovariateList child.
	 */
	@NotNull
	CovariateList getCovariateList();


	/**
	 * Returns the value of the PPMatrix child.
	 * @return the value of the PPMatrix child.
	 */
	@NotNull
	@Required
	PPMatrix getPPMatrix();


	/**
	 * Returns the value of the PCovMatrix child.
	 * @return the value of the PCovMatrix child.
	 */
	@NotNull
	PCovMatrix getPCovMatrix();


	/**
	 * Returns the value of the ParamMatrix child.
	 * @return the value of the ParamMatrix child.
	 */
	@NotNull
	@Required
	ParamMatrix getParamMatrix();


	/**
	 * Returns the value of the EventValues child.
	 * @return the value of the EventValues child.
	 */
	@NotNull
	EventValues getEventValues();


	/**
	 * Returns the value of the BaseCumHazardTables child.
	 * @return the value of the BaseCumHazardTables child.
	 */
	@NotNull
	BaseCumHazardTables getBaseCumHazardTables();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


}
