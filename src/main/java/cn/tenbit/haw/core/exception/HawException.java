package cn.tenbit.haw.core.exception;

/**
 * @author bangquan.qian
 * @date 2019-10-23 16:18
 */
public abstract class HawException extends RuntimeException {
    private static final long serialVersionUID = -4794832496476119011L;

    private long code;

    protected abstract long getDefaultCode();

    public HawException() {
        this.setCode(getDefaultCode());
    }

    public HawException(long code) {
        this.setCode(code);
    }

    public HawException(long code, Throwable cause) {
        this(cause);
        this.setCode(code);
    }

    public HawException(long code, String message, Throwable cause) {
        this(message, cause);
        this.setCode(code);
    }

    public HawException(String message) {
        super(message);
        this.setCode(getDefaultCode());
    }

    public HawException(String message, Throwable cause) {
        super(message, cause);
        this.setCode(getDefaultCode());
    }

    public HawException(Throwable cause) {
        super(cause);
        this.setCode(getDefaultCode());
    }

    public void setCode(long code) {
        this.code = code;
    }

    public long getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return "[" + getCode() + "] " + super.getMessage();
    }
}
