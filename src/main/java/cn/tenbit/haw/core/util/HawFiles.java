package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.support.HawExecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author bangquan.qian
 * @date 2019-11-01 18:18
 */
public class HawFiles {

    public static InputStream openInputStream(String path) {
        return openInputStream(new File(path));
    }

    public static InputStream openInputStream(final File file) {
        return HawInvokes.invokeWithTurnRe(new HawExecutor<InputStream>() {
            @Override
            public InputStream execute() throws Throwable {
                return new FileInputStream(file);
            }
        });
    }

    public static void closeInputStream(InputStream is) {
        HawIOs.closeInputStream(is);
    }

}
