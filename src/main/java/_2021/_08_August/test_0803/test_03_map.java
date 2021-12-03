package _2021._08_August.test_0803;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/3 15:37
 */
public class test_03_map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();

        map.put("messi","巴塞罗那");
        map.put("C罗","尤文图斯");
        map.put("德布劳内","曼城");
        map.put("内马尔","大巴黎");
        System.out.println(map.keySet());
    }
}
