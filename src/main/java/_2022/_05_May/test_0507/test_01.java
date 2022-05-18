package _2022._05_May.test_0507;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description ImmutableList
 * @Author XuShen
 * @Date 2022/5/7 14:06
 */
public class test_01 {

    /**
     * 调用Arrays.asList()生产的List的add、remove方法时报异常，
     * 这是由Arrays.asList() 返回的市Arrays的内部类ArrayList，
     * 而不是java.util.ArrayList。Arrays的内部类ArrayList和
     * java.util.ArrayList都是继承AbstractList，remove、add
     * 等方法AbstractList中是默认throw UnsupportedOperationException
     * 而且不作任何操作。java.util.ArrayList重新了这些方法而Arrays的内部类ArrayList没有重新，所以会抛出异常
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = ImmutableList.of("A","B");
        List<String> list1 = new ArrayList<>(list);
        System.out.println("list = " + list);

        try {
            list1.clear();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }finally {

        }
        System.out.println("list1 = " + list1);

    }
}
