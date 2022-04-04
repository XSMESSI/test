package SGG.JavaBase.day_面向对象.day_13.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/15:32
 * @Description:
 */

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Java中的JUnit单元测试
 *
 * 步骤：
 * 1.选中当前工程，右键build path -> add libraries -JUnit4 - 下一步
 * 2，创建Java类，进行单元测试
 *  此时的java类要求，1-此类是public的 2-此类提供公共的无参的构造器
 * 3.此类中声明单元测试方法。
 *      此时的单元测试方法：方法的权限是public，没有返回值，没有形参
 *  4.此单元测试方法上需要声明注解，@Test,并在单元测试类中导入
 *
 *  5.声明好单元测试方法以后，就可以在方法体内测试相关的代码。
 *
 *  6.写完代码以后，左键双击方法名，右键run as JunitTest
 *
 *  说明
 *  1.如果执行结果没有异常，绿条
 *  2.如果执行结果出现异常，红条
 *
 *
 */
public class JUnitTest {

    int number  = 10;

    @Test
    public void testEquals(){
        System.out.println("number = " + number);
        String s1 = "mm";
        String s2 = "mm";
        System.out.println(s1.equals(s2));

        show();
    }

    public void show(){
        number = 20;
        System.out.println(number);
    }

}
