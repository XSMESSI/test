package SGG.JavaBase.day_面向对象.day_13.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/13:36
 * @Description:
 */

import java.util.Date;

/**
 * Object类中toString的使用，
 *
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString
 * 2.Object类中的toString的定义；
 *     public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 * 3.像String,Date,File,包装类等都重写了Object类中的toString()方法
 * 。使得在调用对象的toString()方法时，返回“实体对象”信息
 *
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
 * */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());
        System.out.println(cust1);


        String str = new String("MM");
        System.out.println(str);


        Date date = new Date(2223333L);
        System.out.println(date);


    }
}
