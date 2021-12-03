package _2021._11_November.test_1115;



import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/16 17:21
 */
public class test_03 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("1","2","3");
        List<String> list2 = Arrays.asList("1","2","3","2","3");
        List<String> list3 = Arrays.asList("1","2");
        List<String> list4 = Arrays.asList("1");
        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list = list.stream().sorted(Comparator.comparing(List::size)).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list);

    }
}
