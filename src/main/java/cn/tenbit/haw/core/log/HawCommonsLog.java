package cn.tenbit.haw.core.log;

import cn.tenbit.haw.core.util.HawAsserts;

/**
 * @author bangquan.qian
 * @date 2019-10-31 11:23
 */
public class HawCommonsLog implements HawLog {

    private org.apache.commons.logging.Log log;

    public HawCommonsLog(org.apache.commons.logging.Log log) {
        HawAsserts.notNull(log);
        this.log = log;
    }

    @Override
    public void debug(Object message) {
        log.debug(message);
    }

    @Override
    public void debug(Object message, Throwable t) {
        log.debug(message, t);
    }

    @Override
    public void error(Object message) {
        log.error(message);
    }

    @Override
    public void error(Object message, Throwable t) {
        log.error(message, t);
    }

    @Override
    public void fatal(Object message) {
        log.fatal(message);
    }

    @Override
    public void fatal(Object message, Throwable t) {
        log.fatal(message, t);
    }

    @Override
    public void info(Object message) {
        log.info(message);
    }

    @Override
    public void info(Object message, Throwable t) {
        log.info(message, t);
    }

    @Override
    public void trace(Object message) {
        log.trace(message);
    }

    @Override
    public void trace(Object message, Throwable t) {
        log.trace(message, t);
    }

    @Override
    public void warn(Object message) {
        log.warn(message);
    }

    @Override
    public void warn(Object message, Throwable t) {
        log.warn(message, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    @Override
    public boolean isFatalEnabled() {
        return log.isFatalEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    @Override
    public String getHawLogType() {
        return HawLogConsts.LOG_TYPE_JCL;
    }
}
