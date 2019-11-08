package cn.tenbit.haw.core.event;

import cn.tenbit.haw.core.util.HawAsserts;
import cn.tenbit.haw.core.util.HawCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 14:01
 */
public class HawObservable {

    private final AtomicBoolean changed = new AtomicBoolean(false);

    private final ConcurrentSkipListSet<HawObserver> observers = new ConcurrentSkipListSet<>();

    private final AtomicInteger count = new AtomicInteger(0);

    private final Object lock = new Object();

    public boolean addObserver(HawObserver o) {
        HawAsserts.notNull(o);
        boolean result = observers.add(o);
        if (result) {
            count.incrementAndGet();
        }
        return result;
    }

    public boolean removeObserver(HawObserver o) {
        HawAsserts.notNull(o);
        boolean result = observers.remove(o);
        if (result) {
            count.decrementAndGet();
        }
        return result;
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (hasChanged()) {
            return;
        }

        synchronized (lock) {
            if (hasChanged()) {
                return;
            }
            try {
                setChanged();

                List<HawObserver> os = new ArrayList<>(observers);
                if (HawCollections.isEmpty(os)) {
                    return;
                }

                for (HawObserver o : os) {
                    o.update(this, arg);
                }
            } finally {
                clearChanged();
            }
        }
    }

    public void clearObservers() {
        observers.clear();
        count.getAndSet(0);
    }

    private void setChanged() {
        changed.getAndSet(true);
    }

    private void clearChanged() {
        changed.getAndSet(false);
    }

    public boolean hasChanged() {
        return changed.get();
    }

    public int countObservers() {
        return count.get();
    }
}