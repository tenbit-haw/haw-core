package cn.tenbit.haw.core.memqueue.policy;

import cn.tenbit.haw.core.memqueue.HareMemoryQueue;
import cn.tenbit.haw.core.util.HawLogs;

/**
 * @Author bangquan.qian
 * @Date 2019-06-24 17:14
 */
public class IgnoreOverflowPolicy implements HareMemoryQueueOverflowPolicy {

    private static final Class CLZ = IgnoreOverflowPolicy.class;

    @Override
    public boolean handle(HareMemoryQueue queue, Object element) {
        HawLogs.warn(CLZ, "queue size limit to max " + queue.getMaxSize() + ", ignore: " + element);
        return false;
    }
}