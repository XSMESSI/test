package _2022._01_January.test_0105;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Description Collection
 * @Author XuShen
 * @Date 2022/1/5 9:33
 */
public class test_01 {
    public static void main(String[] args) {
        //创建Collection接口的实现
        Collection collection =new ArrayList<>();
        //添加元素
        collection.add("测试");
        String src = "????";
        collection.add(src);
        System.out.println(collection);


        //创建Collection的实现
        Collection<String> coll = new HashSet<>();
        coll.add("?");
        coll.add("?");
        coll.add("?");
        System.out.println(coll);
        //添加一个集合数据
        collection.addAll(coll);
        //输出集合的长度
        System.out.println(collection);
        //判断是否包含
        System.out.println(collection.contains("?"));
        //移除元素
        collection.remove("?");
        //添加对象
        collection.add(new Person("张三",23,"3000"));
        //当认为两个对象一致,相等时候，需要重写hashCode和equals方法
        System.out.println(collection.contains(new Person("张三",23,"3000")));
        System.out.println("collection = " + collection);

        System.out.println(">>>>>>>>>>");
        collection.add(null);
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("测试");
        collection1.add("??");
        //求两个集合的交集（改变的是collection中的元素）
        System.out.println("collection1 = " + collection1);
        collection.retainAll(collection1);
        System.out.println(collection);
        //清空元素
        collection.clear();
        System.out.println(collection);
        System.out.println("collection1 = 第二次" + collection1);


    }
}
