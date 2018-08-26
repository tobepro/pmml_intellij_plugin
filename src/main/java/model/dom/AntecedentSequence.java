// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AntecedentSequenceElemType interface.
 */
public interface AntecedentSequence extends DomElement, SEQUENCE {

	/**
	 * Returns the value of the SequenceReference child.
	 * @return the value of the SequenceReference child.
	 */
	@NotNull
	@Required
	SequenceReference getSequenceReference();


	/**
	 * Returns the value of the Time child.
	 * @return the value of the Time child.
	 */
	@NotNull
	Time getTime();


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


}
