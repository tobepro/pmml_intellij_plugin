// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:MiningFieldElemType interface.
 */
public interface MiningField extends DomElement {

	/**
	 * Returns the value of the name child.
	 * @return the value of the name child.
	 */
	@NotNull
	@Required
	GenericAttributeValue<String> getName();


	/**
	 * Returns the value of the usageType child.
	 * @return the value of the usageType child.
	 */
	@NotNull
	GenericAttributeValue<FIELDUSAGETYPE> getUsageType();


	/**
	 * Returns the value of the optype child.
	 * @return the value of the optype child.
	 */
	@NotNull
	GenericAttributeValue<Optype> getOptype();


	/**
	 * Returns the value of the importance child.
	 * @return the value of the importance child.
	 */
	@NotNull
	GenericAttributeValue<Double> getImportance();


	/**
	 * Returns the value of the outliers child.
	 * @return the value of the outliers child.
	 */
	@NotNull
	GenericAttributeValue<OUTLIERTREATMENTMETHOD> getOutliers();


	/**
	 * Returns the value of the lowValue child.
	 * @return the value of the lowValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getLowValue();


	/**
	 * Returns the value of the highValue child.
	 * @return the value of the highValue child.
	 */
	@NotNull
	GenericAttributeValue<Double> getHighValue();


	/**
	 * Returns the value of the missingValueReplacement child.
	 * @return the value of the missingValueReplacement child.
	 */
	@NotNull
	GenericAttributeValue<String> getMissingValueReplacement();


	/**
	 * Returns the value of the missingValueTreatment child.
	 * @return the value of the missingValueTreatment child.
	 */
	@NotNull
	GenericAttributeValue<MISSINGVALUETREATMENTMETHOD> getMissingValueTreatment();


	/**
	 * Returns the value of the invalidValueTreatment child.
	 * @return the value of the invalidValueTreatment child.
	 */
	@NotNull
	GenericAttributeValue<INVALIDVALUETREATMENTMETHOD> getInvalidValueTreatment();


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


}
