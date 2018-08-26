// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:BaselineStratumElemType interface.
 */
public interface BaselineStratum extends DomElement {

	/**
	 * Returns the value of the value child.
	 * @return the value of the value child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getValue();


	/**
	 * Returns the value of the label child.
	 * @return the value of the label child.
	 */
	@NotNull
	GenericAttributeValue<String> getLabel();


	/**
	 * Returns the value of the maxTime child.
	 * @return the value of the maxTime child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Double> getMaxTime();


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
	 * Returns the list of BaselineCell children.
	 * @return the list of BaselineCell children.
	 */
	@NotNull
	java.util.List<BaselineCell> getBaselineCells();
	/**
	 * Adds new child to the list of BaselineCell children.
	 * @return created child
	 */
	BaselineCell addBaselineCell();


}
