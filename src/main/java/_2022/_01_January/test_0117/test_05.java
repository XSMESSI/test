package _2022._01_January.test_0117;

/**
 * @Description 局部变量,实例变量,静态变量----变量分类学习，变量作用域可以了解一下
 * @Author XuShen
 * @Date 2022/1/17 17:27
 */
public class test_05 {

    //静态变量：被声明为静态（static）的变量
    static int m = 100;
    //实例变量（在类中但是在方法外声明并且没有声明为static的变量）
    int data = 50;

    public static void main(String[] args) {
        /**
         * 下面两种对于m的计算输出的结果是不一样的
         */
        m = m+34;
        System.out.println("m = " + m);
        System.out.println("m = " + m+34);


        int a = 9;
        int b = 10;
        System.out.println("sum(a+b) = " + sum(a,b));
    }

    private static int sum(int a,int b) {
        //局部变量：在方法内声明的变量
        int count = 100;
        return count*(a+b);
    }


}
