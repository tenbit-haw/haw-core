package cn.tenbit.haw.core.util;

import java.util.UUID;

/**
 * @author bangquan.qian
 * @date 2019-10-23 18:45
 */
public class HawRandoms {

    public static int randomPrimitiveInt(int min, int max) {
        HawAsserts.isTrue(min <= max);
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static int randomRangePrimitiveInt(int original, int minus, int plus) {
        return original + randomPrimitiveInt(minus, plus);
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

}
