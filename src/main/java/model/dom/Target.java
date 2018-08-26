// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:TargetElemType interface.
 */
public interface Target extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the optype child.
	 * @return the value of the optype child.
	 */
	@NotNull
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the castInteger child.
	 * @return the value of the castInteger child.
	 */
	@NotNull
	GenericAttributeValue<CastInteger> getCastInteger();


	/**
	 * Returns the value of the min child.
	 * @return the value of the min child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMin();


	/**
	 * Returns the value of the max child.
	 * @return the value of the max child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMax();


	/**
	 * Returns the value of the rescaleConstant child.
	 * @return the value of the rescaleConstant child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRescaleConstant();


	/**
	 * Returns the value of the rescaleFactor child.
	 * @return the value of the rescaleFactor child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRescaleFactor();


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
	 * Returns the list of TargetValue children.
	 * @return the list of TargetValue children.
	 */
	@NotNull
	java.util.List<TargetValue> getTargetValues();
	/**
	 * Adds new child to the list of TargetValue children.
	 * @return created child
	 */
	TargetValue addTargetValue();


}
