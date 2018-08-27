// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:TargetsElemType interface.
 */
public interface Targets extends MyDomElement {

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
	 * Returns the list of Target children.
	 * @return the list of Target children.
	 */
	@NotNull
	@Required
	java.util.List<Target> getTargets();
	/**
	 * Adds new child to the list of Target children.
	 * @return created child
	 */
	Target addTarget();


}
