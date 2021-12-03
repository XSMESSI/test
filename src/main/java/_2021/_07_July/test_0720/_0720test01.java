package _2021._07_July.test_0720;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description Iterator接口的使用
 * @Author XuShen
 * @Date 2021/7/20 9:33
 */
public class _0720test01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("abc0");
        list1.add("abc1");
        list1.add("abc2");

        // while循环方式遍历
        Iterator it1 = list1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // for循环方式遍历
        for (Iterator a = list1.iterator(); a.hasNext(); ) {
            System.out.println(a.next());
        }

    }
}

