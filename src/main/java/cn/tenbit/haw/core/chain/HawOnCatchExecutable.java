package cn.tenbit.haw.core.chain;

/**
 * @Author bangquan.qian
 * @Date 2019-04-15 23:44
 */
//@FunctionalInterface
public interface HawOnCatchExecutable<T> {

    void execute(T target, Throwable e);
}