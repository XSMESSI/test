package _2022._02_Feb.test_0207;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import common.mySelf.LeoException;

import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/7 14:11
 */
public class test_02 {
    public static void main(String[] args) throws LeoException {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("ce");
        System.out.println("list = " + list);
        //集合转换为数组   也可以借鉴(搜索后面内容)：集合->对象数组->原始类型数组
        String[] arr = list.toArray(new String[list.size()]);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //list集合排序
        Collections.sort(list);
        System.out.println("list = " + list);

        //Set无序
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("3");
        set.add("2");
        System.out.println("set = " + set);

        //TreeSet
        Set<String> tree = new TreeSet<>();
        tree.add("1");
        tree.add("3");
        tree.add("2");
        tree.add("5");
        tree.add("7");
        tree.add("9");
        System.out.println("tree = " + tree);

//        List<String> list1 = new ArrayList<>();
//        if (CollectionUtils.isEmpty(list1)){
//            throw new LeoException("list1是空--初步使用自定义异常");
//        }
    }
}
