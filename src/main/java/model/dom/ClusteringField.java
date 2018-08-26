// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ClusteringFieldElemType interface.
 */
public interface ClusteringField extends DomElement {

	/**
	 * Returns the value of the dataField child.
	 * @return the value of the dataField child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getDataField();


	/**
	 * Returns the value of the isCenterField child.
	 * @return the value of the isCenterField child.
	 */
	@NotNull
	GenericAttributeValue<IsCenterField> getIsCenterField();


	/**
	 * Returns the value of the fieldWeight child.
	 * @return the value of the fieldWeight child.
	 */
	@NotNull
	GenericAttributeValue<Double> getFieldWeight();


	/**
	 * Returns the value of the similarityScale child.
	 * @return the value of the similarityScale child.
	 */
	@NotNull
	GenericAttributeValue<Double> getSimilarityScale();


	/**
	 * Returns the value of the compareFunction child.
	 * @return the value of the compareFunction child.
	 */
	@NotNull
	GenericAttributeValue<COMPAREFUNCTION> getCompareFunction();


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
	 * Returns the value of the Comparisons child.
	 * @return the value of the Comparisons child.
	 */
	@NotNull
	Comparisons getComparisons();


}
