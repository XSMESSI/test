package SGG.JavaBase.day_面向对象.day_14.java3;

/**
 * @Author: Leo messi
 * @Date: 2022/04/10/10:53
 * @Description:
 */

/**
 *  * 对属性进行赋值的位置：
 *  * 1.默认初始化
 *  * 2.显式初始化 5.在代码块中赋值
 *  * 3.构造器中初始化
 *  * 4.有了对象以后，可以通过对象.属性或对象.方法的方式进行赋值
 *  *
 *
 *  执行的先后顺序：1 - 2/5 - 3 - 4
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{

    {
        orderId = 4;
    }
    int orderId = 3;

}
