// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:TextIndexNormalizationElemType interface.
 */
public interface TextIndexNormalization extends DomElement {

	/**
	 * Returns the value of the inField child.
	 * @return the value of the inField child.
	 */
	@NotNull
	GenericAttributeValue<String> getInField();


	/**
	 * Returns the value of the outField child.
	 * @return the value of the outField child.
	 */
	@NotNull
	GenericAttributeValue<String> getOutField();


	/**
	 * Returns the value of the regexField child.
	 * @return the value of the regexField child.
	 */
	@NotNull
	GenericAttributeValue<String> getRegexField();


	/**
	 * Returns the value of the recursive child.
	 * @return the value of the recursive child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getRecursive();


	/**
	 * Returns the value of the isCaseSensitive child.
	 * @return the value of the isCaseSensitive child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getIsCaseSensitive();


	/**
	 * Returns the value of the maxLevenshteinDistance child.
	 * @return the value of the maxLevenshteinDistance child.
	 */
	@NotNull
	GenericAttributeValue<Integer> getMaxLevenshteinDistance();


	/**
	 * Returns the value of the wordSeparatorCharacterRE child.
	 * @return the value of the wordSeparatorCharacterRE child.
	 */
	@NotNull
	GenericAttributeValue<String> getWordSeparatorCharacterRE();


	/**
	 * Returns the value of the tokenize child.
	 * @return the value of the tokenize child.
	 */
	@NotNull
	GenericAttributeValue<Boolean> getTokenize();


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
	 * Returns the value of the TableLocator child.
	 * @return the value of the TableLocator child.
	 */
	@NotNull
	@Required
	TableLocator getTableLocator();


	/**
	 * Returns the value of the InlineTable child.
	 * @return the value of the InlineTable child.
	 */
	@NotNull
	@Required
	InlineTable getInlineTable();


}
