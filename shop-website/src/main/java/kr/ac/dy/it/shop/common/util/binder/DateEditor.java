package kr.ac.dy.it.shop.common.util.binder;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.StringUtils;

import java.text.DateFormat;

/**
 * Created by PARK on 2017-02-08.
 */
public class DateEditor extends CustomDateEditor {

    public DateEditor(DateFormat dateFormat) throws IllegalArgumentException {
        super(dateFormat, true);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (!StringUtils.hasText(text)) {
            setValue(null);
        } else {
            super.setAsText(text.trim());
        }
    }

}