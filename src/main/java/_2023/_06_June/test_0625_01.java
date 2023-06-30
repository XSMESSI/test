package _2023._06_June;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/6/25 11:18
 */

public class test_0625_01 {
    public static void main(String[] args) {
        List<String> grades = Arrays.asList("A","B","C","D");
        int index = grades.indexOf("C");
        System.out.println(grades.subList(0,index));//A,B(以上)
        System.out.println(grades.subList(0,index + 1));//A,B,C(及以上)
        System.out.println(grades.subList(index,grades.size()));//C,D(及以下)
        System.out.println(grades.subList(index + 1,grades.size()));//D(以下)
    }
}
