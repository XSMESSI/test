package SGG.JavaBase.day_面向对象.day_15.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/30/20:54
 * @Description:
 */
/**
 * 接口的使用：
 *
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口，定义接口中的成员
 *
 *      3.1 JDK7及以前；只能定义全局常量和抽象方法
 *              > 全局常量：public abstract final的,但是书写时，可以省略不写
 *              > 抽象方法 ：public abstract 的
 *
 *      3.2 JDK8以前；除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法（略）
 *
 *  4.接口中不能定义构造器，意味着接口不可以实例化；
 *
 *  5.Java开发中，接口都通过让类去实现（implements）的方式去使用,
 *      如果实现类覆盖了接口中的所有的抽象方法，则实现类就可以实例化
 *      如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 *  6.java类可以实现多个接口 -->弥补了Java单继承的局限性
 *          格式：class AA entends BB implements CC,DD,EE
 *  7.接口和接口之间可以继承，而且可以多继承，
 *
 *  ***************************
 *  8.接口的具体的使用，体现多态性
 *  9.接口，实际上可以看做是一种规范
 *
 * 面试题：抽象类和接口有哪些异同？
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();

        Bullet bullet = new Bullet();
    }
}
interface Attackable{

    void attack();
}
interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void fly();

    //省略了public abstract
    void stop();
    //4.接口中不能定义构造器，意味着接口不可以实例化；


//    public Flyable(){
//
//    }

}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{


    @Override
    public void fly() {

    }
}

class Bullet implements Flyable,Attackable{


    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

//***********

interface AA{
    void method1();
}
interface BB{
    void method2();
}

interface CC extends AA,BB{

}

