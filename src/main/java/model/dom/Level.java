// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:LevelElemType interface.
 */
public interface Level extends DomElement {

	/**
	 * Returns the value of the alpha child.
	 * @return the value of the alpha child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAlpha();


	/**
	 * Returns the value of the smoothedValue child.
	 * @return the value of the smoothedValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSmoothedValue();


}
