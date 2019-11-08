package cn.tenbit.haw.core.event;

/**
 * @Author bangquan.qian
 * @Date 2019-07-21 13:55
 */
public interface HawObserver<T> extends Comparable<T> {

    void update(HawObservable observable, Object arg);
}