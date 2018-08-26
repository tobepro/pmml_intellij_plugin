// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ContStatsElemType interface.
 */
public interface ContStats extends DomElement, Frequencies {

	/**
	 * Returns the value of the totalValuesSum child.
	 * @return the value of the totalValuesSum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getTotalValuesSum();


	/**
	 * Returns the value of the totalSquaresSum child.
	 * @return the value of the totalSquaresSum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getTotalSquaresSum();


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
