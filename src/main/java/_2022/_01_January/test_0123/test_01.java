package _2022._01_January.test_0123;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Auther xuShen
 * @Date 2022-01-23 16:54
 */

public class test_01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"11","22","87"});
        String[] arr = {"数据来源","表单类型","表单名称"};
       String[] strings = new String[list.size()+arr.length];
       strings[0] = "数据来源";
       strings[1] = "表单类型";
       strings[2] = "表单名称";
        for (int i = arr.length;i<strings.length;i++){
            strings[i] = list.get(i- arr.length);
        }
        for (int i = 0;i< strings.length;i++){
            System.out.println("var = " + strings[i]);
        }
     }
}
