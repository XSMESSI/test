package _2022._01_January.test_0123;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 存储标题数据方法
 * @Auther xuShen
 * @Date 2022-01-23 19:38
 */

public class test_02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("园林艺术",1);
        map.put("医学教研室",0);
        map.put("建筑工程",1);
        map.put("现教中心",1);
        List<String> list = new ArrayList<>(map.keySet());
        System.out.println("list = " + list);
        String[] strings = new String[map.keySet().size()+3];
        strings[0] = "数据来源";
        strings[1] = "表单类型";
        strings[2] = "表单名称";
        for (int i = 3;i< strings.length;i++){
            strings[i] = list.get(i-3);
        }

        for (int i = 0;i< strings.length;i++){
            System.out.println("strings = " + strings[i]);
        }
    }
}
