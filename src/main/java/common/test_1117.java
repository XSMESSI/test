package common;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description list集合中根据条件筛选数据
 * @Author XuShen
 * @Date 2021/11/17 9:54
 */
public class test_1117 {

    @Test
    public void test(){
        List<bysmyd> xsList = Arrays.asList(
                new bysmyd(1, "C罗", "意甲", 67.3),
                new bysmyd(0, "梅西", "法甲", 77.3),
                new bysmyd(0, "德布劳内", "英超", 88.3),
                new bysmyd(0, "范戴克", "英超", 77.2),
                new bysmyd(0, "萨拉赫", "英超", 67.3),
                new bysmyd(0, "莱万", "德甲", 77.2),
                new bysmyd(0, null, "德甲", 77.2),
                new bysmyd(0, null, "德甲", 86.2)
        );

        /**
         * 发生问题的原因如下：
         * 调用Arrays.asList()生产的List的add、remove方法时报异常，这是由Arrays.asList() 返回的市Arrays的内部类ArrayList，
         * 而不是java.util.ArrayList。Arrays的内部类ArrayList和java.util.ArrayList都是继承AbstractList，remove、add等
         * 方法AbstractList中是默认throw UnsupportedOperationException而且不作任何操作。
         * java.util.ArrayList重新了这些方法而Arrays的内部类ArrayList没有重新，所以会抛出异常。
         */

        //需要重新构建一个集合
        List<bysmyd> list = new ArrayList(xsList);
        System.out.println("list = " + list);
        list.removeIf(m->(m.getYear().equals(1)));
        System.out.println("list = " + list);
        list.removeIf(m->m.getName() == null);
        System.out.println("list = " + list);
    }
}
