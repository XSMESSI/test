package _2022._05_May.test_0510;

import com.alibaba.fastjson.JSON;
import sun.misc.BASE64Decoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * @Description 福建卫院的登录人数据解密
 * @Author XuShen
 * @Date 2022/5/11 17:49
 */
public class test_02 {

    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String mi="t9flPzMBKKRRGwTQstwaO9hIQW/OVSLBFIqyPndUUvguOcqRy4wBpEEy2keaa04lGVG3LcT6jAvjmtiICaGncKLQOGm/bDR2A6r1S/YN5VhgHaFxQwHUN7A9PrHzGnsCrjrruXc387FZtzgMngMV1A==";//调用验证接口/mobileapi_ydxy/open/ lapp/verify返回的data
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] encodedKey = decoder.decodeBuffer("hZxcLWDPI0PIZ8lWQXtQCA==");//sk为配置在院校端后台的密钥 // 初始化解密算法
        SecretKeySpec keySpec = new SecretKeySpec(encodedKey, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec); // 使用BASE64先解密，然后用对称密钥再次解密
        String s = new String(cipher.doFinal(decoder.decodeBuffer(mi)),"utf-8");//mi:调用验证接口/mobileapi_ydxy/open/ lapp/verify返回的data
        UserInfo userInfo = JSON.parseObject(s, UserInfo.class);
        System.out.println(s);
        System.out.println("userInfo.getUserId() = " + userInfo.getUserId());
        System.out.println("userInfo.getSessionKey() = " + userInfo.getSessionKey());
        System.out.println("userInfo.getXxdm() = " + userInfo.getXxdm());
        System.out.println("userInfo.getUserType() = " + userInfo.getUserType());
    }
}
