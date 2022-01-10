package _2021._07_July.test_0720;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description  LinkedList基本操作
 * @Author XuShen
 * @Date 2021/7/20 14:53
 */
public class _0720test02LinkList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        System.out.println(list.size());

        list.add("My");
        list.add("name");
        list.add("is");
        list.add("messi");

        System.out.println(list.size());
        System.out.println("list = " + list);

        list.set(0,"YOUR");
        list.set(1,"sex");
        list.set(3,"female");
        System.out.println(list.toString());

    }
}
