// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ClusterElemType interface.
 */
public interface Cluster extends DomElement {

	/**
	 * Returns the value of the id child.
	 * @return the value of the id child.
	 */
	@NotNull
	GenericAttributeValue<String> getId();


	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the size child.
	 * @return the value of the size child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getSize();


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
	 * Returns the value of the KohonenMap child.
	 * @return the value of the KohonenMap child.
	 */
	@NotNull
	KohonenMap getKohonenMap();


	/**
	 * Returns the value of the Partition child.
	 * @return the value of the Partition child.
	 */
	@NotNull
	Partition getPartition();


	/**
	 * Returns the value of the Covariances child.
	 * @return the value of the Covariances child.
	 */
	@NotNull
	Covariances getCovariances();


	/**
	 * Returns the value of the Array child.
	 * @return the value of the Array child.
	 */
	@NotNull
	@Required
	Array getArray();


}
