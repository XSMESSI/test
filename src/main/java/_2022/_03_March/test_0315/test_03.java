package _2022._03_March.test_0315;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/15 20:44
 */
//public class test_03 {
//}
/*
涉及继承：
a.初始化父类中的静态成员变量和静态代码块
b.初始化子类中的静态成员变量和静态代码块
c.初始化父类的普通成员变量和构造代码块(按次序)，再执行父类的构造方法
d.初始化子类的普通成员变量和构造代码块(按次序)，再执行子类的构造方法
*/
class X {
    {System.out.println("1");}

    Y y=new Y();

    public X(){
        System.out.println("X");
    }

    {System.out.println("2");}
}
class Y{
    public Y(){
        System.out.println("Y");
    }
}
class Z extends X {
    {System.out.println("3");}
    Y y=new Y();
    public Z() {
        System.out.println("Z");
    }
    {System.out.println("4");}
    public static void main(String[] args) {
        new Z();
    }
}
