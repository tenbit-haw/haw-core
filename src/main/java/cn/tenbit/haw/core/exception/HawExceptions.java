package cn.tenbit.haw.core.exception;

/**
 * @author bangquan.qian
 * @date 2019-10-23 16:49
 */
public class HawExceptions {

    public static final HawExceptionOperations FAILURE = ofSys("failure");

    public static final HawExceptionOperations UNSUPPORTED = ofSys("unsupported");

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
