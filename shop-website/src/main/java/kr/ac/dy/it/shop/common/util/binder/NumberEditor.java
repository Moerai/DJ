package kr.ac.dy.it.shop.common.util.binder;


import kr.ac.dy.it.shop.common.util.NumberUtils;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.util.StringUtils;

/**
 * Created by PARK on 2017-02-08.
 */
public class NumberEditor extends CustomNumberEditor {

    public NumberEditor(Class<? extends Number> numberClass) throws IllegalArgumentException {
        super(numberClass, true);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!StringUtils.hasText(text)) {
            setValue(0);
        } else {
            if (!NumberUtils.isNumber(text)) {
                setValue(0);
            } else {
                super.setAsText(text.trim());
            }
        }
    }

}