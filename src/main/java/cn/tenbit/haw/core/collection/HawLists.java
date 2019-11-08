package cn.tenbit.haw.core.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author bangquan.qian
 * @date 2019-10-23 13:28
 */
public class HawLists {

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    public static <T> LinkedList<T> newLinkedList() {
        return new LinkedList<>();
    }
}
