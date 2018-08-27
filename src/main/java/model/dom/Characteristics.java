// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTag;
import com.intellij.util.xml.SubTagList;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:CharacteristicsElemType interface.
 */
public interface Characteristics extends DomElement {

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
	@SubTagList("Characteristic")
	java.util.List<Characteristic> getCharacteristics();
	
	@SubTagList("Characteristic")
	Characteristic addCharacteristic();
}