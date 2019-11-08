package cn.tenbit.haw.core.memqueue;

import cn.tenbit.haw.core.memqueue.policy.DefaultRejectOverflowPolicy;
import cn.tenbit.haw.core.memqueue.policy.HareMemoryQueueOverflowPolicy;
import cn.tenbit.haw.core.util.HawCollections;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author bangquan.qian
 * @Date 2019-06-24 17:43
 */
public abstract class AbstractHareMemoryQueue<T> implements HareMemoryQueue<T> {

    public static final int UNLIMITED = -1;

    private final AtomicInteger maxSize = new AtomicInteger(UNLIMITED);

    private final AtomicReference<HareMemoryQueueOverflowPolicy> policy = new AtomicReference<>();

    public AbstractHareMemoryQueue() {
        this.setOverflowPolicy(new DefaultRejectOverflowPolicy());
    }

    public AbstractHareMemoryQueue(int maxSize) {
        this();
        this.setMaxSize(maxSize);
    }

    @Override
    public void batchOffer(List<T> list) {
        if (HawCollections.isEmpty(list)) {
            return;
        }
        for (T element : list) {
            offer(element);
        }
    }

    @Override
    public T poll() {
        return getFirst(batchPoll(1));
    }

    @Override
    public T poll(TimeUnit timeUnit, long timeOut) {
        return getFirst(batchPoll(1, timeUnit, timeOut));
    }

    @Override
    public List<T> batchPoll(int expectSize) {
        return batchPoll(expectSize, null, UNLIMITED);
    }

    @Override
    public T take() {
        return getFirst(batchTake(1));
    }

    private T getFirst(List<T> ts) {
        return HawCollections.isEmpty(ts) ? null : ts.get(0);
    }

    @Override
    public void setOverflowPolicy(HareMemoryQueueOverflowPolicy policy) {
        this.policy.set(policy);
    }

    @Override
    public void setMaxSize(int maxSize) {
        this.maxSize.set(maxSize);
    }

    @Override
    public int getMaxSize() {
        return maxSize.get();
    }

    boolean checkIfOverflow() {
        int maxSize = getMaxSize();
        return maxSize != UNLIMITED && maxSize <= size();
    }

    boolean handleOverflow(T element) {
        return policy.get().handle(this, element);
    }
}