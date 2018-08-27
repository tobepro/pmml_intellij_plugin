// Generated on Sat Aug 25 17:43:17 CST 2018
// DTD/Schema  :    http://www.dmg.org/PMML-4_3

package model.dom;

import com.intellij.util.xml.*;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * http://www.dmg.org/PMML-4_3:DataDictionaryElemType interface.
 */
@NameStrategy(JavaNameStrategy.class)
public interface DataDictionary extends DomElement {
    @NotNull
    GenericAttributeValue<Integer> getNumberOfFields();

    @NotNull
    List<Extension> getExtensions();

    Extension addExtension();

    @NotNull
    @Required
    List<DataField> getDataFields();

    @SubTag("DataField")
    DataField addDataField();
}
