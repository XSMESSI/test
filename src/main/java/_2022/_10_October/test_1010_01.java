package _2022._10_October;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/10 17:09
 */
public class test_1010_01 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("A",1);
        map.put("A",2);
        System.out.println(map);

        String name = "论文 盛湄.pdf";
        System.out.println(name.indexOf(".pdf"));

        String subStr = name.substring(0,name.indexOf(".pdf"));
        System.out.println("subStr = " + subStr);

    }
}
