package cn.tenbit.haw.core.util;

import cn.tenbit.haw.core.support.HawExecutor;

import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * @author bangquan.qian
 * @date 2019-10-31 19:28
 */
public class HawInetAddress {

    public static int text2Number(final String rawIp) {
        return HawInvokes.invokeWithTurnRe(new HawExecutor<Integer>() {
            public Integer execute() throws Throwable {
                InetAddress address = Inet4Address.getByName(rawIp);
                HawAsserts.notNull(address);
                return bytes2Number(address.getAddress());
            }
        });
    }

    public static byte[] text2Bytes(String rawIp) {
        return number2Bytes(text2Number(rawIp));
    }

    public static String number2Text(int address) {
        return bytes2Text(number2Bytes(address));
    }

    public static byte[] number2Bytes(int address) {
        byte[] addr = new byte[4];
        addr[0] = (byte) ((address >>> 24) & 0xFF);
        addr[1] = (byte) ((address >>> 16) & 0xFF);
        addr[2] = (byte) ((address >>> 8) & 0xFF);
        addr[3] = (byte) (address & 0xFF);
        return addr;
    }

    public static String bytes2Text(byte[] bytes) {
        HawAsserts.isTrue(bytes != null && bytes.length == 4);
        return (bytes[0] & 0xff) + "."
                + (bytes[1] & 0xff) + "."
                + (bytes[2] & 0xff) + "."
                + (bytes[3] & 0xff);
    }

    public static int bytes2Number(byte[] bytes) {
        HawAsserts.isTrue(bytes != null && bytes.length == 4);
        return ((bytes[0] << 24) & 0xff_00_00_00)
                + ((bytes[1] << 16) & 0x00_ff_00_00)
                + ((bytes[2] << 8) & 0x00_00_ff_00)
                + (bytes[3] & 0x00_00_00_ff);
    }
}
