package _2024._03_March;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.util.Base64;

/**
 * @Author Xu Shen
 * @Date 2024/3/15 14:11
 * @Version 1.0
 * @DESC : 根据算法获取签名结果
 */
public class WxjsSSOLogin {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        String loginType = "2";
        String loginName ="test";
        String successURL = "http://124.223.201.235/evatea/cqjy/#/custom-form-tool/double-base-login";
        String timestamp = "1710483346628";
        String secret = "est-secret-abc@123";//私钥
        String str = MessageFormat.format("loginName={0}&loginType={1}&successURL={2}&timestamp={3}",
                loginName,loginType,successURL,timestamp);
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8),"HmacSHA1"));
        byte[] signData = mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
        String sign = Base64.getEncoder().encodeToString(signData);
        System.out.println("sign = " + sign);
    }
}
