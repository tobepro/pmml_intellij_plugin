// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SequenceModelElemType interface.
 */
public interface SequenceModel extends DomElement {

	/**
	 * Returns the value of the modelName child.
	 * @return the value of the modelName child.
	 */
	@NotNull
	GenericAttributeValue<String> getModelName();


	/**
	 * Returns the value of the functionName child.
	 * @return the value of the functionName child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<MININGFUNCTION> getFunctionName();


	/**
	 * Returns the value of the algorithmName child.
	 * @return the value of the algorithmName child.
	 */
	@NotNull
	GenericAttributeValue<String> getAlgorithmName();


	/**
	 * Returns the value of the numberOfTransactions child.
	 * @return the value of the numberOfTransactions child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfTransactions();


	/**
	 * Returns the value of the maxNumberOfItemsPerTransaction child.
	 * @return the value of the maxNumberOfItemsPerTransaction child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaxNumberOfItemsPerTransaction();


	/**
	 * Returns the value of the avgNumberOfItemsPerTransaction child.
	 * @return the value of the avgNumberOfItemsPerTransaction child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAvgNumberOfItemsPerTransaction();


	/**
	 * Returns the value of the numberOfTransactionGroups child.
	 * @return the value of the numberOfTransactionGroups child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfTransactionGroups();


	/**
	 * Returns the value of the maxNumberOfTAsPerTAGroup child.
	 * @return the value of the maxNumberOfTAsPerTAGroup child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaxNumberOfTAsPerTAGroup();


	/**
	 * Returns the value of the avgNumberOfTAsPerTAGroup child.
	 * @return the value of the avgNumberOfTAsPerTAGroup child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAvgNumberOfTAsPerTAGroup();


	/**
	 * Returns the value of the isScorable child.
	 * @return the value of the isScorable child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getIsScorable();


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
	 * Returns the value of the MiningSchema child.
	 * @return the value of the MiningSchema child.
	 */
	@NotNull
	@Required
	MiningSchema getMiningSchema();


	/**
	 * Returns the value of the ModelStats child.
	 * @return the value of the ModelStats child.
	 */
	@NotNull
	ModelStats getModelStats();


	/**
	 * Returns the value of the LocalTransformations child.
	 * @return the value of the LocalTransformations child.
	 */
	@NotNull
	LocalTransformations getLocalTransformations();


	/**
	 * Returns the value of the Constraints child.
	 * @return the value of the Constraints child.
	 */
	@NotNull
	Constraints getConstraints();


	/**
	 * Returns the list of Item children.
	 * @return the list of Item children.
	 */
	@NotNull
	java.util.List<Item> getItems();
	/**
	 * Adds new child to the list of Item children.
	 * @return created child
	 */
	Item addItem();


	/**
	 * Returns the list of Itemset children.
	 * @return the list of Itemset children.
	 */
	@NotNull
	java.util.List<Itemset> getItemsets();
	/**
	 * Adds new child to the list of Itemset children.
	 * @return created child
	 */
	Itemset addItemset();


	/**
	 * Returns the list of SetPredicate children.
	 * @return the list of SetPredicate children.
	 */
	@NotNull
	java.util.List<SetPredicate> getSetPredicates();
	/**
	 * Adds new child to the list of SetPredicate children.
	 * @return created child
	 */
	SetPredicate addSetPredicate();


	/**
	 * Returns the list of Sequence children.
	 * @return the list of Sequence children.
	 */
	@NotNull
	@Required
	java.util.List<Sequence> getSequences();
	/**
	 * Adds new child to the list of Sequence children.
	 * @return created child
	 */
	Sequence addSequence();


	/**
	 * Returns the list of SequenceRule children.
	 * @return the list of SequenceRule children.
	 */
	@NotNull
	java.util.List<SequenceRule> getSequenceRules();
	/**
	 * Adds new child to the list of SequenceRule children.
	 * @return created child
	 */
	SequenceRule addSequenceRule();


}
