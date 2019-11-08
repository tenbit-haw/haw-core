package cn.tenbit.haw.core.collection;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author bangquan.qian
 * @date 2019-11-06 20:52
 */
public class HawQueues {

    public static <T> ArrayDeque<T> newArrayDeque() {
        return new ArrayDeque<>();
    }

    public static <T> LinkedBlockingQueue<T> newLinkedBlockingQueue() {
        return new LinkedBlockingQueue<>();
    }

    public static <T> LinkedBlockingDeque<T> newLinkedBlockingDeque() {
        return new LinkedBlockingDeque<>();
    }

    public static <T> ConcurrentLinkedQueue<T> newConcurrentLinkedQueue() {
        return new ConcurrentLinkedQueue<>();
    }
}
