// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TimeAnchorElemType interface.
 */
public interface TimeAnchor extends DomElement {

	/**
	 * Returns the value of the type child.
	 * @return the value of the type child.
	 */
	@NotNull
	GenericAttributeValue<TIMEANCHOR> getType();


	/**
	 * Returns the value of the offset child.
	 * @return the value of the offset child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getOffset();


	/**
	 * Returns the value of the stepsize child.
	 * @return the value of the stepsize child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getStepsize();


	/**
	 * Returns the value of the displayName child.
	 * @return the value of the displayName child.
	 */
	@NotNull
	GenericAttributeValue<String> getDisplayName();


	/**
	 * Returns the list of TimeCycle children.
	 * @return the list of TimeCycle children.
	 */
	@NotNull
	java.util.List<TimeCycle> getTimeCycles();
	/**
	 * Adds new child to the list of TimeCycle children.
	 * @return created child
	 */
	TimeCycle addTimeCycle();


	/**
	 * Returns the list of TimeException children.
	 * @return the list of TimeException children.
	 */
	@NotNull
	java.util.List<TimeException> getTimeExceptions();
	/**
	 * Adds new child to the list of TimeException children.
	 * @return created child
	 */
	TimeException addTimeException();


}
