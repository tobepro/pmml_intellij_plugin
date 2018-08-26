// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:NodeElemType interface.
 */
public interface Node extends DomElement, EmbeddedModel {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the score child.
	 * @return the value of the score child.
	 */
	@NotNull
	GenericAttributeValue<String> getScore();


	/**
	 * Returns the value of the recordCount child.
	 * @return the value of the recordCount child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRecordCount();


	/**
	 * Returns the value of the defaultChild child.
	 * @return the value of the defaultChild child.
	 */
	@NotNull
	GenericAttributeValue<String> getDefaultChild();


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
	 * Returns the value of the SimplePredicate child.
	 * @return the value of the SimplePredicate child.
	 */
	@NotNull
	@Required
	SimplePredicate getSimplePredicate();


	/**
	 * Returns the value of the CompoundPredicate child.
	 * @return the value of the CompoundPredicate child.
	 */
	@NotNull
	@Required
	CompoundPredicate getCompoundPredicate();


	/**
	 * Returns the value of the SimpleSetPredicate child.
	 * @return the value of the SimpleSetPredicate child.
	 */
	@NotNull
	@Required
	SimpleSetPredicate getSimpleSetPredicate();


	/**
	 * Returns the value of the True child.
	 * @return the value of the True child.
	 */
	@NotNull
	@Required
	True getTrue();


	/**
	 * Returns the value of the False child.
	 * @return the value of the False child.
	 */
	@NotNull
	@Required
	False getFalse();


	/**
	 * Returns the value of the Partition child.
	 * @return the value of the Partition child.
	 */
	@NotNull
	Partition getPartition();


	/**
	 * Returns the list of ScoreDistribution children.
	 * @return the list of ScoreDistribution children.
	 */
	@NotNull
	java.util.List<ScoreDistribution> getScoreDistributions();
	/**
	 * Adds new child to the list of ScoreDistribution children.
	 * @return created child
	 */
	ScoreDistribution addScoreDistribution();


	/**
	 * Returns the list of Node children.
	 * @return the list of Node children.
	 */
	@NotNull
	java.util.List<Node> getNodes();
	/**
	 * Adds new child to the list of Node children.
	 * @return created child
	 */
	Node addNode();


	/**
	 * Returns the value of the Regression child.
	 * @return the value of the Regression child.
	 */
	@NotNull
	@Required
	Regression getRegression();


	/**
	 * Returns the value of the DecisionTree child.
	 * @return the value of the DecisionTree child.
	 */
	@NotNull
	@Required
	DecisionTree getDecisionTree();


}
