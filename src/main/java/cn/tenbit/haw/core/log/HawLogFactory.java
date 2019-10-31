package cn.tenbit.haw.core.log;

/**
 * @author bangquan.qian
 * @date 2019-10-31 11:27
 */
public class HawLogFactory {

    public static HawLog getCommonsLogger(Class clz) {
        return new HawCommonsLog(org.apache.commons.logging.LogFactory.getLog(clz));
    }

    public static HawLog getCommonsLogger(String name) {
        return new HawCommonsLog(org.apache.commons.logging.LogFactory.getLog(name));
    }
}
