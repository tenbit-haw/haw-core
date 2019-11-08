package cn.tenbit.haw.core.chain;

import cn.tenbit.haw.core.exception.HawExceptions;
import cn.tenbit.haw.core.util.HawAsserts;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bangquan.qian
 * @Date 2019-04-15 23:43
 */

public class HawExecuteChain<T> {

    private List<HawExecutable<T>> executables = new ArrayList<>();

    private HawOnCatchExecutable<T> onCatchExecutable;

    private HawExecutable<T> onFinallyExecutable;

    private HawExecuteChain() {
    }

    public static <T> JxExecuteChainBuilder<T> newBuilder() {
        return new JxExecuteChainBuilder<T>();
    }

    public static class JxExecuteChainBuilder<E> {

        private HawExecuteChain<E> chain = new HawExecuteChain<>();

        public JxExecuteChainBuilder<E> then(HawExecutable<E> executable) {
            HawAsserts.notNull(executable, "executable is null");
            chain.executables.add(executable);
            return this;
        }

        public JxExecuteChainBuilder<E> onCatch(HawOnCatchExecutable<E> executable) {
            HawAsserts.notNull(executable, "executable is null");
            if (chain.onCatchExecutable != null) {
                throw HawExceptions.ofSys("onCatch already set").newOne();
            }
            chain.onCatchExecutable = executable;
            return this;
        }

        public JxExecuteChainBuilder<E> onFinally(HawExecutable<E> executable) {
            HawAsserts.notNull(executable, "executable is null");
            if (chain.onFinallyExecutable != null) {
                throw HawExceptions.ofSys("onFinally already set").newOne();
            }
            chain.onFinallyExecutable = executable;
            return this;
        }

        public HawExecuteChain<E> build() {
            return chain;
        }

    }

    public T execute(T target) throws Throwable {
        HawAsserts.notNull(target, "target is null");
        try {
            for (HawExecutable<T> executable : executables) {
                executable.execute(target);
            }
        } catch (Throwable e) {
            if (onCatchExecutable != null) {
                onCatchExecutable.execute(target, e);
            } else {
                throw e;
            }
        } finally {
            if (onFinallyExecutable != null) {
                onFinallyExecutable.execute(target);
            }
        }
        return target;
    }

}