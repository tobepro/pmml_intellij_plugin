// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:TimeExceptionElemType interface.
 */
public interface TimeException extends DomElement {

	/**
	 * Returns the value of the type child.
	 * @return the value of the type child.
	 */
	@NotNull
	GenericAttributeValue<TIMEEXCEPTIONTYPE> getType();


	/**
	 * Returns the value of the count child.
	 * @return the value of the count child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getCount();


	/**
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	Array getArray();


}
