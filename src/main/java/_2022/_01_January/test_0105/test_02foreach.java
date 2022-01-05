package _2022._01_January.test_0105;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 三种遍历方式
 * @Author XuShen
 * @Date 2022/1/5 10:11
 */
public class test_02foreach {

    @Test
    public void testForeach(){
        Collection<String> collection = new ArrayList<>();
        collection.add("leo");
        collection.add("messi");
        collection.add("Barca");
        //foreach遍历
        collection.forEach(e-> System.out.println(e));
        //可以使用方法引用简写
        collection.forEach(System.out::println);
        collection.iterator().forEachRemaining(System.out::println);
    }
}
