package SGG.JavaBase.day_面向对象.day_13.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/03/9:24
 * @Description:
 */

/**
 *  Object类是所有Java类的根父类
 *  如果在类的声明中未使用extends关键字指明其父类，则默认父类 为java.lang.Object类
 * 3.Object类中的功能（属性，方法）就具有通用性
 * 属性：无；
 * 方法：equals(),toString(),/getClass() /hashCode() /clone(), finalize()
 *
 * 4.Object类中声明了一个空参的构造器
 *
 *
 *
 * 面试题：
 * final,finally,finalize区别？
 * 没有任何关系：
 *
 */
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order{

}
