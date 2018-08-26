// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DelimiterElemType interface.
 */
public interface Delimiter extends DomElement {

	/**
	 * Returns the value of the delimiter child.
	 * @return the value of the delimiter child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<DELIMITER> getDelimiter();


	/**
	 * Returns the value of the gap child.
	 * @return the value of the gap child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<GAP> getGap();


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
