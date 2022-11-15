package _2022._011_November;

import java.util.Arrays;
import java.util.List;

/**
 * @Description list集合转化为String[]
 * @Author XuShen
 * @Date 2022/11/10 15:50
 */
public class test_1110_01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("new","old");
        String[] arr = list.stream().toArray(String[]::new);
        System.out.println("arr = " + arr);

        String[] arr1 = list.toArray(new String[0]);
        System.out.println("arr1 = " + arr1);


    }
}
