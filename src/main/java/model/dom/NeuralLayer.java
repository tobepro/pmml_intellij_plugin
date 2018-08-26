// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NeuralLayerElemType interface.
 */
public interface NeuralLayer extends DomElement {

	/**
	 * Returns the value of the numberOfNeurons child.
	 * @return the value of the numberOfNeurons child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfNeurons();


	/**
	 * Returns the value of the activationFunction child.
	 * @return the value of the activationFunction child.
	 */
	@NotNull
	GenericAttributeValue<ACTIVATIONFUNCTION> getActivationFunction();


	/**
	 * Returns the value of the threshold child.
	 * @return the value of the threshold child.
	 */
	@NotNull
	GenericAttributeValue<Double> getThreshold();


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
	 * Returns the value of the normalizationMethod child.
	 * @return the value of the normalizationMethod child.
	 */
	@NotNull
	GenericAttributeValue<NNNORMALIZATIONMETHOD> getNormalizationMethod();


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
	 * Returns the list of Neuron children.
	 * @return the list of Neuron children.
	 */
	@NotNull
	@Required
	java.util.List<Neuron> getNeurons();
	/**
	 * Adds new child to the list of Neuron children.
	 * @return created child
	 */
	Neuron addNeuron();


}
