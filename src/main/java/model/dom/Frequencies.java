// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.NameStrategy;
import common.MyNameStrategy;
import org.jetbrains.annotations.NotNull;

/**
 * http://www.dmg.org/PMML-4_3:FrequenciesType model group interface.
 */
@NameStrategy(MyNameStrategy.class)
public interface Frequencies {

	@NotNull
	java.util.List<Array> getArrays();
	Array addArray();


}
