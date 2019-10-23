package cn.tenbit.haw.core.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bangquan.qian
 * @date 2019-10-23 15:55
 */
public class HawMaps {

    public static <K, V> Map<K, V> newHashMap() {
        return new HashMap<>();
    }
}
