package _2022._01_January.test_0118;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @Description List接口常用方法
 * @Author XuShen
 * @Date 2022/1/18 10:18
 */
public class test_03 {
    public static void main(String[] args) {
        //replaceAll方法：用来对列表进行一个一一映射，我们需要传入UnaryOperator的实现类，
        // 来规定映射规则。比如我要将列表中的数字变为原来的两倍
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println("list = " + list);
        list.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        });
        System.out.println("list = " + list);
    }
}
