package _2022._011_November;

import common.HttpUtil1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/29 13:52
 */
public class test_1129_02 {
    public static void main(String[] args) {
        String url = "http://172.16.40.5:30870/open_api/authentication/get_access_token?";
        Map<String,String> map = new HashMap<>();
        map.put("key","20221122416515949278914586951685863");
        map.put("secret","102791428ab7a1bb85dbaa9aa8be8bb461a89dfe");
        String data = HttpUtil1.doGet(url,map);
        System.out.println("data = " + data);
    }
}
