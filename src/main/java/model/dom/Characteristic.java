// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:CharacteristicElemType interface.
 */
public interface Characteristic extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the reasonCode child.
	 * @return the value of the reasonCode child.
	 */
	@NotNull
	GenericAttributeValue<String> getReasonCode();


	/**
	 * Returns the value of the baselineScore child.
	 * @return the value of the baselineScore child.
	 */
	@NotNull
	GenericAttributeValue<Double> getBaselineScore();


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
	 * Returns the list of Attribute children.
	 * @return the list of Attribute children.
	 */
	@NotNull
	@Required
	java.util.List<Attribute> getAttributes();
	/**
	 * Adds new child to the list of Attribute children.
	 * @return created child
	 */
	Attribute addAttribute();


}
