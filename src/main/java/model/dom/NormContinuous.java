// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NormContinuousElemType interface.
 */
public interface NormContinuous extends DomElement {

	/**
	 * Returns the value of the mapMissingTo child.
	 * @return the value of the mapMissingTo child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMapMissingTo();


	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the outliers child.
	 * @return the value of the outliers child.
	 */
	@NotNull
	GenericAttributeValue<OUTLIERTREATMENTMETHOD> getOutliers();


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
	 * Returns the list of LinearNorm children.
	 * @return the list of LinearNorm children.
	 */
	@NotNull
	@Required
	java.util.List<LinearNorm> getLinearNorms();
	/**
	 * Adds new child to the list of LinearNorm children.
	 * @return created child
	 */
	LinearNorm addLinearNorm();


}
