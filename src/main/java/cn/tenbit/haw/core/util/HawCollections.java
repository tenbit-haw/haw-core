package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.collection.HawLists;
import cn.tenbit.haw.core.collection.HawMaps;
import cn.tenbit.haw.core.collection.HawSets;

import java.util.*;

/**
 * @author bangquan.qian
 * @date 2019-10-23 10:56
 */
public class HawCollections {

    public static boolean isEmpty(Collection col) {
        // return col == null || col.size() < 1;
        return HawObjects.isNull(col) || col.isEmpty();
    }

    public static boolean isNotEmpty(Collection col) {
        return !isEmpty(col);
    }

    public static boolean isEmpty(Map map) {
        // return map == null || map.size() < 1;
        return HawObjects.isNull(map) || map.isEmpty();
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

    public static <T> List<T> newArrayListIfNull(List<T> col) {
        return isEmpty(col) ? HawLists.<T>newArrayList() : col;
    }

    public static <T> Set<T> newHashSetIfNull(Set<T> col) {
        return isEmpty(col) ? HawSets.<T>newHashSet() : col;
    }

    public static <K, V> Map<K, V> newHashMapIfNull(Map<K, V> map) {
        return isEmpty(map) ? HawMaps.<K, V>newHashMap() : map;
    }

    public static <T> List<T> emptyIfNull(List<T> col) {
        return isEmpty(col) ? Collections.<T>emptyList() : col;
    }

    public static <T> Set<T> emptyIfNull(Set<T> col) {
        return isEmpty(col) ? Collections.<T>emptySet() : col;
    }

    public static <K, V> Map<K, V> emptyIfNull(Map<K, V> map) {
        return isEmpty(map) ? Collections.<K, V>emptyMap() : map;
    }

    public static <T> List<T> asList(T[] objs) {
        List<T> list = HawLists.newArrayList();
        if (HawArrays.isEmpty(objs)) {
            return list;
        }
        Collections.addAll(list, objs);
        return list;
    }
}
