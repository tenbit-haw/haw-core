package cn.tenbit.haw.core.function;

//@FunctionalInterface
public interface HawFunction<T, R> {

    R apply(T t) throws Throwable;
}