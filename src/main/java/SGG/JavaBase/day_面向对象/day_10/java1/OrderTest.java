package SGG.JavaBase.day_面向对象.day_10.java1;

import SGG.JavaBase.day_面向对象.day_10.Order;

/**
 * @Author: Leo messi
 * @Date: 2022/03/12/16:30
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //出了Order类所属的包之后，私有的结构，缺省声明的结构就不可以调用了
//        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构不可以调用了
//        order.orderPrivate = 3;

//        order.methodDefault();
        order.methodPublic();
        //方法也是一样
    }
}
