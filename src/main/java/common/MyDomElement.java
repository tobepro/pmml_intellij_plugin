package common;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.JavaNameStrategy;
import com.intellij.util.xml.NameStrategy;
import com.intellij.util.xml.NameStrategyForAttributes;

@NameStrategy(MyNameStrategy.class)
@NameStrategyForAttributes(JavaNameStrategy.class)
public interface MyDomElement extends DomElement {
}
