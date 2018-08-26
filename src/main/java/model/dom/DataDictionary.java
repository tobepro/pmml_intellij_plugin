// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DataDictionaryElemType interface.
 */
public interface DataDictionary extends DomElement {

	/**
	 * Returns the value of the numberOfFields child.
	 * @return the value of the numberOfFields child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNumberOfFields();


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
	 * Returns the list of DataField children.
	 * @return the list of DataField children.
	 */
	@NotNull
	@Required
	java.util.List<DataField> getDataFields();
	/**
	 * Adds new child to the list of DataField children.
	 * @return created child
	 */
	DataField addDataField();


	/**
	 * Returns the list of Taxonomy children.
	 * @return the list of Taxonomy children.
	 */
	@NotNull
	java.util.List<Taxonomy> getTaxonomies();
	/**
	 * Adds new child to the list of Taxonomy children.
	 * @return created child
	 */
	Taxonomy addTaxonomy();


}
