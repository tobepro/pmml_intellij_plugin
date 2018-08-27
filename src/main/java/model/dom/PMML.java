// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import com.intellij.util.xml.SubTag;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:PMMLElemType interface.
 */
public interface PMML extends DomElement {

	@NotNull
	@Required
	GenericAttributeValue<String> getVersion();

	@NotNull
	@Required
	Header getHeader();

	@NotNull
	@Required
	@SubTag("DataDictionary")
	DataDictionary getDataDictionary();
	
	@NotNull
	java.util.List<Extension> getExtensions();

	Extension addExtension();
	
	@NotNull
	@Required
	@SubTag("Scorecard")
	Scorecard getScorecard();
}
