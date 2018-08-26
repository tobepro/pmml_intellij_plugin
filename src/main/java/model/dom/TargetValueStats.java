// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TargetValueStatsElemType interface.
 */
public interface TargetValueStats extends DomElement {

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
	 * Returns the list of TargetValueStat children.
	 * @return the list of TargetValueStat children.
	 */
	@NotNull
	@Required
	java.util.List<TargetValueStat> getTargetValueStats();
	/**
	 * Adds new child to the list of TargetValueStat children.
	 * @return created child
	 */
	TargetValueStat addTargetValueStat();


}
