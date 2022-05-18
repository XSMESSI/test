package _2022._05_May.test_0510;

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
 * @Description
 * @Author XuShen
 * @Date 2022/5/12 15:57
 */
public class test_03 {
    public static void main(String[] args) throws IOException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String mi="tP7BYSv1v//iKO9u8djQsPOGid597gEapqO5I38nqCaqHj+e4qDRktBdbINDsdKPQwfvdgi/dBXN/oSDjtr3Km7Ol6bWBi8dOG9a1cnoBw46MDkEj3Z10sUcOeD+6pIA7v2ZdY4EENezqcsY8NLjf+pvKxgmhTpnHICfTVRRKzDpsHdmU4/iM6whgyNZAaJBg2XC/aVv8z7mjDq5CLPQpg==";//调用验证接口/mobileapi_ydxy/open/ lapp/verify返回的data
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] encodedKey = decoder.decodeBuffer("hZxcLWDPI0PIZ8lWQXtQCA==");//sk为配置在院校端后台的密钥 // 初始化解密算法
        SecretKeySpec keySpec = new SecretKeySpec(encodedKey, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec); // 使用BASE64先解密，然后用对称密钥再次解密
        String s = new String(cipher.doFinal(decoder.decodeBuffer(mi)),"utf-8");//mi:调用验证接口/mobileapi_ydxy/open/ lapp/verify返回的data
        System.out.println(s);
    }
}
