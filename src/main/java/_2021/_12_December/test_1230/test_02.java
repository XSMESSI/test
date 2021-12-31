package _2021._12_December.test_1230;

import javax.mail.search.SearchTerm;
import java.util.*;

/**
 * @Description frequency
 * @Author XuShen
 * @Date 2021/12/30 19:37
 */
public class test_02 {
    public static void main(String[] args) {
        List<Integer> ids = new ArrayList<>();
        for (int i = 0;i<10;i++){
            ids.add(i);
            ids.add(i+1);
            ids.add(i+2);
        }
        for (Integer id:ids){
            System.out.println("--------"+id+"--------------");
        }
        List<Map<String,Object>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>(ids);
        for (Integer id:set){
            Map<String,Object> map = new HashMap<>();
            map.put("id",id);
            map.put("count",Collections.frequency(ids,id));
            list.add(map);
        }
        System.out.println(list.toString());
    }
}
