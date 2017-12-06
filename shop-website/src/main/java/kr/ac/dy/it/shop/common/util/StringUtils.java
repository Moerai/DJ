package kr.ac.dy.it.shop.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by PARK on 2017-02-08.
 */
public class StringUtils {

    public static final String Empty = "";
    public static final String LINE_BAR = "################################################################################";
    public static final String CRLF = "\r\n";
    public static final String TAB = "\t";

    public static final String FORMAT_LOG = "%-30s\t: %s";

    public static final String STR_APPLICATION_JSON = "application/json";


    public static boolean isEmpty(Object obj) {
        return org.springframework.util.StringUtils.isEmpty(obj);
    }

    public static boolean isEmpty(String obj) {
        return org.springframework.util.StringUtils.isEmpty(obj);
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static boolean isNotEmpty(String obj) {
        return !isEmpty(obj);
    }

    public static Object getTimeStamp() {
        SimpleDateFormat dayTime = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return dayTime.format(new Date(System.currentTimeMillis()));
    }

    public static boolean equals(String val1, String val2) {
        return val1 != null && val2 != null && val1.equals(val2);
    }

    public static boolean notEquals(String val1, String val2) {
        return !equals(val1, val2);
    }


    public static String getUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "").toLowerCase();
    }
    public static String getUuid(int length) {
        return UUID.randomUUID().toString().replaceAll("-", "").toLowerCase().substring(0, length);
    }

    public static String getString(String value) {
        return getString(value, StringUtils.Empty);
    }
    public static String getString(String value, String emptyValue) {
        if (StringUtils.isEmpty(value)) {
            return emptyValue;
        }
        return value;
    }

}