// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:EmbeddedModel model group interface.
 */
public interface EmbeddedModel {

	@NotNull
	java.util.List<Extension> getExtensions();
	Extension addExtension();


	@NotNull
	Regression getRegression();


	@NotNull
	DecisionTree getDecisionTree();


}
