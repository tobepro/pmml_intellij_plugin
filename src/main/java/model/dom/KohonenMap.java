// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:KohonenMapElemType interface.
 */
public interface KohonenMap extends DomElement {

	/**
	 * Returns the value of the coord1 child.
	 * @return the value of the coord1 child.
	 */
	@NotNull
	GenericAttributeValue<Float> getCoord1();


	/**
	 * Returns the value of the coord2 child.
	 * @return the value of the coord2 child.
	 */
	@NotNull
	GenericAttributeValue<Float> getCoord2();


	/**
	 * Returns the value of the coord3 child.
	 * @return the value of the coord3 child.
	 */
	@NotNull
	GenericAttributeValue<Float> getCoord3();


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
