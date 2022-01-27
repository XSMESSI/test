package _2022._01_January.test_0127;

import org.junit.Test;

import java.util.*;

/**
 * @Description Map再学习
 * @Author XuShen
 * @Date 2022/1/27 17:06
 */
public class test_08 {

    @Test
    public void testHashMap(){
        /**
         * Hashtable：旧版。线程安全的，它的key和value不能为null.
         * HashMap:相对Hashtable它来说新一点，线程不安全，它允许key和value为null值
         */
        //元素完全无序
        Map map = new HashMap();//完全无序
        map.put("重庆","火锅");
        map.put("兰州","拉面");
        map.put("柳州","螺蛳粉");
        Set entrySet = map.entrySet();
        for (Object entry:entrySet){
            System.out.println(entry);
        }

        System.out.println(">>>>>testHashMap>>>End>>>");
    }

    @Test
    public void testLinkedHashMap(){
        /**
         * LinkedHashMap是HashMap的子类，比Hash多维护了映射关系的添加顺序
         */
        Map map = new LinkedHashMap();
        map.put("重庆","火锅");
        map.put("兰州","拉面");
        map.put("柳州","螺蛳粉");
        Set entrySet = map.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }

        System.out.println(">>>>>testLinkedHashMap>>End>>>>>>.");
    }

    @Test
    public void testProperties(){
        /**
         * Properties是Hashtable的子类，不允许key和value是null,并且它的key和value的类型都只能是String.通常用于存储配置属性。
         * 而且为了可读性更好，还增加了两个方法：
         * setProperty(key,value)
         * String getProperty(key)
         */

        Properties pro = System.getProperties();//获取系统属性
        System.out.println(pro);
        Set entrySet = pro.entrySet();
        for (Object entry : entrySet){
            System.out.println(entry);
        }
    }


}
