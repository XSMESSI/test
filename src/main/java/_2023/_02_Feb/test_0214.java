package _2023._02_Feb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/14 10:59
 */
public class test_0214 {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1,6,2,34,54);
        System.out.println("原始数据:ids = " + ids);
        Collections.sort(ids);
        System.out.println("排序之后:ids = " + ids);
        Collections.reverse(ids);
        System.out.println("反转序列ids = " + ids);
    }
}
