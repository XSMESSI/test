package _2022._012_December;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/26 9:06
 */
public class test_1226_01 {
    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        System.out.println("ids = " + ids);
        ids.add(0,0);
        System.out.println("ids = " + ids);
    }
}
