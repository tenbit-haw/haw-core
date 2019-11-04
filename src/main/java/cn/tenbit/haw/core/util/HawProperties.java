package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.exception.HawExceptions;

import java.io.File;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bangquan.qian
 * @date 2019-10-31 19:13
 */
public class HawProperties {

    private static final String CLASS_PATH_PREFIX = "classpath:";

    public static Properties loadFromPropertiesFile(String path) {
        HawAsserts.isTrue(HawStrings.isNotBlank(path), "path invalid");
        path = HawStrings.trim(path);
        InputStream is = null;
        if (path.startsWith(CLASS_PATH_PREFIX)) {
            path = HawStrings.trim(path.substring(CLASS_PATH_PREFIX.length()));
            is = HawClass.getResourceAsStream(path);
        } else {
            File file = new File(path);
            is = HawFiles.openInputStream(file);
        }
        return load(is);
    }

    public static Properties load(InputStream is) {
        HawAsserts.notNull(is, "stream is null");
        Properties prop = new Properties();
        try {
            prop.load(is);
        } catch (Exception e) {
            throw HawExceptions.ofBiz(e).newOne();
        } finally {
            HawFiles.closeInputStream(is);
        }
        return prop;
    }

    public static String getNotNullProperty(Properties prop, String key) {
        String property = prop.getProperty(key);
        return HawStrings.isBlank(property) ? HawDefaults.STRING_EMPTY : HawStrings.trim(property);
    }
}
