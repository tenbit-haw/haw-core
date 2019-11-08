package cn.tenbit.haw.core.memqueue.policy;

import cn.tenbit.haw.core.exception.HawExceptions;
import cn.tenbit.haw.core.memqueue.HareMemoryQueue;

/**
 * @Author bangquan.qian
 * @Date 2019-06-24 17:14
 */
public class DefaultRejectOverflowPolicy implements HareMemoryQueueOverflowPolicy {

    @Override
    public boolean handle(HareMemoryQueue queue, Object element) {
        throw HawExceptions.ofSys("queue size limit to max " + queue.getMaxSize()).newOne();
    }
}