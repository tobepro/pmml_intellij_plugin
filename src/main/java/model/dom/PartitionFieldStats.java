// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:PartitionFieldStatsElemType interface.
 */
public interface PartitionFieldStats extends DomElement, Frequencies {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the weighted child.
	 * @return the value of the weighted child.
	 */
	@NotNull
	GenericAttributeValue<Weighted> getWeighted();


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
	 * Returns the value of the Counts child.
	 * @return the value of the Counts child.
	 */
	@NotNull
	Counts getCounts();


	/**
	 * Returns the value of the NumericInfo child.
	 * @return the value of the NumericInfo child.
	 */
	@NotNull
	NumericInfo getNumericInfo();


	/**
	 * Returns the list of Array children.
	 * @return the list of Array children.
	 */
	@NotNull
	java.util.List<Array> getArrays();
	/**
	 * Adds new child to the list of Array children.
	 * @return created child
	 */
	Array addArray();


}
