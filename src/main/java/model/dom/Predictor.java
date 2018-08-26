// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:PredictorElemType interface.
 */
public interface Predictor extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the contrastMatrixType child.
	 * @return the value of the contrastMatrixType child.
	 */
	@NotNull
	GenericAttributeValue<String> getContrastMatrixType();


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
	 * Returns the value of the Categories child.
	 * @return the value of the Categories child.
	 */
	@NotNull
	Categories getCategories();


	/**
	 * Returns the value of the Matrix child.
	 * @return the value of the Matrix child.
	 */
	@NotNull
	Matrix getMatrix();


}
