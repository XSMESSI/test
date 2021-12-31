package _2021._12_December.test_1231;


import org.apache.poi.ss.formula.functions.T;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 计算规则
 * @Author XuShen
 * @Date 2021/12/31 9:42
 */
public class test_01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1,2,3,3,2,5,7,7,7,4,8,19});
        List<String> listStr = Arrays.asList(new String[]{"A","A","学生","学生","足球","学生","学生","梅西","梅西","梅西"});
        System.out.println("Integer = " + countObject(list));
        System.out.println("String = " + countObject(listStr));
//        Collections.frequency(list,2);
//        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
//        Map<Integer,Integer> map = new HashMap<>();
//        for (Integer var:list1){
//            map.put(var,Collections.frequency(list,var));
//        }
//        Map<Integer,Integer> map1 = new TreeMap<>(Comparator.naturalOrder());
//        map1.putAll(map);
//        System.out.println("map = " + map);
//        System.out.println("map1 = " + map1);
//        System.out.println("sortDescend(map) = " + sortDescend(map));
//
//        System.out.println(Collections.frequency(list,2));
    }

    /**
     * 泛型方法学习
     */

    /**
     * 计算List集合中的不同对象的数量,Map<对象,数量>
     * @param list
     * @return
     */
    public  static <T> Map< T, Integer> countObject(List<T> list){
        List<T> disList = list.stream().distinct().collect(Collectors.toList());
        Map<T,Integer> map = new HashMap<>();
        for (T var:disList){
            map.put(var,Collections.frequency(list,var));
        }
        return map;
    }

    
    public static <K,V extends Comparable<? super V>> Map<K,V> sortDescend(Map<K,V> map){
        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> {
            int compare = (o1.getValue()).compareTo(o2.getValue());
            return -compare;
        });
        Map<K,V> returnMap = new LinkedHashMap<K,V>();
        for (Map.Entry<K,V> entry:list){
            returnMap.put(entry.getKey(),entry.getValue());
        }
        return returnMap;
    }

}
