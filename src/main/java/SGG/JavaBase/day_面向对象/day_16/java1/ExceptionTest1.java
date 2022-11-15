package SGG.JavaBase.day_面向对象.day_16.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/12:13
 * @Description:
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常的处理：抓抛模型
 *
 * 过程一：“抛”  ：程序在正常执行过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，
 *              并将此对象抛出。
 *              一旦抛出对象以后，其后的代码就不再执行。
 *
 *           关于异常对象的产生，1.系统自动生成的异常对象
 *                          2.手动的生成一个异常对象，并抛出（throws）
 *
 *
 * 过程二：“抓” :可以理解为异常的处理方式：1.try-catch-finally   2.throws
 *
 * 二、try-catch-finally的使用
 *
 * try{
 *     //可能出现异常的代码
 * }catch（异常类型1 变量名1）{
 *     //处理异常的方式1
 * }catch（异常类型2 变量名2）{
 *     //处理异常的方式2
 * }catch（异常类型3 变量名3）{
 *     //处理异常的方式3
 * }catch（异常类型4 变量名4）{
 *     //处理异常的方式4
 * }
 * ...
 * finally{
 *     //一定会执行的代码
 * }
 *
 *
 * 说明：
 * 1.finally是可选的
 * 2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象
 *  的类型，去catch中进行匹配
 * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦处理完成，就跳出当前的try-catch结构（在没有写finally的情况下。。
 *  继续执行其后的代码
 * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
 *  catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面，否则报错。
 * 5.常用的异常对象处理方式，1.String getMessage 2.e.printStackTrace();
 * 6.在try结构中声明的变量，再出了try结构之后，就不能在被调用
 * 7.try-catch-finally操作也可以进行嵌套.
 *
 * 体会1：使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是在运行时报错，
 *      相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
   体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了，
        针对于编译时异常，我们说一定要考虑异常的处理
 */
public class ExceptionTest1 {

    @Test
    public void test7() throws IOException {
        FileInputStream fils = null;
        try {
            File file = new File("hello.txt");
            fils = new FileInputStream(file);

            int data = fils.read();
            while (data != -1){
                System.out.println((char) data);
                data = fils.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(1);
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(2);
            e.printStackTrace();
        }finally {
            System.out.println(3);
            try {
                System.out.println(4);
                if (fils != null){
                    fils.close();
                }
            } catch (IOException e) {
                System.out.println(5);
                e.printStackTrace();
            }
        }
    }



    @Test
    public void etst1(){
        String str = "123";
        str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("hell0 --1");
        } catch (NumberFormatException e) {
            System.out.println("出现数值转换类型异常");
            //getMessage
            System.out.println(e.getMessage());
            //printStackTrace()
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("出现异常");
        }

//        System.out.println(num);

        System.out.println("hell0 --2");
    }
}
