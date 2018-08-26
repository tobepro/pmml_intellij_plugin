// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:LagElemType interface.
 */
public interface Lag extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the n child.
	 * @return the value of the n child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getN();


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
	 * Returns the list of BlockIndicator children.
	 * @return the list of BlockIndicator children.
	 */
	@NotNull
	java.util.List<BlockIndicator> getBlockIndicators();
	/**
	 * Adds new child to the list of BlockIndicator children.
	 * @return created child
	 */
	BlockIndicator addBlockIndicator();


}
