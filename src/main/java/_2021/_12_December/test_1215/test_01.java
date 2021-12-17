package _2021._12_December.test_1215;

import common.bysmyd;
import springfox.documentation.service.ApiListing;

import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/15 9:09
 */
public class test_01 {
    public static void main(String[] args) {
        Map<List<String>,Integer> map = new HashMap<>();
        List<String> list1 = Arrays.asList(new String[]{"1","one"});
        List<String> list2 = Arrays.asList(new String[]{"2","two"});
        List<String> list3 = Arrays.asList(new String[]{"3","three"});
        map.put(list1,1);
        map.put(list2,2);
        map.put(list3,3);
        Set<List<String>> set1 = map.keySet();
        /**
         * 获取map集合的相关元素
         */
        for (List<String> var:set1){
            System.out.println(var+":"+map.get(var));
            String key1 = var.get(0);
            System.out.println("key1 = " + key1);
            String key2 = var.get(1);
            System.out.println("key2 = " + key2);
        }
//        System.out.println("key1 = " + key1);


        /**
         * map集合的迭代
         */
        Iterator<Map.Entry<List<String>,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<List<String>,Integer> entity = it.next();
            System.out.println("key = " + entity.getKey()+"\t"+"value= "+entity.getValue());
        }



    }
}
