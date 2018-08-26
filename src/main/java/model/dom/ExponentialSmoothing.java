// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ExponentialSmoothingElemType interface.
 */
public interface ExponentialSmoothing extends DomElement {

	/**
	 * Returns the value of the RMSE child.
	 * @return the value of the RMSE child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRMSE();


	/**
	 * Returns the value of the transformation child.
	 * @return the value of the transformation child.
	 */
	@NotNull
	GenericAttributeValue<Transformation> getTransformation();


	/**
	 * Returns the value of the Level child.
	 * @return the value of the Level child.
	 */
	@NotNull
	@Required
	Level getLevel();


	/**
	 * Returns the value of the Trend_ExpoSmooth child.
	 * @return the value of the Trend_ExpoSmooth child.
	 */
	@NotNull
	Trend_ExpoSmooth getTrend_ExpoSmooth();


	/**
	 * Returns the value of the Seasonality_ExpoSmooth child.
	 * @return the value of the Seasonality_ExpoSmooth child.
	 */
	@NotNull
	Seasonality_ExpoSmooth getSeasonality_ExpoSmooth();


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
