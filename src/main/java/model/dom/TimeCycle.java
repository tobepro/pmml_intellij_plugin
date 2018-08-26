// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:TimeCycleElemType interface.
 */
public interface TimeCycle extends DomElement {

	/**
	 * Returns the value of the length child.
	 * @return the value of the length child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getLength();


	/**
	 * Returns the value of the type child.
	 * @return the value of the type child.
	 */
	@NotNull
	GenericAttributeValue<VALIDTIMESPEC> getType();


	/**
	 * Returns the value of the displayName child.
	 * @return the value of the displayName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisplayName();


	/**
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	Array getArray();


}
