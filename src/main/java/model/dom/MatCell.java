// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:MatCellElemType interface.
 */
public interface MatCell extends DomElement {

	/**
	 * Returns the value of the simple content.
	 * @return the value of the simple content.
	 */
	@NotNull
	@Required
	String getValue();
	/**
	 * Sets the value of the simple content.
	 * @param value the new value to set
	 */
	void setValue(@NotNull String value);


	/**
	 * Returns the value of the row child.
	 * @return the value of the row child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getRow();


	/**
	 * Returns the value of the col child.
	 * @return the value of the col child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Integer> getCol();


}
