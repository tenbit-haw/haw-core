package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.json.HawFastJson;
import cn.tenbit.haw.core.json.HawJsonFactory;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * @author bangquan.qian
 * @date 2019-10-23 18:46
 */
public class HawJsons {

    private static final HawFastJson JSON = (HawFastJson) HawJsonFactory.getFastJson();

    public static String toJsonString(Object obj) {
        if (HawObjects.isNull(obj)) {
            return null;
        }
        return JSON.toJsonString(obj);
    }

    public static String toJsonString(Object obj, SerializerFeature... features) {
        if (HawObjects.isNull(obj)) {
            return null;
        }
        return JSON.toJsonString(obj, features);
    }

    public static String toJsonString(Object... objs) {
        if (HawArrays.isEmpty(objs)) {
            return null;
        }
        return JSON.toJsonString(objs);
    }

    public static <T> T parseObject(String json, Class<T> clz) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        HawAsserts.notNull(clz);
        return JSON.parseJavaObject(json, clz);
    }

    public static JSONObject parseObject(String json) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        return JSON.parseJsonObject(json);
    }

    public static JSONArray parseArray(String json) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        return JSON.parseJsonArray(json);
    }

    public static <T> List<T> parseArray(String json, Class<T> clz) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        HawAsserts.notNull(clz);
        return JSON.parseJavaList(json, clz);
    }
}
