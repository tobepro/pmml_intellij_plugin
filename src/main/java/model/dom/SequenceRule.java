// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SequenceRuleElemType interface.
 */
public interface SequenceRule extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the numberOfSets child.
	 * @return the value of the numberOfSets child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getNumberOfSets();


	/**
	 * Returns the value of the occurrence child.
	 * @return the value of the occurrence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getOccurrence();


	/**
	 * Returns the value of the support child.
	 * @return the value of the support child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getSupport();


	/**
	 * Returns the value of the confidence child.
	 * @return the value of the confidence child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getConfidence();


	/**
	 * Returns the value of the lift child.
	 * @return the value of the lift child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLift();


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
	 * Returns the value of the AntecedentSequence child.
	 * @return the value of the AntecedentSequence child.
	 */
	@NotNull
	@Required
	AntecedentSequence getAntecedentSequence();


	/**
	 * Returns the value of the Delimiter child.
	 * @return the value of the Delimiter child.
	 */
	@NotNull
	@Required
	Delimiter getDelimiter();


	/**
	 * Returns the value of the Time child.
	 * @return the value of the Time child.
	 */
	@NotNull
	@SubTag (value = "Time", index = 0)
	Time getTime1();


	/**
	 * Returns the value of the ConsequentSequence child.
	 * @return the value of the ConsequentSequence child.
	 */
	@NotNull
	@Required
	ConsequentSequence getConsequentSequence();


	/**
	 * Returns the value of the Time child.
	 * @return the value of the Time child.
	 */
	@NotNull
	@SubTag (value = "Time", index = 1)
	Time getTime2();


}
