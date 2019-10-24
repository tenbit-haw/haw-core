package cn.tenbit.haw.core.support;

/**
 * @author bangquan.qian
 * @date 2019-10-23 19:00
 */
public interface HawExecutor<T> {

    T execute() throws Throwable;
}
