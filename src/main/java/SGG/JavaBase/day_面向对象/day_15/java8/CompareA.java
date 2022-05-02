package SGG.JavaBase.day_面向对象.day_15.java8;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/22:08
 * @Description:
 */

/**
 * JDK8以前；除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 */
public interface CompareA {

    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }

    //
    default void method3(){
        System.out.println("CompareA:上海");
    }

}
