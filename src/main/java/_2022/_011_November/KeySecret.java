package _2022._011_November;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/29 11:53
 */
@Data
public class KeySecret {

    private String key;

    private String secret;

    public KeySecret(){}

    public KeySecret(String key,String secret){
        this.key = key;
        this.secret = secret;
    }
}
