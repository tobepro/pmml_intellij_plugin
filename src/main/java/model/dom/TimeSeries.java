// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TimeSeriesElemType interface.
 */
public interface TimeSeries extends DomElement {

	/**
	 * Returns the value of the usage child.
	 * @return the value of the usage child.
	 */
	@NotNull
	GenericAttributeValue<TIMESERIESUSAGE> getUsage();


	/**
	 * Returns the value of the startTime child.
	 * @return the value of the startTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getStartTime();


	/**
	 * Returns the value of the endTime child.
	 * @return the value of the endTime child.
	 */
	@NotNull
	GenericAttributeValue<Double> getEndTime();


	/**
	 * Returns the value of the interpolationMethod child.
	 * @return the value of the interpolationMethod child.
	 */
	@NotNull
	GenericAttributeValue<INTERPOLATIONMETHOD> getInterpolationMethod();


	/**
	 * Returns the value of the TimeAnchor child.
	 * @return the value of the TimeAnchor child.
	 */
	@NotNull
	TimeAnchor getTimeAnchor();


	/**
	 * Returns the list of TimeValue children.
	 * @return the list of TimeValue children.
	 */
	@NotNull
	java.util.List<TimeValue> getTimeValues();
	/**
	 * Adds new child to the list of TimeValue children.
	 * @return created child
	 */
	TimeValue addTimeValue();


}
