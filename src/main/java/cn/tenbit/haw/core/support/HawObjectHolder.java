package cn.tenbit.haw.core.support;

/**
 * @author bangquan.qian
 * @date 2019-11-06 20:45
 */
public class HawObjectHolder<T> {

    private final T target;

    public HawObjectHolder(T target) {
        this.target = target;
    }

    public T getTarget() {
        return target;
    }
}
