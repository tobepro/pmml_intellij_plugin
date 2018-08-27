package common;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.psi.codeStyle.NameUtil;
import com.intellij.util.Function;
import com.intellij.util.xml.DomNameStrategy;

import java.util.Arrays;

public class MyNameStrategy extends DomNameStrategy {
    private static Logger logger = Logger.getInstance(MyNameStrategy.class);

    private static final Function<String,String> DECAPITALIZE_FUNCTION = StringUtil::decapitalize;

    @Override
    public String convertName(String propertyName) {
        return propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
    }

    @Override
    public String splitIntoWords(String tagName) {
        return StringUtil.join(Arrays.asList(NameUtil.nameToWords(tagName)), DECAPITALIZE_FUNCTION, " ");
    }
}
