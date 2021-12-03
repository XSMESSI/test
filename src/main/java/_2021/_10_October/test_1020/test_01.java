package _2021._10_October.test_1020;

import java.util.HashMap;
import java.util.Set;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/20 9:55
 */
public class test_01 {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("name",null);
        map.put("Union","巴黎圣日耳曼");
        map.put("age",36);
        System.out.println("map::"+map);
        System.out.println("entrySet::"+map.entrySet());
        System.out.println("size::"+map.size());
        System.out.println("keySet::"+map.keySet());
        System.out.println("isEmpty()::"+map.isEmpty());
        System.out.println("values::"+map.values());
        System.out.println("clone::"+map.clone());
//        System.out.println(map.compute("C罗","曼联",87));
        System.out.println("containsKey"+map.containsKey("nian"));
        System.out.println("containsValue"+map.containsValue("巴塞罗那"));
        System.out.println("get"+map.get("name"));
//        System.out.println(map.);
        System.out.println("getOrDefault"+map.getOrDefault("年龄","没有这个key值"));
        /**
         * putIfAbsent:
         * 如果对应的name没有对应的值（value=null），使用putIfAbsent可以对“name”进行赋值进行更新，
         * 如果name里面有对应的值，使用putIfAbsent不可以改变name里面的原本的值,使用put可以改变里面的值
         */
        map.putIfAbsent("name","内马尔");
//        map.put("name","莱万托夫斯基");
        System.out.println(map);

        System.out.println("foreach循环：");

//        int i = 0;
        map.forEach(
                (k,v)->{
                    if (k.equals("name")){
                        System.out.println(v);
                    }
//                    System.out.println("foreach:"+"\t"+"key:"+"\t"+k+"\t"+"value:"+"\t"+v);
                }

        );

//        System.out.println(Color.Blue);






    }
}
