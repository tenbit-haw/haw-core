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

    public static long randomPrimitiveLong(long min, long max) {
        HawAsserts.isTrue(min <= max);
        return (long) (Math.random() * (max - min + 1)) + min;
    }

    public static long randomRangePrimitiveLong(long original, long minus, long plus) {
        return original + randomPrimitiveLong(minus, plus);
    }

    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    public static long[] randomPrimitiveLongArray(int size, long min, long max) {
        HawAsserts.isTrue(size > 0 && max - min + 1 >= size);
        long[] arr = new long[size];
        for (int idx = 0; idx < size; idx++) {
            long rand = randomPrimitiveLong(min, max);
            boolean contains = false;
            for (int jdx = 0; jdx < idx; jdx++) {
                if (arr[jdx] == rand) {
                    contains = true;
                    break;
                }
            }
            if (contains) {
                idx--;
                continue;
            }
            arr[idx] = rand;
        }
        return arr;
    }

    public static int[] randomPrimitiveIntArray(int size, int min, int max) {
        HawAsserts.isTrue(size > 0 && max - min + 1 >= size);
        int[] arr = new int[size];
        for (int idx = 0; idx < size; idx++) {
            int rand = randomPrimitiveInt(min, max);
            boolean contains = false;
            for (int jdx = 0; jdx < idx; jdx++) {
                if (arr[jdx] == rand) {
                    contains = true;
                    break;
                }
            }
            if (contains) {
                idx--;
                continue;
            }
            arr[idx] = rand;
        }
        return arr;
    }

}
