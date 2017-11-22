package kr.ac.dy.it.shop.common.util;

import org.springframework.util.StringUtils;

/**
 * Created by PARK on 2017-02-08.
 */
public class NumberUtils {

    public static boolean isNumber(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            char[] chars = str.toCharArray();
            int sz = chars.length;
            boolean hasExp = false;
            boolean hasDecPoint = false;
            boolean allowSigns = false;
            boolean foundDigit = false;
            int start = chars[0] == 45 ? 1 : 0;
            int i;
            if (sz > start + 1 && chars[start] == 48) {
                if (chars[start + 1] == 120 || chars[start + 1] == 88) {
                    i = start + 2;
                    if (i == sz) {
                        return false;
                    }

                    while (i < chars.length) {
                        if ((chars[i] < 48 || chars[i] > 57) && (chars[i] < 97 || chars[i] > 102) && (chars[i] < 65 || chars[i] > 70)) {
                            return false;
                        }

                        ++i;
                    }

                    return true;
                }

                if (Character.isDigit(chars[start + 1])) {
                    for (i = start + 1; i < chars.length; ++i) {
                        if (chars[i] < 48 || chars[i] > 55) {
                            return false;
                        }
                    }

                    return true;
                }
            }

            --sz;

            for (i = start; i < sz || i < sz + 1 && allowSigns && !foundDigit; ++i) {
                if (chars[i] >= 48 && chars[i] <= 57) {
                    foundDigit = true;
                    allowSigns = false;
                } else if (chars[i] == 46) {
                    if (hasDecPoint || hasExp) {
                        return false;
                    }

                    hasDecPoint = true;
                } else if (chars[i] != 101 && chars[i] != 69) {
                    if (chars[i] != 43 && chars[i] != 45) {
                        return false;
                    }

                    if (!allowSigns) {
                        return false;
                    }

                    allowSigns = false;
                    foundDigit = false;
                } else {
                    if (hasExp) {
                        return false;
                    }

                    if (!foundDigit) {
                        return false;
                    }

                    hasExp = true;
                    allowSigns = true;
                }
            }

            return i < chars.length ? (chars[i] >= 48 && chars[i] <= 57 || ((chars[i] != 101 && chars[i] != 69) && (chars[i] == 46 ? ((!hasDecPoint && !hasExp) && foundDigit) : (!allowSigns && (chars[i] == 100 || chars[i] == 68 || chars[i] == 102 || chars[i] == 70) ? foundDigit : ((chars[i] == 108 || chars[i] == 76) && (foundDigit && !hasExp && !hasDecPoint)))))) : !allowSigns && foundDigit;
        }
    }

    public static double toDoubleNumber(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
        }
        return 0;
    }

    public static int toNumber(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
        }
        return 0;
    }

    public static int[] dateNumberByString(String value) {

        int number[] = {0, 0, 0};

        if (!org.springframework.util.StringUtils.isEmpty(value)) {
            String arr[] = value.split("-");
            number[0] = (arr.length > 0) ? toNumber(arr[0]) : 0;
            number[1] = (arr.length > 1) ? toNumber(arr[1]) : 0;
            number[2] = (arr.length > 2) ? toNumber(arr[2]) : 0;
        }

        return number;
    }

}
