package cn.tenbit.haw.core.intercept;

/**
 * @Author bangquan.qian
 * @Date 2019-06-20 10:19
 */
//@FunctionalInterface
public interface HawInterceptable<T> {

    T intercept(T target) throws Throwable;
}