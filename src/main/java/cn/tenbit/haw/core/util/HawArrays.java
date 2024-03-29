package cn.tenbit.haw.core.util;

import java.util.Collection;
import java.util.List;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:02
 */
public class HawArrays {

    public static final Object[] OBJECT_EMPTY = HawDefaults.OBJECT_ARRAY_EMPTY;

    public static final String[] STRING_EMPTY = HawDefaults.STRING_ARRAY_EMPTY;

    public static final Integer[] INTEGER_EMPTY = HawDefaults.INTEGER_ARRAY_EMPTY;

    public static final Long[] LONG_EMPTY = HawDefaults.LONG_ARRAY_EMPTY;

    public static final int[] INT_PRIMITIVE_EMPTY = HawDefaults.INT_PRIMITIVE_ARRAY_EMPTY;

    public static final long[] LONG_PRIMITIVE_EMPTY = HawDefaults.LONG_PRIMITIVE_ARRAY_EMPTY;

    public static boolean isEmpty(Object[] objs) {
        return HawObjects.isNull(objs) || objs.length < 1;
    }

    public static boolean isEmpty(Integer[] arr) {
        return HawObjects.isNull(arr) || arr.length < 1;
    }

    public static boolean isEmpty(Long[] arr) {
        return HawObjects.isNull(arr) || arr.length < 1;
    }

    public static boolean isEmpty(int[] arr) {
        return HawObjects.isNull(arr) || arr.length < 1;
    }

    public static boolean isEmpty(long[] arr) {
        return HawObjects.isNull(arr) || arr.length < 1;
    }

    public static <T> T[] toArray(Collection<T> col, T[] arr) {
        HawAsserts.notNull(col);
        return col.toArray(arr);
    }

    public static <T> List<T> asList(T[] objs) {
        return HawCollections.asList(objs);
    }

    public long[] primitiveLong2IntArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int len = arr.length;
        if (len < 1) {
            return LONG_PRIMITIVE_EMPTY;
        }
        long[] dst = new long[len];
        for (int idx = 0; idx < len; idx++) {
            dst[idx] = arr[idx];
        }
        return dst;
    }
}
