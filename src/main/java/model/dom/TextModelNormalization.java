// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TextModelNormalizationElemType interface.
 */
public interface TextModelNormalization extends DomElement {

	/**
	 * Returns the value of the localTermWeights child.
	 * @return the value of the localTermWeights child.
	 */
	@NotNull
	GenericAttributeValue<LocalTermWeights> getLocalTermWeights();


	/**
	 * Returns the value of the globalTermWeights child.
	 * @return the value of the globalTermWeights child.
	 */
	@NotNull
	GenericAttributeValue<GlobalTermWeights> getGlobalTermWeights();


	/**
	 * Returns the value of the documentNormalization child.
	 * @return the value of the documentNormalization child.
	 */
	@NotNull
	GenericAttributeValue<DocumentNormalization> getDocumentNormalization();


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
