package _2022._06_June.test_0609;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description List<List<Object>>
 * @Author XuShen
 * @Date 2022/6/9 14:19
 */
public class test_02 {
    public static void main(String[] args) {
        List<List<Object>> lists = new ArrayList<>();
        List<Object> list = new ArrayList<>();
        list.add("leo");
        list.add("1");
        list.add(1);
        lists.add(list);

        List<Object> list1 = new ArrayList<>();
        list1.add("messi");
        list1.add("2");
        list1.add(1);
        lists.add(list1);
        System.out.println("lists = " + lists);

        List<List<Object>> result = lists.stream().filter(o-> !o.toString().contains("leo")).collect(Collectors.toList());
        System.out.println("result = " + result);


    }
}
