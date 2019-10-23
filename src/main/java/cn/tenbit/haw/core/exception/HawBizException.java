package cn.tenbit.haw.core.exception;

/**
 * @author bangquan.qian
 * @date 2019-10-23 11:30
 */
public class HawBizException extends HawException {
    private static final long serialVersionUID = 8671451866303580202L;

    public static final long DEFAULT_CODE = HawCodeDefines.BIZ_FAIL;

    @Override
    protected long getDefaultCode() {
        return DEFAULT_CODE;
    }

    public HawBizException() {
    }

    public HawBizException(long code) {
        super(code);
    }

    public HawBizException(long code, Throwable cause) {
        super(code, cause);
    }

    public HawBizException(long code, String message, Throwable cause) {
        super(code, message, cause);
    }

    public HawBizException(String message) {
        super(message);
    }

    public HawBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public HawBizException(Throwable cause) {
        super(cause);
    }
}
