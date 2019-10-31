package cn.tenbit.haw.core.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * @author bangquan.qian
 * @date 2019-10-31 11:41
 */
public class HawFastJson implements HawJson {

    @Override
    public String getHawJsonType() {
        return HawJsonConsts.JSON_TYPE_FASTJSON;
    }

    @Override
    public String toJsonString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public <T> T parseJavaObject(String json, Class<T> clz) {
        return JSON.parseObject(json, clz);
    }

    public JSONObject parseJsonObject(String json) {
        return JSON.parseObject(json);
    }

    public String toJsonString(Object obj, SerializerFeature... features) {
        return JSON.toJSONString(obj, features);
    }

    public JSONArray parseJsonArray(String json) {
        return JSON.parseArray(json);
    }

    public <T> List<T> parseJavaList(String json, Class<T> clz) {
        return JSON.parseArray(json, clz);
    }
}
