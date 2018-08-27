// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:PMMLElemType interface.
 */
public interface PMML extends MyDomElement {

	@NotNull
	@Required
	GenericAttributeValue<String> getVersion();

	@NotNull
	@Required
	Header getHeader();

	@NotNull
	@Required
	DataDictionary getDataDictionary();
	
	@NotNull
	java.util.List<Extension> getExtensions();

	Extension addExtension();
	
	@NotNull
	@Required
	Scorecard getScorecard();
}
