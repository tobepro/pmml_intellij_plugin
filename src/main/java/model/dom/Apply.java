// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ApplyElemType interface.
 */
public interface Apply extends DomElement {

	/**
	 * Returns the value of the function child.
	 * @return the value of the function child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getFunction();


	/**
	 * Returns the value of the mapMissingTo child.
	 * @return the value of the mapMissingTo child.
	 */
	@NotNull
	GenericAttributeValue<String> getMapMissingTo();


	/**
	 * Returns the value of the defaultValue child.
	 * @return the value of the defaultValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getDefaultValue();


	/**
	 * Returns the value of the invalidValueTreatment child.
	 * @return the value of the invalidValueTreatment child.
	 */
	@NotNull
	GenericAttributeValue<INVALIDVALUETREATMENTMETHOD> getInvalidValueTreatment();


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
	 * Returns the list of Constant children.
	 * @return the list of Constant children.
	 */
	@NotNull
	java.util.List<Constant> getConstants();
	/**
	 * Adds new child to the list of Constant children.
	 * @return created child
	 */
	Constant addConstant();


	/**
	 * Returns the list of FieldRef children.
	 * @return the list of FieldRef children.
	 */
	@NotNull
	java.util.List<FieldRef> getFieldRefs();
	/**
	 * Adds new child to the list of FieldRef children.
	 * @return created child
	 */
	FieldRef addFieldRef();


	/**
	 * Returns the list of NormContinuous children.
	 * @return the list of NormContinuous children.
	 */
	@NotNull
	java.util.List<NormContinuous> getNormContinuouses();
	/**
	 * Adds new child to the list of NormContinuous children.
	 * @return created child
	 */
	NormContinuous addNormContinuous();


	/**
	 * Returns the list of NormDiscrete children.
	 * @return the list of NormDiscrete children.
	 */
	@NotNull
	java.util.List<NormDiscrete> getNormDiscretes();
	/**
	 * Adds new child to the list of NormDiscrete children.
	 * @return created child
	 */
	NormDiscrete addNormDiscrete();


	/**
	 * Returns the list of Discretize children.
	 * @return the list of Discretize children.
	 */
	@NotNull
	java.util.List<Discretize> getDiscretizes();
	/**
	 * Adds new child to the list of Discretize children.
	 * @return created child
	 */
	Discretize addDiscretize();


	/**
	 * Returns the list of MapValues children.
	 * @return the list of MapValues children.
	 */
	@NotNull
	java.util.List<MapValues> getMapValueses();
	/**
	 * Adds new child to the list of MapValues children.
	 * @return created child
	 */
	MapValues addMapValues();


	/**
	 * Returns the list of TextIndex children.
	 * @return the list of TextIndex children.
	 */
	@NotNull
	java.util.List<TextIndex> getTextIndexes();
	/**
	 * Adds new child to the list of TextIndex children.
	 * @return created child
	 */
	TextIndex addTextIndex();


	/**
	 * Returns the list of Apply children.
	 * @return the list of Apply children.
	 */
	@NotNull
	java.util.List<Apply> getApplies();
	/**
	 * Adds new child to the list of Apply children.
	 * @return created child
	 */
	Apply addApply();


	/**
	 * Returns the list of Aggregate children.
	 * @return the list of Aggregate children.
	 */
	@NotNull
	java.util.List<Aggregate> getAggregates();
	/**
	 * Adds new child to the list of Aggregate children.
	 * @return created child
	 */
	Aggregate addAggregate();


	/**
	 * Returns the list of Lag children.
	 * @return the list of Lag children.
	 */
	@NotNull
	java.util.List<Lag> getLags();
	/**
	 * Adds new child to the list of Lag children.
	 * @return created child
	 */
	Lag addLag();


}
