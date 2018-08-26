// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:LiftDataElemType interface.
 */
public interface LiftData extends DomElement {

	/**
	 * Returns the value of the targetFieldValue child.
	 * @return the value of the targetFieldValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetFieldValue();


	/**
	 * Returns the value of the targetFieldDisplayValue child.
	 * @return the value of the targetFieldDisplayValue child.
	 */
	@NotNull
	GenericAttributeValue<String> getTargetFieldDisplayValue();


	/**
	 * Returns the value of the rankingQuality child.
	 * @return the value of the rankingQuality child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRankingQuality();


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
	 * Returns the value of the ModelLiftGraph child.
	 * @return the value of the ModelLiftGraph child.
	 */
	@NotNull
	@Required
	ModelLiftGraph getModelLiftGraph();


	/**
	 * Returns the value of the OptimumLiftGraph child.
	 * @return the value of the OptimumLiftGraph child.
	 */
	@NotNull
	OptimumLiftGraph getOptimumLiftGraph();


	/**
	 * Returns the value of the RandomLiftGraph child.
	 * @return the value of the RandomLiftGraph child.
	 */
	@NotNull
	RandomLiftGraph getRandomLiftGraph();


}
