package SGG.JavaBase.day_面向对象.day_16.java;

/**
 * @Author: Leo messi
 * @Date: 2022/05/04/18:12
 * @Description:
 */

/**
 * Error：Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源
 * 耗尽等严重情况。比如：StackOverflowError和OOM。
 * 一般不编写针对性的代码进行处理。
 *
 * Exception: 其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。
 */
public class ErrorTest {
    public static void main(String[] args) {
        //1.栈溢出
//        main(args);
        //2.堆溢出
        Integer[] arr = new Integer[1024*1024*1024];

    }
}
