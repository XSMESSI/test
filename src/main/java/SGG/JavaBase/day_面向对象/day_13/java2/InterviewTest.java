package SGG.JavaBase.day_面向对象.day_13.java2;

import org.junit.Test;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/17:37
 * @Description:
 */

/**
 * 关于包装类使用的面试题
 */
public class InterviewTest {

    @Test
    public void test1(){
        System.out.println(new Integer(1) );
        //类型的提升
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0
    }

    @Test
    public void test2(){
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.println(o2);//
    }

    @Test
    public void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//false

        //INteger内部定义了IntegerCache结构，IntegerCache中定义了Integer[]
        //保存了-128 ~ 127范围的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128 ~ 127范围内时，就可以直接使用数组中的元素，不用再去new了，目的：提高效率
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;//相当于new 了一个Integer对象
        System.out.println("x = " + x);
        Integer y = 128;//相当于new 了一个Integer对象
        System.out.println(x == y);//false
    }
}
