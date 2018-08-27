// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import model.dom.enums.Closure;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:IntervalElemType interface.
 */
public interface Interval extends MyDomElement {

	/**
	 * Returns the value of the closure child.
	 * @return the value of the closure child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Closure> getClosure();


	/**
	 * Returns the value of the leftMargin child.
	 * @return the value of the leftMargin child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLeftMargin();


	/**
	 * Returns the value of the rightMargin child.
	 * @return the value of the rightMargin child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRightMargin();


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
