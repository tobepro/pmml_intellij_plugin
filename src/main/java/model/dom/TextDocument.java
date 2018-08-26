// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TextDocumentElemType interface.
 */
public interface TextDocument extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the length child.
	 * @return the value of the length child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getLength();


	/**
	 * Returns the value of the file child.
	 * @return the value of the file child.
	 */
	@NotNull
	GenericAttributeValue<String> getFile();


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
