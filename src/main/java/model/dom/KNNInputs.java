// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:KNNInputsElemType interface.
 */
public interface KNNInputs extends DomElement {

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
	 * Returns the list of KNNInput children.
	 * @return the list of KNNInput children.
	 */
	@NotNull
	@Required
	java.util.List<KNNInput> getKNNInputs();
	/**
	 * Adds new child to the list of KNNInput children.
	 * @return created child
	 */
	KNNInput addKNNInput();


}
