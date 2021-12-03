package _2021._07_July.test_0720;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/7/20 16:04
 */

/**
 * /*
 * CoLLections是集合工具类，用来对集合进行操作。
 *  -pubLic static <T> booLean add ALL  ()往集合中添加元素
 *   -pubLic static void shuffLe(List<？> List)打乱顺序：打乱集合顺序
 * */

public class _0720test03Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","f","r","ff","i");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("第一次打乱之后的list"+list);
        Collections.shuffle(list);
        System.out.println("第二次打乱之后的list"+list);

    }
}
