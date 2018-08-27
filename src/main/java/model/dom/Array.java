package model.dom;

import com.intellij.util.xml.*;
import com.intellij.util.xml.DomElement;
import model.dom.enums.Type;
import org.jetbrains.annotations.NotNull;

public interface Array extends DomElement {

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
