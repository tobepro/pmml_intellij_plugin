// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:ClusteringModelQualityElemType interface.
 */
public interface ClusteringModelQuality extends DomElement {

	/**
	 * Returns the value of the dataName child.
	 * @return the value of the dataName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDataName();


	/**
	 * Returns the value of the SSE child.
	 * @return the value of the SSE child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSSE();


	/**
	 * Returns the value of the SSB child.
	 * @return the value of the SSB child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSSB();


}
