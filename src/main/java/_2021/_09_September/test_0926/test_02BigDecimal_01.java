package _2021._09_September.test_0926;

import java.math.BigDecimal;

/**
 * @Description BIgDecimal的使用
 * @Author XuShen
 * @Date 2021/9/26 15:51
 */
public class test_02BigDecimal_01 {
    public static void main(String[] args) {
        /**
         * BIgDecimal所创建的是对象，故我们不能使用传统的+-*'/'算数运算符直接对其对象进行数学运算，而必须调用其相应的方法
         * 方法中的参数也必须是BigDecimal的对象，构造器是类的特殊方法，专门用来创建对象，特别是带有参数的对象
         */
        /**
         * 常用构造函数
         * 1.BigDecimal(int)
         * 创建一个具有参数所指定整数值的对象
         * 2.BigDecimal(double)
         * 创建一个具有参数所指定的双精度值的对象
         * 3.BigDecimal(long)
         * 创建一个具有参数所指定长整数值的对象
         * 4.BigDecimal(String)
         * 创建一个具有参数所指定的以字符串表示的数值的对象
         */
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(0.2);
        BigDecimal c = new BigDecimal(877L);
        BigDecimal d = new BigDecimal("0.3");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
