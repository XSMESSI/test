package _2024.FaceTest;

import lombok.Data;

/**
 * @Author Xu Shen
 * @Date 2024/1/31 14:35
 * @Version 1.0
 * @DESC : JAVA的内部类可以分为静态内部类,成员内部类,局部内部类,匿名内部类
 */
@Data
public class Test_02 {

    private static int a;
    private int b;

    //静态内部类:定义在类内部的静态类
    public static class Inner{
        public void print(){
            System.out.println("打印数据" + a);
        }
    }

    //成员内部类:定义在类内部的非静态类
    public class InnerMember{
        public void print(){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

    //局部内部类:定义在方法中的类
    public void test(final int c){
        final int d = 1;
        class Inner{
            public void print(){
                System.out.println("c = " + c);
            }
        }
    }

    //匿名内部类：见Bird
}
