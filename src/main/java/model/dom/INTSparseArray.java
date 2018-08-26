// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:INT-SparseArrayElemType interface.
 */
public interface INTSparseArray extends DomElement {

	/**
	 * Returns the value of the n child.
	 * @return the value of the n child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getN();


	/**
	 * Returns the value of the defaultValue child.
	 * @return the value of the defaultValue child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getDefaultValue();


	/**
	 * Returns the value of the Indices child.
	 * @return the value of the Indices child.
	 */
	@NotNull
	GenericDomValue<String> getIndices();


	/**
	 * Returns the value of the INT-Entries child.
	 * @return the value of the INT-Entries child.
	 */
	@NotNull
	GenericDomValue<String> getINTEntries();


}
