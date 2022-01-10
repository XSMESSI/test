package _2021._07_July.test_0720;

/**
 * @Description List 集合测试
 * @Author XuShen
 * @Date 2021/7/20 14:14
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合类的长度可变，便于开发使用
 * Collection 和Map是顶层接口
 *Collection主要有三个子接口，分别为List(列表)、Set(集)、Queue(队列)。其中，List、Queue中的元素有序可重复，而Set中的元素无序不可重复。
 * List中主要有ArrayList、LinkedList两个实现类；Set中则是有HashSet实现类；而Queue是在JDK1.5后才出现的新集合，主要以数组和链表两种形式存在。
 *
 * ArrayList;
 *
 */
public class _0720test02ArraList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("ArrayList初始化集合容量="+list.size());

        //添加功能：
        list.add("Leo ");
        list.add("Messi");
        list.add(2,"!");
        list.add(2,"!");
        list.add(2,"!");

        System.out.println("ArrayList当前容量"+list.size());
        System.out.println("list = " + list);
        //集合转换为字符串形式
        String str1 = list.toString().substring(0,1);
        System.out.println("str1 = " + str1);
        System.out.println(list.toString());

        //修改功能：
        list.set(0,"Xu ");
        list.set(1,"Shen");
        System.out.println("修改之后:ArrayList当前内容："+list.toString());
        System.out.println("list.isEmpty = " + list.isEmpty());

        //获取功能：
        String list_0 = list.get(0);
        System.out.println("list_0 = " + list_0);

        //迭代器遍历集合：
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("迭代器遍历"+next);
        }
        for (int i= 0;i<5;i++){
            System.out.println("··········");
        }
        //for循环
        //for(数据类型 每个变量：循环对象)
        for (String str:list){
            System.out.println("for循环遍历"+str);
        }

        //判断功能
        boolean isempty= list.isEmpty();
        boolean isContains = list.contains("Cluo");
        System.out.println("isempty = " + isempty);
        System.out.println("isContains = " + isContains);

        int size = list.size();
        System.out.println(size);


        list.clear();
        System.out.println("清除list集合");
        System.out.println("list = " + list);
        System.out.println(list.size());



    }
}
