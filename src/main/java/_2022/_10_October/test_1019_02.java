package _2022._10_October;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/19 11:39
 */
public class test_1019_02 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        System.out.println(map);
        Map<String,String>map1 = Collections.EMPTY_MAP;
        System.out.println(map1);
        System.out.println(MAP);

        List<String> stringList = null;
        boolean va11 = CollectionUtils.isNotEmpty(stringList);
        System.out.println(va11);
        System.out.println(str);

    }
    
    private static Map<String,String> MAP;
    private static String str;
}
