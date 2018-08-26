// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:EventValuesElemType interface.
 */
public interface EventValues extends DomElement {

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
	 * Returns the list of Value children.
	 * @return the list of Value children.
	 */
	@NotNull
	java.util.List<Value> getValues();
	/**
	 * Adds new child to the list of Value children.
	 * @return created child
	 */
	Value addValue();


	/**
	 * Returns the list of Interval children.
	 * @return the list of Interval children.
	 */
	@NotNull
	java.util.List<Interval> getIntervals();
	/**
	 * Adds new child to the list of Interval children.
	 * @return created child
	 */
	Interval addInterval();


}
