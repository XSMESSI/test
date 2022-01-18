package _2022._01_January.test_0118;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Description ArrayList集合的排序方式
 * @Author XuShen
 * @Date 2022/1/18 9:58
 */
public class test_02 {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(0);
        aList.add(4);
        System.out.println("aList = " + aList);
        /**
         * 方法一：匿名内部类
         */
        aList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("aList = " + aList);

        /**
         * 方法二：创建类来实现
         */
        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(10);
        bList.add(2);
        bList.add(66);
        System.out.println("bList = " + bList);
        ComparatorDemo c = new ComparatorDemo();
        bList.sort(c);
        System.out.println("bList = " + bList);

        /**
         * 方法三：直接将方法作为参数
         */
        ArrayList<Integer> cList = new ArrayList<>();
        cList.add(10);
        cList.add(2);
        cList.add(66);
        System.out.println("cList = " + cList);
        cList.sort((Integer o1,Integer o2)->{return o1-o2;});
        /**
         * 后续可以直接使用下面的方法
         */
//        cList.sort(Comparator.comparingInt((Integer o) -> o));
        System.out.println("cList = " + cList);
    }
}

class ComparatorDemo implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
