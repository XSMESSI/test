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
 * @Date 2024/3/15 14:23
 * @Version 1.0
 * @DESC : 调用接口获取sso的token
 */
public class WxjtSSOLogin02 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException {
        String accessKey = "access-key-abc";
        String secret = "test-secret-abc@123";
        String identityType = "2";
        String identity = "test";
        String timestamp = "1710483346628";
        String nonce = "nonece-456456489643dd251313";//唯一
        String str = MessageFormat.format("accessKey={0}&identityType={1}&identity={2}&nonce={3}&timestamp={4}"
                ,accessKey,identity,identityType,nonce,timestamp);

        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8),"HmacSHA1"));
        byte[] signData = mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
        String sign = Base64.getEncoder().encodeToString(signData);
        System.out.println("签名结果 sign = " + sign);
    }
}
