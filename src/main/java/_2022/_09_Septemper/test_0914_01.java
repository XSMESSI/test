package _2022._09_Septemper;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/14 10:05
 */
public class test_0914_01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        list = list.subList(0,3);
        System.out.println(list);


        boolean iseq = Objects.equals(1,1L);
        System.out.println(iseq);
    }
}
