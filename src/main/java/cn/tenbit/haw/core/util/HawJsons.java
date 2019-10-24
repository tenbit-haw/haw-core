package cn.tenbit.haw.core.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * @author bangquan.qian
 * @date 2019-10-23 18:46
 */
public class HawJsons {

    public static String toJsonString(Object obj) {
        if (HawObjects.isNull(obj)) {
            return null;
        }
        return JSON.toJSONString(obj);
    }

    public static String toJsonString(Object obj, SerializerFeature... features) {
        if (HawObjects.isNull(obj)) {
            return null;
        }
        return JSON.toJSONString(obj, features);
    }

    public static String toJsonString(Object... objs) {
        if (HawArrays.isEmpty(objs)) {
            return null;
        }
        return JSON.toJSONString(objs);
    }

    public static <T> T parseObject(String json, Class<T> clz) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        HawAsserts.notNull(clz);
        return JSON.parseObject(json, clz);
    }

    public static JSONObject parseObject(String json) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        return JSON.parseObject(json);
    }

    public static JSONArray parseArray(String json) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        return JSON.parseArray(json);
    }

    public static <T> List<T> parseArray(String json, Class<T> clz) {
        if (HawStrings.isBlank(json)) {
            return null;
        }
        HawAsserts.notNull(clz);
        return JSON.parseArray(json, clz);
    }
}
