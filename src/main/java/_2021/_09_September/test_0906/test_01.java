package _2021._09_September.test_0906;

import io.swagger.models.auth.In;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/6 17:20
 */
public class test_01 {
    public static void main(String[] args) {
        //自动装箱
        Integer i = Integer.valueOf(8);

        //自动拆箱
        int a = i.intValue();

        System.out.println(i);

        System.out.println(a);
    }
}
