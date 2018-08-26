// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NeuralInputsElemType interface.
 */
public interface NeuralInputs extends DomElement {

	/**
	 * Returns the value of the numberOfInputs child.
	 * @return the value of the numberOfInputs child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfInputs();


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
	 * Returns the list of NeuralInput children.
	 * @return the list of NeuralInput children.
	 */
	@NotNull
	@Required
	java.util.List<NeuralInput> getNeuralInputs();
	/**
	 * Adds new child to the list of NeuralInput children.
	 * @return created child
	 */
	NeuralInput addNeuralInput();


}
