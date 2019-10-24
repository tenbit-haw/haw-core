package cn.tenbit.haw.core.test.util;

import cn.tenbit.haw.core.util.HawConsoles;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author bangquan.qian
 * @date 2019-10-24 22:02
 */
public class HawConsolesTest {

    @Test
    public void test() {
        HawConsoles.sout();
        HawConsoles.sout("1");
        HawConsoles.sout("1", "2");
        HawConsoles.jsout(new HashMap<>());
        HawConsoles.jsout(new HashMap<>(),new HashMap<>());
        HawConsoles.jpsout(new HashMap<>());
        HawConsoles.jpsout(new HashMap<>(),new HashMap<>());
    }
}
