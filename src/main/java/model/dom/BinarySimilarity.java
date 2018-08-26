// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:binarySimilarityElemType interface.
 */
public interface BinarySimilarity extends DomElement {

	/**
	 * Returns the value of the c00-parameter child.
	 * @return the value of the c00-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getC00Parameter();


	/**
	 * Returns the value of the c01-parameter child.
	 * @return the value of the c01-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getC01Parameter();


	/**
	 * Returns the value of the c10-parameter child.
	 * @return the value of the c10-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getC10Parameter();


	/**
	 * Returns the value of the c11-parameter child.
	 * @return the value of the c11-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getC11Parameter();


	/**
	 * Returns the value of the d00-parameter child.
	 * @return the value of the d00-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getD00Parameter();


	/**
	 * Returns the value of the d01-parameter child.
	 * @return the value of the d01-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getD01Parameter();


	/**
	 * Returns the value of the d10-parameter child.
	 * @return the value of the d10-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getD10Parameter();


	/**
	 * Returns the value of the d11-parameter child.
	 * @return the value of the d11-parameter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getD11Parameter();


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
