package cn.tenbit.haw.core.function;

//@FunctionalInterface
public interface HawSupplier<T> {

    T get() throws Throwable;
}