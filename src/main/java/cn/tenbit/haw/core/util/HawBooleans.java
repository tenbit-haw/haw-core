package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.constant.HawBoolEnums;
import cn.tenbit.haw.core.exception.HawExceptions;

/**
 * @Author bangquan.qian
 * @Date 2019-07-17 16:22
 */
public class HawBooleans {

    public static boolean isTrue(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static boolean isNotTrue(Boolean bool) {
        return !isTrue(bool);
    }

    public static boolean isFalse(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean isNotFalse(Boolean bool) {
        return !isFalse(bool);
    }

    public static Boolean toBoolean(Integer val) {
        return val == null ? null : getBoolEnums(val).getBoolVal();
    }

    public static Integer toInteger(Boolean val) {
        return val == null ? null : getBoolEnums(val).getIntVal();
    }

    public static boolean toPrimitiveBool(Integer val) {
        return getBoolEnums(val).getBoolVal();
    }

    public static int toPrimitiveInt(Boolean val) {
        return getBoolEnums(val).getIntVal();
    }

    public static boolean toPrimitiveBool(int val) {
        return getBoolEnums(val).getBoolVal();
    }

    public static int toPrimitiveInt(boolean val) {
        return getBoolEnums(val).getIntVal();
    }

    public static HawBoolEnums getBoolEnums(Boolean val) {
        HawAsserts.notNull(val);
        return getBoolEnums(val.booleanValue());
    }

    public static HawBoolEnums getBoolEnums(Integer val) {
        HawAsserts.notNull(val);
        return getBoolEnums(val.intValue());
    }

    public static HawBoolEnums getBoolEnums(boolean val) {
        return val ? getTrueBoolEnums() : getFalseBoolEnums();
    }

    public static HawBoolEnums getBoolEnums(int val) {
        if (val == getTrueBoolEnums().getIntVal()) {
            return getTrueBoolEnums();
        }
        if (val == getFalseBoolEnums().getIntVal()) {
            return getFalseBoolEnums();
        }
        throw HawExceptions.UNSUPPORTED.newOne();
    }

    public static HawBoolEnums getBoolEnumsByChinese(String val) {
        String trim = HawStrings.trim(val);
        if (getTrueBoolEnums().getChineseVal().equals(trim)) {
            return getTrueBoolEnums();
        }
        if (getFalseBoolEnums().getChineseVal().equals(trim)) {
            return getFalseBoolEnums();
        }
        throw HawExceptions.UNSUPPORTED.newOne();
    }

    public static HawBoolEnums getBoolEnumsByEnglish(String val) {
        String trim = HawStrings.trim(val);
        if (getTrueBoolEnums().getEnglishVal().equals(trim)) {
            return getTrueBoolEnums();
        }
        if (getFalseBoolEnums().getEnglishVal().equals(trim)) {
            return getFalseBoolEnums();
        }
        throw HawExceptions.UNSUPPORTED.newOne();
    }

    public static HawBoolEnums getFalseBoolEnums() {
        return HawBoolEnums.FALSE;
    }

    public static HawBoolEnums getTrueBoolEnums() {
        return HawBoolEnums.TRUE;
    }
}
