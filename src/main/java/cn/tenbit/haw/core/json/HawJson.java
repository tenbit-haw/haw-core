package cn.tenbit.haw.core.json;

/**
 * @author bangquan.qian
 * @date 2019-10-31 11:36
 */
public interface HawJson {

    String getHawJsonType();

    String toJsonString(Object obj);

    <T> T parseJavaObject(String json, Class<T> clz);
}
