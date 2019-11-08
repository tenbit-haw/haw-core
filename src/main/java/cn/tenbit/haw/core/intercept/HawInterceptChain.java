package cn.tenbit.haw.core.intercept;

import cn.tenbit.haw.core.util.HawAsserts;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-06-20 10:20
 */
public class HawInterceptChain<T> {

    private List<HawInterceptable<T>> interceptables = new ArrayList<>();

    private HawInterceptChain() {
    }

    public static <T> HareInterceptChainBuilder<T> newBuilder() {
        return new HareInterceptChainBuilder<>();
    }

    public static class HareInterceptChainBuilder<T> {

        private HawInterceptChain<T> chain = new HawInterceptChain<>();

        public HareInterceptChainBuilder<T> then(HawInterceptable<T> interceptable) {
            HawAsserts.notNull(interceptable);
            chain.interceptables.add(interceptable);
            return this;
        }

        public HawInterceptChain<T> build() {
            return chain;
        }
    }

    public T execute(T target) throws Throwable {
        for (HawInterceptable<T> interceptable : interceptables) {
            HawAsserts.notNull(target);
            target = interceptable.intercept(target);
        }
        return target;
    }
}