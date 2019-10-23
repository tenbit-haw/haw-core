package cn.tenbit.haw.core.util;

import java.util.*;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:05
 */
public class HawObjects {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static <T> int compare(T o1, T o2, Comparator<T> comparator) {
        HawAsserts.notNull(comparator);
        return comparator.compare(o1, o2);
    }

    public static boolean equals(Object o1, Object o2) {
        return (o1 == o2) || (o1 != null && o1.equals(o2));
    }

    public static <T> T defaultIfNull(T obj, T def) {
        return obj == null ? def : obj;
    }

    public static <T> List<T> emptyIfNull(List<T> col) {
        return HawCollections.emptyIfNull(col);
    }

    public static <T> Set<T> emptyIfNull(Set<T> col) {
        return HawCollections.emptyIfNull(col);
    }

    public static <K, V> Map<K, V> emptyIfNull(Map<K, V> map) {
        return HawCollections.emptyIfNull(map);
    }

    public static String toNotNullString(Object obj) {
        return HawStrings.toNotNullString(obj);
    }

    public static String toNullableString(Object obj) {
        return HawStrings.toNullableString(obj);
    }
}
