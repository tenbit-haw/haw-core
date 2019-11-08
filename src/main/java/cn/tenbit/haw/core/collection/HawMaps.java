package cn.tenbit.haw.core.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @author bangquan.qian
 * @date 2019-10-23 15:55
 */
public class HawMaps {

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHasMap() {
        return new LinkedHashMap<>();
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    public static <K, V> ConcurrentHashMap<K, V> newConcurrentHashMap() {
        return new ConcurrentHashMap<>();
    }

    public static <K extends Comparable, V> ConcurrentSkipListMap<K, V> newConcurrentSkipListMap() {
        return new ConcurrentSkipListMap<>();
    }
}
