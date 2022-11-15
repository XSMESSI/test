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

        //Java ceil() 方法  Java floor() 方法
        // ceil() 方法可对一个数进行上舍入，返回值大于或等于给定的参数的最小整数，类型为双精度浮点型。
        //floor() 方法可对一个数进行下舍入，返回给定参数最大的整数，该整数小于或等给定的参数。
        System.out.println("Java ceil() 方法 Java floor() 方法");
        double num71 = 100.675;
        float num72 = -90;

        System.out.println("Math.ceil(num71) = "+Math.ceil(num71));
        System.out.println("Math.ceil(num72) = "+Math.ceil(num72));

        System.out.println("Math.floor(num71) = " + Math.floor(num71));
        System.out.println("Math.floor(num72) = " + Math.floor(num72));

        //Java rint() 方法 ：返回最接近参数的整数值
        System.out.println("Java rint() 方法");
        double num81 = 100.675;
        double num82 = 100.500;//若存在两个，返回偶数
        double num83 = 100.200;

        System.out.println("Math.rint(num81) = " + Math.rint(num81));
        System.out.println("Math.rint(num82) = " + Math.rint(num82));
        System.out.println("Math.rint(num83) = " + Math.rint(num83));

        //Java round() 方法
        //round() 方法返回一个最接近的 int、long 型值，四舍五入。
        //round 表示"四舍五入"，算法为Math.floor(x+0.5) ，
        // 即将原来的数字加上 0.5 后再向下取整，所以 Math.round(11.5) 的结果为 12，Math.round(-11.5) 的结果为 -11。
        System.out.println("Java round() 方法");
        double num91 = 100.675;
        double num92 = 100.500;
        float num93 = 100;
        float num94 = 90f;

        System.out.println("Math.round(num91) = " + Math.round(num91));
        System.out.println("Math.round(num92) = " + Math.round(num92));
        System.out.println("Math.round(num93) = " + Math.round(num93));
        System.out.println("Math.round(num94) = " + Math.round(num94));

        //Java min() 方法 Java max() 方法
        System.out.println("Java min() 方法 /   Java max() 方法");
        System.out.println("Math.min(12.123,12.456) = " + Math.min(12.123,12.456));
        System.out.println("Math.min(23.12,23.0) = " + Math.min(23.12,23.0));

        System.out.println("Math.max(12.123,12.456) = " + Math.max(12.123,12.456));
        System.out.println("Math.max(23.12,23.0) = " + Math.max(23.12,23.0));


        //Java exp() 方法 exp() 方法用于返回自然数底数e的参数次方。
        System.out.println("Java exp() 方法");
        double num101 = 11.635;
        double num102 = 2.76;
        System.out.printf("e的值为 %.4f%n",Math.E);
        System.out.printf("exp(%.3f) 为%.3f%n",num101,Math.exp(num101));





    }
}
