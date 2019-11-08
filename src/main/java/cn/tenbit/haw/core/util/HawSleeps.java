package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.support.HawExecutor;

import java.util.concurrent.TimeUnit;

/**
 * @Author bangquan.qian
 * @Date 2019-04-24 10:43
 */
public class HawSleeps {

    public static void sleep(final long timeOut, final TimeUnit timeUnit) {
        HawAsserts.notNull(timeUnit);
        HawInvokes.invokeWithTurnRe(new HawExecutor<Void>() {
            @Override
            public Void execute() throws Throwable {
                timeUnit.sleep(timeOut);
                return null;
            }
        });
    }

    public static void sleepSeconds(long seconds) {
        sleep(seconds, TimeUnit.SECONDS);
    }

    public static void randomRangeSleep(long timeOut, int minus, int plus, TimeUnit timeUnit) {
        sleep(HawRandoms.randomRangePrimitiveLong(timeOut, minus, plus), timeUnit);
    }

    public static void randomRangeSleepSeconds(int timeOut, int minus, int plus) {
        randomRangeSleep(timeOut, minus, plus, TimeUnit.SECONDS);
    }
}
