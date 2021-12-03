package _2021._08_August.test_0805;

import io.swagger.models.auth.In;

import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/5 17:24
 */
public class test_02_ListMap {
    public static void main(String[] args) {
        List<Map<Integer,String>> mapList = new ArrayList<Map<Integer, String>>();

        Map<Integer,String> map = new HashMap<Integer, String>();
        String[] str = {"梅西","C罗","德布劳内","武磊","萨拉赫"};

        for (int i = 0;i<0;i++){
            map.put(i,str[i]);
        }

        mapList.add(map);

//        for (Map map1:mapList){
//            System.out.println(map1+" ");
//        }

        for (Map m:mapList){
        Iterator<Map.Entry<Integer,String>> it = m.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entr = it.next();
            System.out.println(entr);
            }
        }
    }
}
