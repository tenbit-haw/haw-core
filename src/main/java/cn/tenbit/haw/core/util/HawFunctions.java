package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.function.HawConsumer;
import cn.tenbit.haw.core.function.HawFunction;
import cn.tenbit.haw.core.function.HawPredictor;
import cn.tenbit.haw.core.function.HawSupplier;

public class HawFunctions {

    public static <T> void accept(T t, HawConsumer<T> f) throws Throwable {
        f.accept(t);
    }

    public static <T, R> R apply(T t, HawFunction<T, R> f) throws Throwable {
        return f.apply(t);
    }

    public static <T> boolean test(T t, HawPredictor<T> f) throws Throwable {
        return f.test(t);
    }

    public static <T> T test(HawSupplier<T> f) throws Throwable {
        return f.get();
    }
}