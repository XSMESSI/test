package _2024._01_January;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2024/1/30 16:12
 * @Version 1.0
 * @DESC : 查找集合的最后一个元素
 */
public class test_0130 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        // 方法一：使用get()方法
        String lastElement1 = list.get(list.size() - 1);
        System.out.println("Method 1 - Last Element: " + lastElement1);
        // 方法二：使用Java 8的stream API
        String lastElement2 = list.stream().reduce((first, second) -> second).orElse(null);
        System.out.println("Method 2 - Last Element: " + lastElement2);
        // 方法三：使用Collections工具类
        String lastElement3 = Collections.max(list);
        System.out.println("Method 3 - Last Element: " + lastElement3);

        String firstElement = Collections.min(list);
        System.out.println("firstElement = " + firstElement);
    }
}
