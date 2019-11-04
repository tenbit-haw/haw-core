package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.support.HawExecutor;

import java.io.InputStream;

/**
 * @author bangquan.qian
 * @date 2019-11-01 18:00
 */
public class HawClass {

    private static final Class CLZ = HawClass.class;

    public static Class loadClass(final String name) {
        return HawInvokes.invokeWithTurnRe(new HawExecutor<Class>() {
            @Override
            public Class execute() throws Throwable {
                return Class.forName(name);
            }
        });
    }

    public static InputStream getResourceAsStream(String name) {
        return CLZ.getResourceAsStream(name);
    }
}
