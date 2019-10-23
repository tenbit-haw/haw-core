package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.exception.HawBizException;

import java.util.Collection;
import java.util.Map;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:14
 */
public class HawAsserts {

    public static void notNull(Object obj) {
        if (HawObjects.isNull(obj)) {
            throw new HawBizException(new IllegalArgumentException("obj is null"));
        }
    }

    public static void notEmpty(Collection col) {
        if (HawCollections.isEmpty(col)) {
            throw new HawBizException(new IllegalArgumentException("collection is null or empty"));
        }
    }

    public static void notEmpty(Map map) {
        if (HawCollections.isEmpty(map)) {
            throw new HawBizException(new IllegalArgumentException("map is null or empty"));
        }
    }

    public static void notEmpty(String str) {
        if (HawStrings.isEmpty(str)) {
            throw new HawBizException(new IllegalArgumentException("string is null or empty"));
        }
    }

    public static void notBlank(String str) {
        if (HawStrings.isBlank(str)) {
            throw new HawBizException(new IllegalArgumentException("string is null or blank"));
        }
    }
}
