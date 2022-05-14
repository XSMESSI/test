package SGG.JavaBase.day_面向对象.day_16.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/16:13
 * @Description:
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常的处理方式二：thorws + 异常类型
 *
 * 1.throws + 异常类型 写在方法的声明处，指明此方法执行时，可能会抛出的异常类型
 *  一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出。
 *  异常代码后续的代码就不再执行。
 * 2.体会：tyr-catch-finally:真正将异常处理掉了，
 *          trows的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉
 *
 * 3.开发中如何选择try-catch-finally,还是使用throws
 *  3.1 如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法也不能使用throws,意味着如果子类重写的方法中
 *          有异常，必须使用try-catch-finally方式处理
 *  3.2 执行的方法中，先后又调用了另外的几个方法，这几个方法时递进关系执行的，我们建议这几个方法使用
 *      throws的方式进行处理，而执行的方法a可以考虑使用try-catch-finally的方式进行处理
 *
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException,IOException {
        File file = new File("hello.txt");
        FileInputStream fils = new FileInputStream(file);

        int data = fils.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fils.read();
        }
        //资源做一个显式的关闭操作
        fils.close();
    }
}
