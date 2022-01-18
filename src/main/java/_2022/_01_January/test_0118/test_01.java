package _2022._01_January.test_0118;

import _2022._01_January.test_0105.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 测试集合相关运算
 * @Author XuShen
 * @Date 2022/1/18 9:31
 */
public class test_01 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        //new三个对象，添加到集合中去
        c.add(new Person("A",20,"001"));
        c.add(new Person("B",30,"002"));
        c.add(new Person("C",40,"003"));

        System.out.println("c = " + c);

        /**
         * 遍历方式再学习
         */
        //1、Iterator
        System.out.println(">>>Iterator迭代器遍历>>>");
        Iterator<Object> it = c.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }

        //2.for增强循环遍历
        System.out.println(">>>for增强循环遍历>>>");
        for (Object temp : c){
            System.out.println(temp);
        }






    }
}
