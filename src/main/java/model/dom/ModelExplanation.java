// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ModelExplanationElemType interface.
 */
public interface ModelExplanation extends DomElement {

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
	 * Returns the value of the Correlations child.
	 * @return the value of the Correlations child.
	 */
	@NotNull
	Correlations getCorrelations();


	/**
	 * Returns the list of PredictiveModelQuality children.
	 * @return the list of PredictiveModelQuality children.
	 */
	@NotNull
	java.util.List<PredictiveModelQuality> getPredictiveModelQualities();
	/**
	 * Adds new child to the list of PredictiveModelQuality children.
	 * @return created child
	 */
	PredictiveModelQuality addPredictiveModelQuality();


	/**
	 * Returns the list of ClusteringModelQuality children.
	 * @return the list of ClusteringModelQuality children.
	 */
	@NotNull
	java.util.List<ClusteringModelQuality> getClusteringModelQualities();
	/**
	 * Adds new child to the list of ClusteringModelQuality children.
	 * @return created child
	 */
	ClusteringModelQuality addClusteringModelQuality();


}
