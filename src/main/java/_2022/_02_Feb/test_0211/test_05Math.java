package _2022._02_Feb.test_0211;

import java.math.BigDecimal;

/**
 * @Description Number和Math类的用法
 * @Author XuShen
 * @Date 2022/2/11 15:31
 */
public class test_05Math {
    public static void main(String[] args) {
        //Java xxxValue();用法
        System.out.println("xxxValue()");
        Number num1 = 20;
        System.out.println("num1.doubleValue() = " + num1.doubleValue());
        System.out.println("num1.floatValue() = " + num1.floatValue());
        System.out.println("num1.intValue() = " + num1.intValue());
        System.out.println("num1.shortValue() = " + num1.shortValue());

        //Java compareTo()用法 指定的数与参数比较（大于返回1，等于返回0，小于返回-1）
        System.out.println("compareTo()用法");
        Integer num2 = 5;
        System.out.println("num2.compareTo(3) = " + num2.compareTo(3));
        System.out.println("num2.compareTo(5) = " + num2.compareTo(5));
        System.out.println("num2.compareTo(10) = " + num2.compareTo(10));

        //Java equals() 方法
        System.out.println("Java equals() 方法");
        Integer x = 5;
        Integer y = 10;
        Integer m = 5;
        Short z = 5;
        System.out.println("x.equals(y) = " + x.equals(y));
        System.out.println("x.equals(m) = " + x.equals(m));
        System.out.println("x.equals(z) = " + x.equals(z));

        //Java valueOf() 方法
        System.out.println("Java valueOf() 方法");
        Integer num31 = Integer.valueOf(9);
        Double num32 = Double.valueOf(5);
        Float num33 = Float.valueOf("80");
        Integer num34 = Integer.valueOf("444",16);//使用16进制
        System.out.println("num31 = " + num31);
        System.out.println("num32 = " + num32);
        System.out.println("num33 = " + num33);
        System.out.println("num34 = " + num34);

        //Java toString() 方法
        System.out.println("Java toString() 方法");
        Integer num4 = 5;
        System.out.println("num4.toString() = " + num4.toString());
        System.out.println("Integer.toString(12) = " + Integer.toString(12));

        //Java parseInt() 方法-转换为整数
        System.out.println("Java parseInt() 方法");
        int num51 = Integer.parseInt("9");
        double num52  = Double.parseDouble("5");
        int num53 = Integer.valueOf("444",16);

        System.out.println("num51 = " + num51);
        System.out.println("num52 = " + num52);
        System.out.println("num53 = " + num53);

        //Java abs() 方法
        System.out.println("Java abs() 方法");
        Integer num61 = -8;
        double num62 = -100;
        float num63 = -90;

        System.out.println("Math.abs(num61) = " + Math.abs(num61));
        System.out.println("Math.abs(num62) = " + Math.abs(num62));
        System.out.println("Math.abs(num63) = " + Math.abs(num63));


    }
}
