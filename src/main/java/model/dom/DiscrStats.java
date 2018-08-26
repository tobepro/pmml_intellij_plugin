// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DiscrStatsElemType interface.
 */
public interface DiscrStats extends DomElement {

	/**
	 * Returns the value of the modalValue child.
	 * @return the value of the modalValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getModalValue();


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
	 * Returns the list of Array children.
	 * @return the list of Array children.
	 */
	@NotNull
	java.util.List<Array> getArrays();
	/**
	 * Adds new child to the list of Array children.
	 * @return created child
	 */
	Array addArray();


}
