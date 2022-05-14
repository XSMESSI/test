package SGG.JavaBase.day_面向对象.day_16.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/12:46
 * @Description:
 */

import org.junit.Test;

/**
 * try-catch-finally 的finally使用
 *
 * 1.finally是可选的
 * 2.finally声明的是一定会被执行的代码，即使catch中出现异常了.try中有return语句，catch中有return语句等情况
 * 3.像数据库连接，输入输出流，网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的进行资源的释放。此时
 *   的资源的释放，就需要声明在finally中。
 */
public class FinallyTest {


    @Test
    public void testMethod(){
        int num = method();
        System.out.println("num = " + num);
    }

    public int method(){
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }

    @Test
    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
//            return;
        } catch (ArithmeticException e) {
            try {
                int[] arr = new int[10];
                System.out.println(arr[10]);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("我好帅啊");
        }
    }
}
