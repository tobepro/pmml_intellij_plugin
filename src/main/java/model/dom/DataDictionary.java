// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:DataDictionaryElemType interface.
 */
public interface DataDictionary extends DomElement {
	@NotNull
	GenericAttributeValue<Integer> getNumberOfFields();

	@NotNull
	java.util.List<Extension> getExtensions();
	/**
	 * Adds new child to the list of Extension children.
	 * @return created child
	 */
	Extension addExtension();

	@NotNull
	@Required
	@SubTagList("DataField")
	java.util.List<DataField> getDataFields();
	/**
	 * Adds new child to the list of DataField children.
	 * @return created child
	 */
	@SubTag("DataField")
	DataField addDataField();

}
