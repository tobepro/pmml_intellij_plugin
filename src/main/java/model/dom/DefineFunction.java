// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DefineFunctionElemType interface.
 */
public interface DefineFunction extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the optype child.
	 * @return the value of the optype child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<OPTYPE> getOptype();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	GenericAttributeValue<DATATYPE> getDataType();


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
	 * Returns the list of ParameterField children.
	 * @return the list of ParameterField children.
	 */
	@NotNull
	@Required
	java.util.List<ParameterField> getParameterFields();
	/**
	 * Adds new child to the list of ParameterField children.
	 * @return created child
	 */
	ParameterField addParameterField();


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
