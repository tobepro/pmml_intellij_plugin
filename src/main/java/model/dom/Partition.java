// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:PartitionElemType interface.
 */
public interface Partition extends MyDomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the size child.
	 * @return the value of the size child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSize();


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
	 * Returns the list of PartitionFieldStats children.
	 * @return the list of PartitionFieldStats children.
	 */
	@NotNull
	java.util.List<PartitionFieldStats> getPartitionFieldStatses();
	/**
	 * Adds new child to the list of PartitionFieldStats children.
	 * @return created child
	 */
	PartitionFieldStats addPartitionFieldStats();


}
