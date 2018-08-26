// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TimeElemType interface.
 */
public interface Time extends DomElement {

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
	 * Returns the value of the mean child.
	 * @return the value of the mean child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMean();


	/**
	 * Returns the value of the standardDeviation child.
	 * @return the value of the standardDeviation child.
	 */
	@NotNull
	GenericAttributeValue<Double> getStandardDeviation();


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


}
