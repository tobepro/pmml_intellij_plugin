// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:ParameterFieldElemType interface.
 */
public interface ParameterField extends DomElement {

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
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the dataType child.
	 * @return the value of the dataType child.
	 */
	@NotNull
	GenericAttributeValue<DataType> getDataType();


}
