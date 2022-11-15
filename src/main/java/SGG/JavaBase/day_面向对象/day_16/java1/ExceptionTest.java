package SGG.JavaBase.day_面向对象.day_16.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/05/04/18:21
 * @Description:
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * 一、异常的体系结构
 *
 * java.lang.Throwable
 *          java.lang.Error   一般不编写针对性的代码进行处理
 *          java.lang.Exception :可以进行异常的处理
 *              编译时异常（checked）
 *                  IOException
 *                      FileNotFoundException
 *                      ClassNotFoundException
 *              运行时异常(unchecked)
 *                  NullPointerException
 *                  ArraysIndexOutOfBOundsException
 *                  ClassCastException
 *                  NumberFormatException
 *                  InputMissmatchException
 *                  ArithmeticException
 *
 * 面试题：常见的异常有哪些？举例说明
 *
 */
public class ExceptionTest {

    //************以下是编译时异常**********
    @Test
    public void test7() throws IOException {
        File file = new File("hello.txt");
        FileInputStream fils = new FileInputStream(file);

        int data = fils.read();
        while (data != -1){
            System.out.println((char) data);
            data = fils.read();
        }
        //资源做一个显式的关闭操作
        fils.close();
    }

    //**************以下是运行时异常****************
    @Test
    public void test6(){
        //ArithmeticException
        int a = 10;
        int b = 2;
        System.out.println(10 / 2);
    }

    @Test
    public void test5(){
        //InputMissmatchException
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
    }


    //NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    @Test
    public void test3(){
        //java.lang.ClassCastException
        Object obj = new Date();
        String str = (String) obj;

    }

    @Test
    public void test2(){
        //ArraysIndexOutOfBOundsException
        //java.lang.ArrayIndexOutOfBoundsException
        int[] arr = new int[10];
        System.out.println(arr[10]);

        String str = "abc";
        System.out.println(str.charAt(3));
    }
    //java.lang.NullPointerException
    @Test
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }

}
