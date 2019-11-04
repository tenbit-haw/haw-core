package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.exception.HawExceptions;
import cn.tenbit.haw.core.support.HawExecutor;

/**
 * @author bangquan.qian
 * @date 2019-10-23 18:56
 */
public class HawInvokes {

    private static final Class CLZ = HawInvokes.class;

    public static <T> T invoke(HawExecutor<T> executor) {
        try {
            return executor.execute();
        } catch (Throwable e) {
            throw HawExceptions.ofBiz(e).newOne();
        }
    }

    public static <T> T invokeWithSwallow(HawExecutor<T> executor) {
        try {
            return executor.execute();
        } catch (Throwable e) {
            HawLogs.error(CLZ, "invokeWithSwallow", e);
        }
        return null;
    }

    public static <T> T invokeWithTurnRe(HawExecutor<T> executor) {
        try {
            return executor.execute();
        } catch (Throwable e) {
            throw HawExceptions.turns2Re(e);
        }
    }
}
