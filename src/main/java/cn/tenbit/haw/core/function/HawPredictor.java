package cn.tenbit.haw.core.function;

//@FunctionalInterface
public interface HawPredictor<T> {

    boolean test(T t) throws Throwable;
}