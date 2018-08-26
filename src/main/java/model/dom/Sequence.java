// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SequenceElemType interface.
 */
public interface Sequence extends DomElement, FOLLOWSET {

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
	GenericAttributeValue<Integer> getNumberOfSets();


	/**
	 * Returns the value of the occurrence child.
	 * @return the value of the occurrence child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getOccurrence();


	/**
	 * Returns the value of the support child.
	 * @return the value of the support child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSupport();


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
	 * Returns the value of the SetReference child.
	 * @return the value of the SetReference child.
	 */
	@NotNull
	@Required
	SetReference getSetReference();


	/**
	 * Returns the value of the Time child.
	 * @return the value of the Time child.
	 */
	@NotNull
	Time getTime();


	/**
	 * Returns the value of the Delimiter child.
	 * @return the value of the Delimiter child.
	 */
	@NotNull
	@Required
	Delimiter getDelimiter();


}
