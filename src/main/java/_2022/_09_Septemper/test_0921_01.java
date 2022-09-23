package _2022._09_Septemper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/21 15:37
 */
public class test_0921_01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(3);
        List<Integer> listSort = list.stream().sorted().collect(Collectors.toList());
        System.out.println(listSort);
        List<Integer> listRevers = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listRevers);

    }
}
