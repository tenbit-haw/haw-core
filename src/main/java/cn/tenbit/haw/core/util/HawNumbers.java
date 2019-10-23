package cn.tenbit.haw.core.util;

import java.math.BigDecimal;

/**
 * @author bangquan.qian
 * @date 2019-10-23 17:51
 */
public class HawNumbers {

    public static BigDecimal safe2BigDecimal(Integer value, BigDecimal safe) {
        return value == null ? safe : new BigDecimal(value);
    }

    public static Integer safe2Integer(Long value, Integer safe) {
        return value == null ? safe : Integer.valueOf(value.intValue());
    }

    public static Long safe2Long(Integer value, Long safe) {
        return value == null ? safe : Long.valueOf(value.longValue());
    }

    public static int safeUnboxing(Integer num, int safe) {
        return HawObjects.defaultIfNull(num, safe);
    }

    public static long safeUnboxing(Long num, long safe) {
        return HawObjects.defaultIfNull(num, safe);
    }
}
