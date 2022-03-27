package SGG.JavaBase.day_面向对象.day_12.java3;

import SGG.JavaBase.day_面向对象.day_12.java2.Order;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/9:49
 * @Description:
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private，缺省，protected权限的属性，方法
    }
}
