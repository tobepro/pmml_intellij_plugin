// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:LinearNormElemType interface.
 */
public interface LinearNorm extends DomElement {

	/**
	 * Returns the value of the orig child.
	 * @return the value of the orig child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getOrig();


	/**
	 * Returns the value of the norm child.
	 * @return the value of the norm child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getNorm();


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
