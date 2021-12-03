package _2021._10_October.test_1011;

import org.apache.commons.lang3.ArchUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Description 集合，对象数组，原始类型（primitive）数组互相转换的工具类
 * @Author XuShen
 * @Date 2021/10/11 14:44
 */
public class test_03Collection {
    public static void main(String[] args) {
        /**
         * 集合->对象数组->原始类型数组
         */
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        Integer[] integers = integerList.toArray(new Integer[integerList.size()]);
        int[] ints = ArrayUtils.toPrimitive(integers);
        for (int i = 0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

        /**
         * 原始类型数组->对象数组->集合
         */
        int[] ints1 = {2};
        Integer[] integers1 = ArrayUtils.toObject(ints1);
        List<Integer> integerList1 = new ArrayList<Integer>();
        System.out.println(Collections.addAll(integerList1,integers1));
        System.out.println(integerList1);

    }
}
