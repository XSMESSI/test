package sggJavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/28/9:36
 * @Description:
 */


import org.aspectj.weaver.ast.Or;

/**
 * 关于变量的赋值：
 * 如果变量时基本数据类型，此时赋值的时变量所保存的数据值。
 * 如果变量时引用数据类型，此时赋值的时变量所保存的地址值；
 *
 *
 */
public class ValueTransferTest {
    public static void main(String[] args) {


        System.out.println("************基本数据类型****************");
        int m = 10;
        int n = m;
        System.out.println("m = " + m+",  n="+n);


        n  = 20;
        System.out.println("m = " + m+",  n="+n);
        System.out.println("***************引用数据类型**********");

        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;//赋值以后，o1和o2的地址值一样

        System.out.println("o1.orderId = "+o1.orderId+",o2.orderId = "+o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = "+o1.orderId+",o2.orderId = "+o2.orderId);

    }


}

class Order{
    int orderId;
}
