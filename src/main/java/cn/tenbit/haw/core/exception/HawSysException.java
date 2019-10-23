package cn.tenbit.haw.core.exception;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:30
 */
public class HawSysException extends HawException {
    private static final long serialVersionUID = -2727389246250264674L;

    public static final long DEFAULT_CODE = HawCodeDefines.SYS_FAIL;

    @Override
    protected long getDefaultCode() {
        return DEFAULT_CODE;
    }

    public HawSysException() {
    }

    public HawSysException(long code) {
        super(code);
    }

    public HawSysException(long code, Throwable cause) {
        super(code, cause);
    }

    public HawSysException(long code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public HawSysException(String message) {
        super(message);
    }

    public HawSysException(String message, Throwable cause) {
        super(message, cause);
    }

    public HawSysException(Throwable cause) {
        super(cause);
    }
}
