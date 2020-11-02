package com.hltx.dianhu.tool;

import org.apache.commons.codec.binary.Base64;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/**
 * User: ycj
 * Date: 2020/7/30
 * Time: 14:03
 * Description: 常用加密算法
 */
public class Encription {

    public static byte[] encode2Base64(byte[] bytes) {
        byte[] bts = Base64.encodeBase64(bytes);
        return bts;
    }
    public static byte[] decode2Base64(String str) {
        byte[] bts = Base64.decodeBase64(str);
        return bts;
    }

    public static String md5(String str) {
        try {
            //dataStr = dataStr + slat;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(str.getBytes("UTF8"));
            byte s[] = m.digest();
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    public static byte[] sha1ToBytes(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] bts = digest.digest(str.getBytes());
            return bts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(md5("123456"));
    }
}
