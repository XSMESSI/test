package _2021._11_November.test_1115;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/11/15 9:27
 */
public class test_01 {
    public static void main(String[] args) {
//        Map<, List<String>> map1 = new HashMap<>();
        TreeMap<Integer,List<String>> map1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }) ;

        map1.put(1, Arrays.asList("one","two","there"));
        map1.put(3,Arrays.asList("梅西","C罗"));
        map1.put(2,Arrays.asList("数学","英语"));
        map1.put(10 ,Arrays.asList("one","two","there"));
        map1.put(9,Arrays.asList("梅西","C罗"));
        map1.put(8,Arrays.asList("数学","英语"));
        map1.put(31, Arrays.asList("one","two","there"));
        map1.put(35,Arrays.asList("梅西","C罗"));
        map1.put(6,Arrays.asList("数学","英语"));
        System.out.println(map1);
//        Iterator<Map.Entry<String,List<String>>> it = map.entrySet().iterator();
//        while (it.hasNext()){
//            Map.Entry<String,List<String>> entry = it.next();
//            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
//        }
    }
}
