package _2022._06_June.test_0617;

import java.util.*;

/**
 * @Author: Leo messi
 * @Date: 2022/06/22/23:03
 * @Description:
 */
public class test_02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{1+"", String.valueOf(2)});
//        list.get()
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("A");
        set.add("b");
        List<String> list1 = new ArrayList<>(set);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).hashCode());
        }
    }
}
