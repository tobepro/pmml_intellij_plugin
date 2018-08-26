// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.Attribute;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:ExtensionElemType interface.
 */
public interface Extension extends DomElement {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue1();
	/**
	 * Sets the value of the simple content.
	 * @param value1 the new value to set
	 */
	void setValue1(@NotNull String value1);


	/**
	 * Returns the value of the extender child.
	 * @return the value of the extender child.
	 */
	@NotNull
	GenericAttributeValue<String> getExtender();


	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Attribute("value")
	GenericAttributeValue<String> getValue2();


}
