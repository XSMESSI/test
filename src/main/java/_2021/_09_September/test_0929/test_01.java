package _2021._09_September.test_0929;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/29 9:35
 */
public class test_01 {
    public static void main(String[] args) {
        String[] arr = {"梅西","内马尔","C罗"};
        List<String> name1 = Arrays.asList(arr);

        String[] arr1 = {"C罗","莱万","德布劳内"};
        List<String> name2  = Arrays.asList(arr1);

        System.out.println(name1.indexOf("C罗"));
        /**
         * Set<Integer> resultSet = new HashSet<>();
         *         resultSet.addAll(yearxs);
         *         resultSet.addAll(yearjs);
         */
        Set<String> result = new HashSet<>();

        StringBuffer nameString = new StringBuffer();
        result.addAll(name1);
        result.addAll(name2);
        System.out.println(result);
        List<String> deptList = new ArrayList<>(result);
        System.out.println(deptList.indexOf("Cluo"));


    }
}
