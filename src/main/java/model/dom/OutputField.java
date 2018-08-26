// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:OutputFieldElemType interface.
 */
public interface OutputField extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the displayName child.
	 * @return the value of the displayName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisplayName();


	/**
	 * Returns the value of the optype child.
	 * @return the value of the optype child.
	 */
	@NotNull
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<DataType> getDataType();


	/**
	 * Returns the value of the targetField child.
	 * @return the value of the targetField child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetField();


	/**
	 * Returns the value of the feature child.
	 * @return the value of the feature child.
	 */
	@NotNull
	GenericAttributeValue<RESULTFEATURE> getFeature();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the ruleFeature child.
	 * @return the value of the ruleFeature child.
	 */
	@NotNull
	GenericAttributeValue<RULEFEATURE> getRuleFeature();


	/**
	 * Returns the value of the algorithm child.
	 * @return the value of the algorithm child.
	 */
	@NotNull
	GenericAttributeValue<Algorithm> getAlgorithm();


	/**
	 * Returns the value of the rank child.
	 * @return the value of the rank child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getRank();


	/**
	 * Returns the value of the rankBasis child.
	 * @return the value of the rankBasis child.
	 */
	@NotNull
	GenericAttributeValue<RankBasis> getRankBasis();


	/**
	 * Returns the value of the rankOrder child.
	 * @return the value of the rankOrder child.
	 */
	@NotNull
	GenericAttributeValue<RankOrder> getRankOrder();


	/**
	 * Returns the value of the isMultiValued child.
	 * @return the value of the isMultiValued child.
	 */
	@NotNull
	GenericAttributeValue<String> getIsMultiValued();


	/**
	 * Returns the value of the segmentId child.
	 * @return the value of the segmentId child.
	 */
	@NotNull
	GenericAttributeValue<String> getSegmentId();


	/**
	 * Returns the value of the isFinalResult child.
	 * @return the value of the isFinalResult child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getIsFinalResult();


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
	 * Returns the value of the Decisions child.
	 * @return the value of the Decisions child.
	 */
	@NotNull
	Decisions getDecisions();


	/**
	 * Returns the value of the Constant child.
	 * @return the value of the Constant child.
	 */
	@NotNull
	@Required
	Constant getConstant();


	/**
	 * Returns the value of the FieldRef child.
	 * @return the value of the FieldRef child.
	 */
	@NotNull
	@Required
	FieldRef getFieldRef();


	/**
	 * Returns the value of the NormContinuous child.
	 * @return the value of the NormContinuous child.
	 */
	@NotNull
	@Required
	NormContinuous getNormContinuous();


	/**
	 * Returns the value of the NormDiscrete child.
	 * @return the value of the NormDiscrete child.
	 */
	@NotNull
	@Required
	NormDiscrete getNormDiscrete();


	/**
	 * Returns the value of the Discretize child.
	 * @return the value of the Discretize child.
	 */
	@NotNull
	@Required
	Discretize getDiscretize();


	/**
	 * Returns the value of the MapValues child.
	 * @return the value of the MapValues child.
	 */
	@NotNull
	@Required
	MapValues getMapValues();


	/**
	 * Returns the value of the TextIndex child.
	 * @return the value of the TextIndex child.
	 */
	@NotNull
	@Required
	TextIndex getTextIndex();


	/**
	 * Returns the value of the Apply child.
	 * @return the value of the Apply child.
	 */
	@NotNull
	@Required
	Apply getApply();


	/**
	 * Returns the value of the Aggregate child.
	 * @return the value of the Aggregate child.
	 */
	@NotNull
	@Required
	Aggregate getAggregate();


	/**
	 * Returns the value of the Lag child.
	 * @return the value of the Lag child.
	 */
	@NotNull
	@Required
	Lag getLag();


}
