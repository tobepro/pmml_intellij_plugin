// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:ComparisonMeasureElemType interface.
 */
public interface ComparisonMeasure extends DomElement {

	/**
	 * Returns the value of the kind child.
	 * @return the value of the kind child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<Kind> getKind();


	/**
	 * Returns the value of the compareFunction child.
	 * @return the value of the compareFunction child.
	 */
	@NotNull
	GenericAttributeValue<COMPAREFUNCTION> getCompareFunction();


	/**
	 * Returns the value of the minimum child.
	 * @return the value of the minimum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMinimum();


	/**
	 * Returns the value of the maximum child.
	 * @return the value of the maximum child.
	 */
	@NotNull
	GenericAttributeValue<Double> getMaximum();


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
	 * Returns the value of the euclidean child.
	 * @return the value of the euclidean child.
	 */
	@NotNull
	@Required
	Euclidean getEuclidean();


	/**
	 * Returns the value of the squaredEuclidean child.
	 * @return the value of the squaredEuclidean child.
	 */
	@NotNull
	@Required
	SquaredEuclidean getSquaredEuclidean();


	/**
	 * Returns the value of the chebychev child.
	 * @return the value of the chebychev child.
	 */
	@NotNull
	@Required
	Chebychev getChebychev();


	/**
	 * Returns the value of the cityBlock child.
	 * @return the value of the cityBlock child.
	 */
	@NotNull
	@Required
	CityBlock getCityBlock();


	/**
	 * Returns the value of the minkowski child.
	 * @return the value of the minkowski child.
	 */
	@NotNull
	@Required
	Minkowski getMinkowski();


	/**
	 * Returns the value of the simpleMatching child.
	 * @return the value of the simpleMatching child.
	 */
	@NotNull
	@Required
	SimpleMatching getSimpleMatching();


	/**
	 * Returns the value of the jaccard child.
	 * @return the value of the jaccard child.
	 */
	@NotNull
	@Required
	Jaccard getJaccard();


	/**
	 * Returns the value of the tanimoto child.
	 * @return the value of the tanimoto child.
	 */
	@NotNull
	@Required
	Tanimoto getTanimoto();


	/**
	 * Returns the value of the binarySimilarity child.
	 * @return the value of the binarySimilarity child.
	 */
	@NotNull
	@Required
	BinarySimilarity getBinarySimilarity();


}
