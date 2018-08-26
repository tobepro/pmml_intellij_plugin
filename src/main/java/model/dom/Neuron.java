// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NeuronElemType interface.
 */
public interface Neuron extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the bias child.
	 * @return the value of the bias child.
	 */
	@NotNull
	GenericAttributeValue<Double> getBias();


	/**
	 * Returns the value of the width child.
	 * @return the value of the width child.
	 */
	@NotNull
	GenericAttributeValue<Double> getWidth();


	/**
	 * Returns the value of the altitude child.
	 * @return the value of the altitude child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAltitude();


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
	 * Returns the list of Con children.
	 * @return the list of Con children.
	 */
	@NotNull
	@Required
	java.util.List<Con> getCons();
	/**
	 * Adds new child to the list of Con children.
	 * @return created child
	 */
	Con addCon();


}
