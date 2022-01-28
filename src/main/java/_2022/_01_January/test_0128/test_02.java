package _2022._01_January.test_0128;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description 动态数组的创建
 * @Author XuShen
 * @Date 2022/1/28 11:39
 */
public class test_02 {
    public static void main(String[] args) {
        String[] str = new String[]{"1","2","3","5"};
        ArrayList strList = new ArrayList(Arrays.asList(str));
        ArrayList list = new ArrayList(3);
        list.add("001");
        list.add(001);
        list.add(null);
        list.add(99);
//        System.out.println("ArrayList = " + ArrayList);
        System.out.println("list = " + list);
    }
}
