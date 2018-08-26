// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:BayesInputElemType interface.
 */
public interface BayesInput extends DomElement {

	/**
	 * Returns the value of the fieldName child.
	 * @return the value of the fieldName child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getFieldName();


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
	 * Returns the value of the TargetValueStats child.
	 * @return the value of the TargetValueStats child.
	 */
	@NotNull
	@Required
	TargetValueStats getTargetValueStats();


	/**
	 * Returns the value of the DerivedField child.
	 * @return the value of the DerivedField child.
	 */
	@NotNull
	DerivedField getDerivedField();


	/**
	 * Returns the list of PairCounts children.
	 * @return the list of PairCounts children.
	 */
	@NotNull
	@Required
	java.util.List<PairCounts> getPairCountses();
	/**
	 * Adds new child to the list of PairCounts children.
	 * @return created child
	 */
	PairCounts addPairCounts();


}
