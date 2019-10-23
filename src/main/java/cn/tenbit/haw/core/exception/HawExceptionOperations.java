package cn.tenbit.haw.core.exception;

import cn.tenbit.haw.core.util.HawAsserts;

public class HawExceptionOperations {

    private final HawException e;

    public HawExceptionOperations(HawException e) {
        HawAsserts.notNull(e);
        this.e = e;
    }

    public void makeThrow() {
        throw newOne();
    }

    public HawException newOne() {
        if (e instanceof HawBizException) {
            return new HawBizException(e.getCode(), e.getMessage(), e.getCause());
        }
        return new HawSysException(e.getCode(), e.getMessage(), e.getCause());
    }
}