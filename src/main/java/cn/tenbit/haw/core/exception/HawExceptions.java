package cn.tenbit.haw.core.exception;

import cn.tenbit.haw.core.util.HawAsserts;

/**
 * @author bangquan.qian
 * @date 2019-10-23 16:49
 */
public class HawExceptions {

    public static final HawExceptionOperations FAILURE = ofSys("failure");

    public static final HawExceptionOperations UNSUPPORTED = ofSys("unsupported");

    public static RuntimeException turns2BizRe(Throwable e) {
        HawAsserts.notNull(e);
        if (e instanceof RuntimeException) {
            return (RuntimeException) e;
        }
        return ofBiz(e).newOne();
    }

    public static RuntimeException turns2Re(Throwable e) {
        return turns2SysRe(e);
    }

    public static RuntimeException turns2SysRe(Throwable e) {
        HawAsserts.notNull(e);
        if (e instanceof RuntimeException) {
            return (RuntimeException) e;
        }
        return ofSys(e).newOne();
    }

    public static void throw2BizRe(Throwable e) {
        throw turns2BizRe(e);
    }

    public static void throw2Re(Throwable e) {
        throw turns2Re(e);
    }

    public static void throw2SysRe(Throwable e) {
        throw turns2SysRe(e);
    }

    public static void throwAuto(Throwable e) throws Throwable {
        HawAsserts.notNull(e);
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        }
        throw e;
    }

    public static HawExceptionOperations ofBiz(String msg) {
        return of(new HawBizException(msg));
    }

    public static HawExceptionOperations ofBiz(Throwable e) {
        return of(new HawBizException(e));
    }

    public static HawExceptionOperations ofBiz(String msg, Throwable e) {
        return of(new HawBizException(msg, e));
    }

    public static HawExceptionOperations ofSys(String msg) {
        return of(new HawSysException(msg));
    }

    public static HawExceptionOperations ofSys(Throwable e) {
        return of(new HawSysException(e));
    }

    public static HawExceptionOperations ofSys(String msg, Throwable e) {
        return of(new HawSysException(e));
    }

    private static HawExceptionOperations of(HawException exception) {
        return new HawExceptionOperations(exception);
    }
}
