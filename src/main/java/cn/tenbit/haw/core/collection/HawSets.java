package cn.tenbit.haw.core.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * @author bangquan.qian
 * @date 2019-10-23 13:28
 */
public class HawSets {

    public static <T> HashSet<T> newHashSet() {
        return new HashSet<>();
    }

    public static <T> LinkedHashSet<T> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <T extends Comparable> TreeSet<T> newTreeSet() {
        return new TreeSet<>();
    }

    public static <T extends Comparable> ConcurrentSkipListSet<T> newConcurrentSkipListSet() {
        return new ConcurrentSkipListSet<>();
    }
}
