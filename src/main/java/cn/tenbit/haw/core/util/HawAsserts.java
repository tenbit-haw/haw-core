package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.exception.HawExceptions;

import java.util.Collection;
import java.util.Map;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:14
 */
public class HawAsserts {

    public static void notNull(Object obj, String msg) {
        if (HawObjects.isNull(obj)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void notNull(Object obj) {
        notNull(obj, "obj is null");
    }

    public static void notEmpty(Collection col, String msg) {
        if (HawCollections.isEmpty(col)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void notEmpty(Collection col) {
        notEmpty(col, "collection is null or empty");
    }

    public static void notEmpty(Map map, String msg) {
        if (HawCollections.isEmpty(map)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException("map is null or empty")).newOne();
        }
    }

    public static void notEmpty(Map map) {
        notEmpty(map, "map is null or empty");
    }

    public static void notEmpty(String str, String msg) {
        if (HawStrings.isEmpty(str)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void notEmpty(String str) {
        notEmpty(str, "string is null or empty");
    }

    public static void notBlank(String str, String msg) {
        if (HawStrings.isBlank(str)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void notBlank(String str) {
        notBlank(str, "string is null or blank");
    }

    public static void isTrue(Boolean res, String msg) {
        // res == null -> true
        // res == true -> false
        // res == false -> true
        if (HawBooleans.isNotTrue(res)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void isTrue(Boolean res) {
        isTrue(res, "not true");
    }

    public static void isFalse(Boolean res, String msg) {
        // res == null -> false
        // res == true -> true
        // res == false -> false
        if (HawBooleans.isTrue(res)) {
            throw HawExceptions.ofBiz(new IllegalArgumentException(msg)).newOne();
        }
    }

    public static void isFalse(Boolean res) {
        isFalse(res, "not false");
    }
}
