// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:VectorDictionaryElemType interface.
 */
public interface VectorDictionary extends DomElement {

	/**
	 * Returns the value of the numberOfVectors child.
	 * @return the value of the numberOfVectors child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfVectors();


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
	 * Returns the value of the VectorFields child.
	 * @return the value of the VectorFields child.
	 */
	@NotNull
	@Required
	VectorFields getVectorFields();


	/**
	 * Returns the list of VectorInstance children.
	 * @return the list of VectorInstance children.
	 */
	@NotNull
	java.util.List<VectorInstance> getVectorInstances();
	/**
	 * Adds new child to the list of VectorInstance children.
	 * @return created child
	 */
	VectorInstance addVectorInstance();


}
