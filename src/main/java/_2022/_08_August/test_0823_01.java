package _2022._08_August;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/23 17:20
 */
public class test_0823_01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("i");
        set.add("g");
        set.add("b");

        set.forEach(o-> System.out.println(o));

        Set<String> tree = new TreeSet<>(set);
        tree.forEach(o-> System.out.println(o));
    }
}
