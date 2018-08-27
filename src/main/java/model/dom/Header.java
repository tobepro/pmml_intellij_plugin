// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.GenericDomValue;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:HeaderElemType interface.
 */
public interface Header extends MyDomElement {

	/**
	 * Returns the value of the copyright child.
	 * @return the value of the copyright child.
	 */
	@NotNull
	GenericAttributeValue<String> getCopyright();


	/**
	 * Returns the value of the description child.
	 * @return the value of the description child.
	 */
	@NotNull
	GenericAttributeValue<String> getDescription();


	/**
	 * Returns the value of the modelVersion child.
	 * @return the value of the modelVersion child.
	 */
	@NotNull
	GenericAttributeValue<String> getModelVersion();


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
	 * Returns the value of the Application child.
	 * @return the value of the Application child.
	 */
	@NotNull
	Application getApplication();


	/**
	 * Returns the list of Annotation children.
	 * @return the list of Annotation children.
	 */
	@NotNull
	java.util.List<GenericDomValue<String>> getAnnotations();
	/**
	 * Adds new child to the list of Annotation children.
	 * @return created child
	 */
	GenericDomValue<String> addAnnotation();


	/**
	 * Returns the value of the Timestamp child.
	 * @return the value of the Timestamp child.
	 */
	@NotNull
	GenericDomValue<String> getTimestamp();


}
