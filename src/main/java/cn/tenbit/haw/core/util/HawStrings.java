package cn.tenbit.haw.core.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:43
 */
public class HawStrings {

    public static final String EMPTY = HawDefaults.STRING_EMPTY;

    public static final String SPACE = HawDefaults.STRING_SPACE;

    public static final String LF = HawDefaults.STRING_LF;

    public static final String CR = HawDefaults.STRING_CR;

    public static String toNotNullString(Object obj) {
        return obj == null ? EMPTY : String.valueOf(obj);
    }

    public static String toNullableString(Object obj) {
        return obj == null ? null : String.valueOf(obj);
    }

    public static boolean isEmpty(CharSequence str) {
        return HawObjects.isNull(str) || str.length() < 1;
    }

    public static boolean isNotEmpty(CharSequence str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(CharSequence str) {
        if (isEmpty(str)) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotBlank(CharSequence str) {
        return !isBlank(str);
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

    public static String join(Object... objs) {
        return joinWith(EMPTY, objs);
    }

    public static String join(List lst) {
        return joinWith(EMPTY, lst);
    }

    public static String join(Iterator iterator) {
        return joinWith(EMPTY, iterator);
    }

    public static String joinWith(String separator, List lst) {
        return HawCollections.isEmpty(lst) ? EMPTY : joinWith(separator, lst.iterator());
    }

    public static String joinWith(String separator, Object... objs) {
        return HawArrays.isEmpty(objs) ? EMPTY : joinWith(separator, Arrays.asList(objs).iterator());
    }

    public static String joinWith(String separator, Iterator iterator) {
        HawAsserts.notNull(iterator);
        if (HawObjects.isNull(separator)) {
            separator = EMPTY;
        }
        StringBuilder result = new StringBuilder();
        while (iterator.hasNext()) {
            String value = toNotNullString(iterator.next());
            result.append(value);
            if (iterator.hasNext()) {
                result.append(separator);
            }
        }
        return result.toString();
    }

}
