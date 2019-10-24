package cn.tenbit.haw.core.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bangquan.qian
 * @date 2019-10-24 14:39
 */
public class HawLogs {

    public static final Log SYS_LOGGER = LogFactory.getLog(HawLogs.class);

    private static final Map<String, Log> LOGGER_MAP = new ConcurrentHashMap<>();

    static {
        LOGGER_MAP.put(getLoggerName(HawLogs.class), SYS_LOGGER);
    }

    public static Log getLogger(Class clz) {
        return getLogger(getLoggerName(clz));
    }

    public static Log getLogger(String name) {
        HawAsserts.notBlank(name);
        Log logger = LOGGER_MAP.get(name);
        if (logger == null) {
            LOGGER_MAP.put(name, logger = LogFactory.getLog(name));
        }
        if (logger == null) {
            logger = SYS_LOGGER;
        }
        return logger;
    }

    private static String getLoggerName(Class clz) {
        HawAsserts.notNull(clz);
        return clz.getCanonicalName();
    }

    public static void info(String name, String msg, Throwable e) {
        getLogger(name).info(msg, e);
    }

    public static void warn(String name, String msg, Throwable e) {
        getLogger(name).warn(msg, e);
    }

    public static void warn(String name, String msg) {
        getLogger(name).warn(msg);
    }

    public static void error(String name, String msg, Throwable e) {
        getLogger(name).error(msg, e);
    }

    public static void error(String name, String msg) {
        getLogger(name).error(msg);
    }

    public static void debug(String name, String msg, Throwable e) {
        getLogger(name).debug(msg, e);
    }

    public static void debug(String name, String msg) {
        getLogger(name).debug(msg);
    }

    public static void trace(String name, String msg, Throwable e) {
        getLogger(name).trace(msg, e);
    }

    public static void trace(String name, String msg) {
        getLogger(name).trace(msg);
    }

    public static void info(Class clz, String msg, Throwable e) {
        getLogger(clz).info(msg, e);
    }

    public static void info(Class clz, String msg) {
        getLogger(clz).info(msg);
    }

    public static void warn(Class clz, String msg, Throwable e) {
        getLogger(clz).warn(msg, e);
    }

    public static void warn(Class clz, String msg) {
        getLogger(clz).warn(msg);
    }

    public static void error(Class clz, String msg, Throwable e) {
        getLogger(clz).error(msg, e);
    }

    public static void error(Class clz, String msg) {
        getLogger(clz).error(msg);
    }

    public static void debug(Class clz, String msg, Throwable e) {
        getLogger(clz).debug(msg, e);
    }

    public static void debug(Class clz, String msg) {
        getLogger(clz).debug(msg);
    }

    public static void trace(Class clz, String msg, Throwable e) {
        getLogger(clz).trace(msg, e);
    }

    public static void trace(Class clz, String msg) {
        getLogger(clz).trace(msg);
    }

}
