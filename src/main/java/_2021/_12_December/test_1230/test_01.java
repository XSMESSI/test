package _2021._12_December.test_1230;

import org.apache.commons.collections4.list.TreeList;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description 计算List集合中元素的个数,list集合Integer,String 排序
 * @Author XuShen
 * @Date 2021/12/30 17:44
 */
public class test_01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1,23,1,3,4,99,4,4,5,2,5,7,7,7,7});
        Map<Integer,Integer> map = getMapCount(list);
        /**
         * 把map根据key值由大到小进行排序
         */
        Map<Integer,Integer> map1 = new TreeMap<>(Comparator.reverseOrder());
        /**
         * 把map根据key值由小到大进行排序
         */
        Map<Integer,Integer> map2 = new TreeMap<>(Comparator.naturalOrder());

        map1.putAll(map);
        map2.putAll(map);
        System.out.println("没有排序map = " + map);
        System.out.println("key值由大到小排序map1 = " + map1);
        System.out.println("key值由小到大排序map2 = " + map2);

        System.out.println(">>>>>>>>>>>>");
        System.out.println("最初>>list = " + list);
        list = list.stream().sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList());
        System.out.println("递增>>list = " + list);
        Collections.reverse(list);
        System.out.println("递减>>list = " + list);

        List<String> strings = Arrays.asList(new String[]{"徐慎","梅西","德布劳内"});
        System.out.println("最初>>strings = " + strings);
        strings = strings.stream().sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList());
        System.out.println("递增>>strings = " + strings);
        Collections.reverse(strings);
        System.out.println("递减>>strings = " + strings);
    }

    private static Map<Integer,Integer> getMapCount(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer var : list){
            Integer count = map.get(var);
            map.put(var,(count == null) ? 1 : count+1);
        }
        return map;
    }

}
