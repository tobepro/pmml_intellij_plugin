// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SimpleRuleElemType interface.
 */
public interface SimpleRule extends DomElement {

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
	@Required
	GenericAttributeValue<String> getScore();


	/**
	 * Returns the value of the recordCount child.
	 * @return the value of the recordCount child.
	 */
	@NotNull
	GenericAttributeValue<Double> getRecordCount();


	/**
	 * Returns the value of the nbCorrect child.
	 * @return the value of the nbCorrect child.
	 */
	@NotNull
	GenericAttributeValue<Double> getNbCorrect();


	/**
	 * Returns the value of the confidence child.
	 * @return the value of the confidence child.
	 */
	@NotNull
	GenericAttributeValue<Double> getConfidence();


	/**
	 * Returns the value of the weight child.
	 * @return the value of the weight child.
	 */
	@NotNull
	GenericAttributeValue<Double> getWeight();


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


}
