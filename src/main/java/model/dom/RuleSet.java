// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:RuleSetElemType interface.
 */
public interface RuleSet extends DomElement {

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
	 * Returns the value of the defaultScore child.
	 * @return the value of the defaultScore child.
	 */
	@NotNull
	GenericAttributeValue<String> getDefaultScore();


	/**
	 * Returns the value of the defaultConfidence child.
	 * @return the value of the defaultConfidence child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDefaultConfidence();


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
	 * Returns the list of RuleSelectionMethod children.
	 * @return the list of RuleSelectionMethod children.
	 */
	@NotNull
	@Required
	java.util.List<RuleSelectionMethod> getRuleSelectionMethods();
	/**
	 * Adds new child to the list of RuleSelectionMethod children.
	 * @return created child
	 */
	RuleSelectionMethod addRuleSelectionMethod();


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
	 * Returns the list of SimpleRule children.
	 * @return the list of SimpleRule children.
	 */
	@NotNull
	java.util.List<SimpleRule> getSimpleRules();
	/**
	 * Adds new child to the list of SimpleRule children.
	 * @return created child
	 */
	SimpleRule addSimpleRule();


	/**
	 * Returns the list of CompoundRule children.
	 * @return the list of CompoundRule children.
	 */
	@NotNull
	java.util.List<CompoundRule> getCompoundRules();
	/**
	 * Adds new child to the list of CompoundRule children.
	 * @return created child
	 */
	CompoundRule addCompoundRule();


}
