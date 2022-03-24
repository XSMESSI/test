package _2022._03_March.test_0324;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/24 11:48
 */
public class test_02 {
    public static void main(String[] args) {
        //集合的遍历，依次获取集合中的没一个元素
        //Object[] toArray() 把集合转成数组，可以实现集合的遍历
        //创建集合的对象
        Collection c = new ArrayList();
        //添加元素
        c.add("hello");//Object obj = "hello";向上转型
        //Object[] toArray();把集合转成数组，可以实现集合的遍历
        Object[] objs = c.toArray();
        for (int i = 0;i<objs.length;i++){
            String s = (String) objs[i];
            System.out.println(s+"-----"+s.length());
        }



        //迭代器遍历
        Iterator it = c.iterator();// iterator()实际返回的肯定是子类对象，这里是多态
        //判断是否有下一个元素，有就获取，没有就不搭理
        while (it.hasNext()){
            System.out.println(it.next());
            String s = (String)it.next();
            System.out.println("s = " + s);
        }
    }
}
