package SGG.JavaBase.day_面向对象.day_12.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/9:44
 * @Description:
 */
public class OrdreTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
