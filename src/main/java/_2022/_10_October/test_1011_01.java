package _2022._10_October;

import SGG.JavaBase.day_面向对象.day_14.java3.FinalTest;
import common.CommonCalculate.ComCalculate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/11 9:06
 */
public class test_1011_01 {
    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("A","A","C","C","梅西");
        List<String> ergodic = Arrays.asList("d","A");

        Map<String, Integer> map = ComCalculate.countElements(names);
//        System.out.println("map = " + map);

        Map<String,Integer> map2 = ComCalculate.countElements(names,ergodic);
        System.out.println("map2 = " + map2);

        List<Integer> list = Arrays.asList(1,2,3,2,2,2);
        Map<Integer,Integer> map1 = ComCalculate.countElements(list);
//        System.out.println("map1 = " + map1);

        Integer num = Collections.frequency(names,"xu");
        System.out.println("num = " + num);


    }
}
