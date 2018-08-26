// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:BaselineCellElemType interface.
 */
public interface BaselineCell extends DomElement {

	/**
	 * Returns the value of the time child.
	 * @return the value of the time child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getTime();


	/**
	 * Returns the value of the cumHazard child.
	 * @return the value of the cumHazard child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getCumHazard();


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
