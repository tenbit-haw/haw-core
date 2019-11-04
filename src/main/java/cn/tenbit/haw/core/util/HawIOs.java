package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.support.HawExecutor;

import java.io.InputStream;

/**
 * @author bangquan.qian
 * @date 2019-11-04 15:28
 */
public class HawIOs {

    public static void closeInputStream(final InputStream is) {
        if (is == null) {
            return;
        }
        HawInvokes.invokeWithTurnRe(new HawExecutor<Void>() {
            @Override
            public Void execute() throws Throwable {
                is.close();
                return null;
            }
        });
    }
}
