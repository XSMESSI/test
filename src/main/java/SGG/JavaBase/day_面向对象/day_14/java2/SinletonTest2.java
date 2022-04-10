package SGG.JavaBase.day_面向对象.day_14.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/04/06/21:51
 * @Description:
 */


/***
 * 单例模式的懒汉式实现：
 * 1.
 *
 */
public class SinletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

class Order{
    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类对象，没有初始化
    //4.此对象也必声明为static的
    private static Order instance = null;

    //3.声明public,static的返回当前类对象的方法
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}
