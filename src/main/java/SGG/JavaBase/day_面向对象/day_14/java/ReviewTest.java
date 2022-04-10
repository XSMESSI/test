package SGG.JavaBase.day_面向对象.day_14.java;

import org.junit.Test;

/**
 * @Author: Leo messi
 * @Date: 2022/04/05/9:51
 * @Description:
 */
public class ReviewTest {

    //关于toString()方法
    @Test
    public void test3(){
        String s = "abc";
        s = null;
        System.out.println(s);
        System.out.println("***********");
        System.out.println(s.toString());
    }

    //区别手动写的和自动生成的equals()
    @Test
    public void test2(){
        Person p = new Person("Tom",12);
        Man m = new Man("Tom",12);
        System.out.println(p.equals(m));

    }



    //数组也作为Object子类出现，可以调用Object类中声明的方法
    @Test
    public void test1(){
        int[] arr = new int[]{1,2,3};
        print(arr);

        System.out.println(arr.getClass().getSuperclass());
    }

    public void print(Object obj){
        System.out.println(obj);
    }
}
