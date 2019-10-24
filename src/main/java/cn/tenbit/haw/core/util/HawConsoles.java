package cn.tenbit.haw.core.util;

import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author bangquan.qian
 * @date 2019-10-23 10:55
 */
public class HawConsoles {

    public static void sout() {
        sout(HawStrings.EMPTY);
    }

    public static void sout(Object obj) {
        sout0(true, obj);
    }

    public static void sout(Object... objs) {
        sout0(false, objs);
    }

    private static void sout0(boolean printFirst, Object... objs) {
        if (HawArrays.isEmpty(objs)) {
            return;
        }
        _sout(getOutTarget(printFirst, objs));
    }

    public static void jsout(Object obj) {
        jsout0(true, obj);
    }

    public static void jsout(Object... objs) {
        jsout0(false, objs);
    }

    private static void jsout0(boolean printFirst, Object... objs) {
        if (HawArrays.isEmpty(objs)) {
            return;
        }
        _sout(HawJsons.toJsonString(getOutTarget(printFirst, objs)));
    }

    public static void jpsout(Object obj) {
        jpsout0(true, obj);
    }

    public static void jpsout(Object... objs) {
        jpsout0(false, objs);
    }

    private static void jpsout0(boolean printFirst, Object... objs) {
        if (HawArrays.isEmpty(objs)) {
            return;
        }
        _sout(HawJsons.toJsonString(getOutTarget(printFirst, objs), SerializerFeature.PrettyFormat));
    }

    private static Object getOutTarget(boolean printFirst, Object[] objs) {
        Object target = objs;
        if (printFirst) {
            target = objs[0];
        }
        return target;
    }

    private static void _sout(Object obj) {
        System.out.println(obj);
    }
}
