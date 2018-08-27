// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:CharacteristicsElemType interface.
 */
public interface Characteristics extends MyDomElement {

	/**
	 * Returns the list of Extension children.
	 * @return the list of Extension children.
	 */
	@NotNull
	java.util.List<Extension> getExtensions();
	
	Extension addExtension();


	/**
	 * Returns the list of Characteristic children.
	 * @return the list of Characteristic children.
	 */
	@NotNull
	@Required
	java.util.List<Characteristic> getCharacteristics();

	Characteristic addCharacteristic();
}
