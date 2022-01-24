package _2022._01_January.test_0124;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Description Set相关方法学习
 * @Author XuShen
 * @Date 2022/1/24 13:31
 */
public class test_01 {
    public static void main(String[] args) {

        /**
         * TreeSet学习：元素有序且唯一
         */
        //TreeSet内部是基于TreeMap实现的，它提供两种排序方式（取决于构造方法）
        /*
        .自然排序
        .根据创建TreeSet时提供的Comparator进行排序
         */
        Set<Integer> set = new TreeSet<>();

        set.add(2);
        set.add(4);
        set.add(1);
        set.add(4);
        set.add(42);
        set.add(33);
        set.add(76);

        System.out.println("set = " + set);

        System.out.println(">>>>>>>>");
        boolean temp = set.add(1);
        System.out.println("第一次添加元素1 " + temp);
        System.out.println("set = " + set);
    }
}
