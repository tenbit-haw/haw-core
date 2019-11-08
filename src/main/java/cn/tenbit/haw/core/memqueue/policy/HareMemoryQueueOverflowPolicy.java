package cn.tenbit.haw.core.memqueue.policy;

import cn.tenbit.haw.core.memqueue.HareMemoryQueue;

/**
 * @Author bangquan.qian
 * @Date 2019-06-24 17:31
 */
public interface HareMemoryQueueOverflowPolicy {

    <T> boolean handle(HareMemoryQueue<T> queue, T element);
}