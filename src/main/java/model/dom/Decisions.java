// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DecisionsElemType interface.
 */
public interface Decisions extends DomElement {

	/**
	 * Returns the value of the businessProblem child.
	 * @return the value of the businessProblem child.
	 */
	@NotNull
	GenericAttributeValue<String> getBusinessProblem();


	/**
	 * Returns the value of the description child.
	 * @return the value of the description child.
	 */
	@NotNull
	GenericAttributeValue<String> getDescription();


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
	 * Returns the list of Decision children.
	 * @return the list of Decision children.
	 */
	@NotNull
	@Required
	java.util.List<Decision> getDecisions();
	/**
	 * Adds new child to the list of Decision children.
	 * @return created child
	 */
	Decision addDecision();


}
