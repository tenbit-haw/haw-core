package cn.tenbit.haw.core.function;

//@FunctionalInterface
public interface HawConsumer<T> {

    void accept(T t) throws Throwable;
}