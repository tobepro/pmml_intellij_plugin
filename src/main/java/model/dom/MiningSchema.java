// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:MiningSchemaElemType interface.
 */
public interface MiningSchema extends MyDomElement {

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
	 * Returns the list of MiningField children.
	 * @return the list of MiningField children.
	 */
	@NotNull
	java.util.List<MiningField> getMiningFields();
	/**
	 * Adds new child to the list of MiningField children.
	 * @return created child
	 */
	MiningField addMiningField();


}
