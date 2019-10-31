package cn.tenbit.haw.core.json;

/**
 * @author bangquan.qian
 * @date 2019-10-31 18:35
 */
public class HawJsonFactory {

    public static HawJson getFastJson() {
        return new HawFastJson();
    }
}
