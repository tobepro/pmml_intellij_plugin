// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:Trend_ExpoSmoothElemType interface.
 */
public interface Trend_ExpoSmooth extends DomElement {

	/**
	 * Returns the value of the trend child.
	 * @return the value of the trend child.
	 */
	@NotNull
	GenericAttributeValue<Trend> getTrend();


	/**
	 * Returns the value of the gamma child.
	 * @return the value of the gamma child.
	 */
	@NotNull
	GenericAttributeValue<Double> getGamma();


	/**
	 * Returns the value of the phi child.
	 * @return the value of the phi child.
	 */
	@NotNull
	GenericAttributeValue<Double> getPhi();


	/**
	 * Returns the value of the smoothedValue child.
	 * @return the value of the smoothedValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSmoothedValue();


	/**
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	Array getArray();


}
