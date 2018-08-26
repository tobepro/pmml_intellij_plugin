// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TargetValueElemType interface.
 */
public interface TargetValue extends DomElement {

	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the displayValue child.
	 * @return the value of the displayValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisplayValue();


	/**
	 * Returns the value of the priorProbability child.
	 * @return the value of the priorProbability child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPriorProbability();


	/**
	 * Returns the value of the defaultValue child.
	 * @return the value of the defaultValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDefaultValue();


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
	 * Returns the value of the Partition child.
	 * @return the value of the Partition child.
	 */
	@NotNull
	Partition getPartition();


}
