package sggJavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/28/10:26
 * @Description:
 */

/**
 * 方法形参的传递机制：值传递
 *
 * 1.形参：方法定义时，声明的小括号内的参数
 *      实参：方法调用时，实际传递给形参的数据
 * 2.值传递机制：
 * 如果参数时基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 * 如果参数是引用数据类型，此时实参赋值给形参的是实参存储数据的地址值；
 *
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m = " + m+",  n="+n);
        //交换两个变量的值：
//        int temp = m;
//        m = n;
//        n = temp;

        ValueTransferTest1 test = new ValueTransferTest1();
        test.swap(m,n);
        test.swap(m,n);





    }

    //交换两个变量值的方法
    public void swap(int m,int n){
        //交换两个变量的值：
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m+",  n="+n);
    }
}
