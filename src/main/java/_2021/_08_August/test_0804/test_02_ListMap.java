package _2021._08_August.test_0804;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import javax.swing.text.html.parser.Entity;
import java.util.*;

/**
 * @Description List中嵌套map集合的使用
 * @Author XuShen
 * @Date 2021/8/4 10:14
 */
public class test_02_ListMap {
/*    static List<Map> list = new ArrayList<>();
    static Map<Integer,String> map = new HashMap<Integer, String>();
    static Map<Integer,Integer> ma = new HashMap<Integer, Integer>();*/

    public static void main(String[] args) {

        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();

        Map<String,Object> map = new HashMap<>();

        map.put("sfdk",1);
        map.put("name",2);
        map.put("number",3);

        list.add(map);

        System.out.println(map.get("sfdk").equals(1));
        if (map.get("sfdk").equals(1)){
            System.out.println("是");
        }else if(map.get("sfdk").equals(0)){
            System.out.println("否");
        }






//        for (Map m:list){
//            Iterator<Map.Entry<Integer,Object>> it = m.entrySet().iterator();
//            while (it.hasNext()){
//                Map.Entry<Integer,Object> entry = it.next();
//                System.out.println(entry.getKey()+"----"+entry.getValue());
//            }
//        }

        /*map.put(1,"梅西");
        map.put(2,"C罗");
        map.put(3,"德布劳内");

        ma.put(1,2);
        ma.put(2,3);
        ma.put(3,5);

        list.add(map);
        list.add(ma);

//对Map集合进行遍历
        for (Map m:list){
            Iterator<Map.Entry<Object,Object>> it = m.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<Object,Object> entry = it.next();
                System.out.println(entry.getKey()+"----"+entry.getValue());
            }
        }*/








        /*List<Map<String,Object>> listmap = new ArrayList<>();

        Map<String,Object> map = new HashMap<String,Object>();

        List<Entity> list = new ArrayList<>();

        map.put("list",list);

        listmap.add(map);

        System.out.println(listmap);*/
    }
}
