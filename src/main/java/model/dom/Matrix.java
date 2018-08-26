// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:MatrixElemType interface.
 */
public interface Matrix extends DomElement {

	/**
	 * Returns the value of the kind child.
	 * @return the value of the kind child.
	 */
	@NotNull
	GenericAttributeValue<Kind> getKind();


	/**
	 * Returns the value of the nbRows child.
	 * @return the value of the nbRows child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNbRows();


	/**
	 * Returns the value of the nbCols child.
	 * @return the value of the nbCols child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getNbCols();


	/**
	 * Returns the value of the diagDefault child.
	 * @return the value of the diagDefault child.
	 */
	@NotNull
	GenericAttributeValue<Double> getDiagDefault();


	/**
	 * Returns the value of the offDiagDefault child.
	 * @return the value of the offDiagDefault child.
	 */
	@NotNull
	GenericAttributeValue<Double> getOffDiagDefault();


	/**
	 * Returns the list of MatCell children.
	 * @return the list of MatCell children.
	 */
	@NotNull
	@Required
	java.util.List<MatCell> getMatCells();
	/**
	 * Adds new child to the list of MatCell children.
	 * @return created child
	 */
	MatCell addMatCell();


	/**
	 * Returns the list of Array children.
	 * @return the list of Array children.
	 */
	@NotNull
	java.util.List<Array> getArrays();
	/**
	 * Adds new child to the list of Array children.
	 * @return created child
	 */
	Array addArray();


}
