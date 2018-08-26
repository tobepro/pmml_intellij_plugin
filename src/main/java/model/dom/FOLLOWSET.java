// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:FOLLOW-SET model group interface.
 */
public interface FOLLOWSET {

	@NotNull
	java.util.List<Extension> getExtensions();
	Extension addExtension();


	@NotNull
	Delimiter getDelimiter();


	@NotNull
	Time getTime();


	@NotNull
	SetReference getSetReference();


}
