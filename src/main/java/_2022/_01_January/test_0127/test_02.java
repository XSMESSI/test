package _2022._01_January.test_0127;

import java.util.LinkedHashSet;

/**
 * @Description LinkedHashSet
 * @Author XuShen
 * @Date 2022/1/27 15:17
 */
public class test_02 {
    public static void main(String[] args) {

        /**
         * LinkedHashSet是HashSet的子类，LinkedHashSet需要维护元素的插入顺序，因此性能略低于HashSet性能，但在迭代访问Set里的
         * 全部元素时将有很好的性能；
         *
         * 底层也是哈希表+链表来实现的
         * 特点：唯一，有序（按照输入顺序进行输出）
         */
        LinkedHashSet books = new LinkedHashSet();
        books.add("英语");
        books.add("数学");
        books.add("物理");
        System.out.println("books = " + books);

        books.remove("英语");
        System.out.println("books = " + books);
        books.add("英语");
        System.out.println("books = " + books);
    }
}
