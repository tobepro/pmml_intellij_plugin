// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:BaseCumHazardTablesElemType interface.
 */
public interface BaseCumHazardTables extends DomElement {

	/**
	 * Returns the value of the maxTime child.
	 * @return the value of the maxTime child.
	 */
	@NotNull
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
	 * Returns the list of BaselineStratum children.
	 * @return the list of BaselineStratum children.
	 */
	@NotNull
	@Required
	java.util.List<BaselineStratum> getBaselineStratums();
	/**
	 * Adds new child to the list of BaselineStratum children.
	 * @return created child
	 */
	BaselineStratum addBaselineStratum();


	/**
	 * Returns the list of BaselineCell children.
	 * @return the list of BaselineCell children.
	 */
	@NotNull
	@Required
	java.util.List<BaselineCell> getBaselineCells();
	/**
	 * Adds new child to the list of BaselineCell children.
	 * @return created child
	 */
	BaselineCell addBaselineCell();


}
