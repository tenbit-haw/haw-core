package cn.tenbit.haw.core.constant;

/**
 * @author bangquan.qian
 * @date 2019-10-23 13:13
 */
public interface HawConsts {

    String STRING_EMPTY = "";

    String STRING_SPACE = " ";

    String STRING_CR = "\r";

    String STRING_UL = "_";

    String STRING_LF = System.getProperty("line.separator", "\n");

    String STRING_COMMA = ",";

    String STRING_SHAPE = "#";

    Object[] OBJECT_ARRAY_EMPTY = new Object[0];

    String[] STRING_ARRAY_EMPTY = new String[0];

    Integer[] INTEGER_ARRAY_EMPTY = new Integer[0];

    Long[] LONG_ARRAY_EMPTY = new Long[0];

    int[] INT_PRIMITIVE_ARRAY_EMPTY = new int[0];

    long[] LONG_PRIMITIVE_ARRAY_EMPTY = new long[0];

    String TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    String SUPPRESS_WARNING_UNCHECKED = "unchecked";

    String SUPPRESS_WARNING_RAWTYPE = "rawtype";

    String SUPPRESS_WARNING_DEPRECATION = "deprecation";
}
