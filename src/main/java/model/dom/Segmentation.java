// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:SegmentationElemType interface.
 */
public interface Segmentation extends DomElement {

	/**
	 * Returns the value of the multipleModelMethod child.
	 * @return the value of the multipleModelMethod child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<MULTIPLEMODELMETHOD> getMultipleModelMethod();


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
	 * Returns the list of Segment children.
	 * @return the list of Segment children.
	 */
	@NotNull
	@Required
	java.util.List<Segment> getSegments();
	/**
	 * Adds new child to the list of Segment children.
	 * @return created child
	 */
	Segment addSegment();


}
