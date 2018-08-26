// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:OutputElemType interface.
 */
public interface Output extends DomElement {

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
	 * Returns the list of OutputField children.
	 * @return the list of OutputField children.
	 */
	@NotNull
	@Required
	java.util.List<OutputField> getOutputFields();
	/**
	 * Adds new child to the list of OutputField children.
	 * @return created child
	 */
	OutputField addOutputField();


}
