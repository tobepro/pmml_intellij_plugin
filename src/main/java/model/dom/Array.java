package model.dom;

import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Required;
import common.MyDomElement;
import model.dom.enums.Type;
import org.jetbrains.annotations.NotNull;

public interface Array extends MyDomElement {

    @NotNull
    @Required
    String getValue();

    void setValue(@NotNull String value);


    @NotNull
    GenericAttributeValue<Integer> getN();


    @NotNull
    @Required
    GenericAttributeValue<Type> getType();
}
