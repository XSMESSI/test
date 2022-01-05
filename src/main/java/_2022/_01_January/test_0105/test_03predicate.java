package _2022._01_January.test_0105;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description predicate操作集合
 * @Author XuShen
 * @Date 2022/1/5 10:30
 */
public class test_03predicate {

    @Test
    public void test01(){
        Collection<Integer> collection = new ArrayList<>();
        //添加0-49
        for (int i = 0;i<50;i++){
            collection.add(i);
        }

        //移除10-49的数字
        collection.removeIf(m->(m>9 && m<50));
        System.out.println(collection);
    }


}
