package com.originaldreams.serviceregistrycenter.common;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 规定统一的base64加密解密方法
 */
public class MyBase64Utils {
    /**
     * 加密
     * @param str   需要加密的字符串
     * @return  加密后的字符串
     * @throws UnsupportedEncodingException    加密过程中可能抛出的异常
     */
    public static String encode(String str) throws UnsupportedEncodingException {
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encodeBuffer(str.getBytes("utf-8"));
    }

    /**
     * 解密
     * @param str   需要解密的字符串
     * @return  解密后的字符串
     * @throws IOException    解密过程中可能抛出的异常
     */
    public static String decode(String str) throws IOException {
        BASE64Decoder decoder = new BASE64Decoder();
        return new String(decoder.decodeBuffer(str),"utf-8");
    }
}
