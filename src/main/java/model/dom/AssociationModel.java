// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AssociationModelElemType interface.
 */
public interface AssociationModel extends DomElement {

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
	@Required
	GenericAttributeValue<Integer> getNumberOfTransactions();


	/**
	 * Returns the value of the maxNumberOfItemsPerTA child.
	 * @return the value of the maxNumberOfItemsPerTA child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaxNumberOfItemsPerTA();


	/**
	 * Returns the value of the avgNumberOfItemsPerTA child.
	 * @return the value of the avgNumberOfItemsPerTA child.
	 */
	@NotNull
	GenericAttributeValue<Double> getAvgNumberOfItemsPerTA();


	/**
	 * Returns the value of the minimumSupport child.
	 * @return the value of the minimumSupport child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getMinimumSupport();


	/**
	 * Returns the value of the minimumConfidence child.
	 * @return the value of the minimumConfidence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getMinimumConfidence();


	/**
	 * Returns the value of the lengthLimit child.
	 * @return the value of the lengthLimit child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getLengthLimit();


	/**
	 * Returns the value of the numberOfItems child.
	 * @return the value of the numberOfItems child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfItems();


	/**
	 * Returns the value of the numberOfItemsets child.
	 * @return the value of the numberOfItemsets child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfItemsets();


	/**
	 * Returns the value of the numberOfRules child.
	 * @return the value of the numberOfRules child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfRules();


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
	 * Returns the value of the Output child.
	 * @return the value of the Output child.
	 */
	@NotNull
	Output getOutput();


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
	 * Returns the list of AssociationRule children.
	 * @return the list of AssociationRule children.
	 */
	@NotNull
	java.util.List<AssociationRule> getAssociationRules();
	/**
	 * Adds new child to the list of AssociationRule children.
	 * @return created child
	 */
	AssociationRule addAssociationRule();


	/**
	 * Returns the value of the ModelVerification child.
	 * @return the value of the ModelVerification child.
	 */
	@NotNull
	ModelVerification getModelVerification();


}
