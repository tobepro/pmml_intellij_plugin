// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:AnovaElemType interface.
 */
public interface Anova extends DomElement {

	/**
	 * Returns the value of the target child.
	 * @return the value of the target child.
	 */
	@NotNull
	GenericAttributeValue<String> getTarget();


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
	 * Returns the list of AnovaRow children.
	 * @return the list of AnovaRow children.
	 */
	@NotNull
	@Required
	java.util.List<AnovaRow> getAnovaRows();
	/**
	 * Adds new child to the list of AnovaRow children.
	 * @return created child
	 */
	AnovaRow addAnovaRow();


}
