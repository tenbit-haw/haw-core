package cn.tenbit.haw.core.test.util;

import cn.tenbit.haw.core.util.HawLogs;
import org.junit.Test;

/**
 * @author bangquan.qian
 * @date 2019-10-24 22:02
 */
public class HawLogsTest {

    private static final Class CLZ = HawLogsTest.class;

    @Test
    public void test() {
        HawLogs.trace(CLZ, "123");
        HawLogs.debug(CLZ, "123");
        HawLogs.info(CLZ, "123");
        HawLogs.error(CLZ, "123");
    }

}
