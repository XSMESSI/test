package _2022._01_January.test_0127;

import java.util.TreeSet;

/**
 * @Description TreeSet类：
 * @Author XuShen
 * @Date 2022/1/27 15:42
 */
public class test_03 {
    public static void main(String[] args) {

        /**
         * TreeSet是SortSet接口的实现类，TreeSet可以确保集合元素处于排序状态
         * 特点：唯一，无序（没有按照输入顺序，进行输出）,有序（按照升序进行遍历）
         * 底层是红黑树
         */
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(9);


        System.out.println("nums = " + nums);


        System.out.println(nums.first());
        System.out.println(nums.last());
        //headSet：set集合中在里面的元素之前的集合（小于里面的元素的集合）
        System.out.println(nums.headSet(100));
        System.out.println(nums.headSet(6));

        //subSet（在这个范围之内的元素的集合）
        System.out.println(nums.subSet(-3,4));

    }
}
