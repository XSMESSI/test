package _2021._12_December.test_1231;

import common.CommonCalculate.ComCalculate;

import java.util.*;

/**
 * @Description 测试类计算出公用方法计算结果数据
 * @Author XuShen
 * @Date 2021/12/31 10:50
 */
public class test_02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,2,2,2,3,3,3,3,4,2,5,5,5,3,3,3});
        Integer[] arr;
        arr = new Integer[]{1,2,5,6,7,8,9,10,3,4};
        System.out.println("list = " + ComCalculate.countObject(list,arr));
        Map<Integer,Integer> map1 = ComCalculate.countObject(list,arr);
        System.out.println(ComCalculate.sortMapByValue(map1,0));
        System.out.println(ComCalculate.sortMapByValue(map1,1));

        String[] arr1 = new String[]{"A","B","学生","足球","梅西"};
        List<String> listStr = Arrays.asList(new String[]{"A","A","学生","学生","足球","学生","学生","梅西","梅西","梅西"});
        System.out.println("listStr = " + ComCalculate.countObject(listStr,null));
        Map<String,Integer> map = ComCalculate.countObject(listStr,null);

        System.out.println(ComCalculate.sortMapByValue(map,0));
        System.out.println(ComCalculate.sortMapByValue(map,1));
    }
}
