// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:LiftGraphElemType interface.
 */
public interface LiftGraph extends DomElement {

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
	 * Returns the value of the XCoordinates child.
	 * @return the value of the XCoordinates child.
	 */
	@NotNull
	@Required
	XCoordinates getXCoordinates();


	/**
	 * Returns the value of the YCoordinates child.
	 * @return the value of the YCoordinates child.
	 */
	@NotNull
	@Required
	YCoordinates getYCoordinates();


	/**
	 * Returns the value of the BoundaryValues child.
	 * @return the value of the BoundaryValues child.
	 */
	@NotNull
	BoundaryValues getBoundaryValues();


	/**
	 * Returns the value of the BoundaryValueMeans child.
	 * @return the value of the BoundaryValueMeans child.
	 */
	@NotNull
	BoundaryValueMeans getBoundaryValueMeans();


}
