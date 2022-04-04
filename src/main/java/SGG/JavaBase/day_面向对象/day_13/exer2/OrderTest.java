package SGG.JavaBase.day_面向对象.day_13.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/10:02
 * @Description:
 */

import org.aspectj.weaver.ast.Or;

import java.util.Objects;

/**
 * 编写Order类，有int型的orderId，String型的orderName，相应的
 * getter()和setter()方法，两个参数的构造器，重写父类的equals()方法：
 * public boolean equals(Object obj)，并判断测试类中创建的两个对象是否
 * 相等。
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"Aa");
        Order order2 = new Order(1001,"Bb");
        System.out.println(order1.equals(order2));

        Order order3 = new Order(1001,"Bb");
        System.out.println(order2.equals(order3));

        String aa = "aa";
        String bb = "aa";
        System.out.println(aa == bb);
    }
}

class Order{
    private int orderId;

    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderId, String orderName) {
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj instanceof Order){
            Order order = (Order) obj;
            //正确的
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
            //错误的：涉及到引用数据类型，使用equals
//            return this.orderId == order.orderId && this.orderName.==(order.orderName);
        }
        return false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Order order = (Order) o;
//        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}
