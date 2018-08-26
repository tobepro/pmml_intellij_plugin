// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:TimeValueElemType interface.
 */
public interface TimeValue extends DomElement {

	/**
	 * Returns the value of the index child.
	 * @return the value of the index child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getIndex();


	/**
	 * Returns the value of the time child.
	 * @return the value of the time child.
	 */
	@NotNull
	GenericAttributeValue<Double> getTime();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getValue();


	/**
	 * Returns the value of the standardError child.
	 * @return the value of the standardError child.
	 */
	@NotNull
	GenericAttributeValue<Double> getStandardError();


	/**
	 * Returns the value of the Timestamp child.
	 * @return the value of the Timestamp child.
	 */
	@NotNull
	GenericDomValue<String> getTimestamp();


}
