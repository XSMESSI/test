package common.CommonCalculate;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description 公用计算方法
 * @Author XuShen
 * @Date 2021/12/31 10:52
 */
public class ComCalculate {
    /**
     * 存储list集合中的不同对象的数量 Map<对象,数量>
     * 也可以提供数组，存储数组中的变量在list集合中的个数
     * LinkedHashMap:按照数组的顺序存储K值
     * @param list
     * @param arr
     * @param <T>
     * @return
     */
    public  static <T> Map< T, Integer> countObject(List<T> list,T[] arr){
        Map<T,Integer> map = new LinkedHashMap<>();
        if (arr == null){
            List<T> disList = list.stream().distinct().collect(Collectors.toList());
            for (T var:disList){
                map.put(var, Collections.frequency(list,var));
            }
        }else{
            for (T var:arr){
                map.put(var,list.contains(var)?Collections.frequency(list,var):0);
            }
        }
        return map;
    }

    /**
     * Map<key1,Map<key2,Integer>对应的两个键值的数量
     * @param list
     * @param type
     * @param classes
     * @return
     */
    public static  Map< String,Map<String,Integer>> countTwokey(List<Prize> list,String[] type,String[] classes){
        Map<String,Map<String, Integer>> map = new LinkedHashMap<>();
        Map<String,List<Prize>> groupMap = list.stream().collect(Collectors.groupingBy(Prize::getType));
        for (String varT : type){
            Map<String,Integer> mapC = new LinkedHashMap<>();
            List<Prize> temp = groupMap.get(varT);
            List<String> listC = new ArrayList<>();
            for (String varC : classes){
                if (CollectionUtils.isNotEmpty(temp)){
                    listC = temp.stream().map(Prize::getClasses).collect(Collectors.toList());
                }
                mapC.put(varC,Collections.frequency(listC,varC));
                map.put(varT,mapC);
            }
        }
        return map;
    }

    /**
     * map根据value值进行排序
     * @param map
     * @param flag 0:降序,1:升序
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K,V extends Comparable<? super V>> Map<K,V> sortMapByValue(Map<K,V> map,Integer flag){
        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
        if (flag.equals(0)){
            Collections.sort(list, (o1, o2) -> {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            });
        }else if(flag.equals(1)){
            Collections.sort(list, (o1, o2) -> {
                int compare = (o2.getValue()).compareTo(o1.getValue());
                return -compare;
            });
        }
        Map<K,V> returnMap = new LinkedHashMap<K,V>();
        for (Map.Entry<K,V> entry:list){
            returnMap.put(entry.getKey(),entry.getValue());
        }
        return returnMap;
    }
}

