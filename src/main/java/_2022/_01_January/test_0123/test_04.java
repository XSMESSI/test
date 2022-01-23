package _2022._01_January.test_0123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Auther xuShen
 * @Date 2022-01-23 20:48
 */

public class test_04 {
    public static void main(String[] args) {
        String[] strings = {"22","33"};
        List<String> result = new ArrayList<>();
        List<String> list = Arrays.asList("1","2");
        result.addAll(list);
        for (int i = 0;i<strings.length;i++){
            result.add(strings[i]);
        }
        System.out.println("result = " + result);
    }
}
