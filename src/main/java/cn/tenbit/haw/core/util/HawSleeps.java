package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.exception.HawExceptions;

import java.util.concurrent.TimeUnit;

/**
 * @Author bangquan.qian
 * @Date 2019-04-24 10:43
 */
public class HawSleeps {

    public static void sleep(long timeOut, TimeUnit timeUnit) {
        HawAsserts.notNull(timeUnit);
        try {
            timeUnit.sleep(timeOut);
        } catch (Throwable e) {
            throw HawExceptions.ofSys(e).newOne();
        }
    }

    public static void sleepSeconds(long seconds) {
        sleep(seconds, TimeUnit.SECONDS);
    }
}
