package _2021._09_September.test_0926;

import java.math.BigDecimal;

/**
 * @Description BigDecimal的使用2-常用方法
 * @Author XuShen
 * @Date 2021/9/26 16:10
 */
public class test_03BIgDecimal_02 {
    public static void main(String[] args) {
        /**
         * BigDecimal常用方法：
         * 1.add(BigDecimal)
         * BigDecimal对象总的值相加，返回BIgDecimal对象
         * 2.subtract(BigDecimal)
         * BigDecimal对象中的值相减，返回BIgDecimal对象
         * 3.multiply(BigDecimal)
         * BIgDecimal对象中的值相乘，返回BigDecimal对象
         * 4.divide(BigDecimal)
         * BIgDecimal对象中的值相除，返回BigDecimal对象
         * 5.toString
         * 将BigDecimal对象中的值转换为字符串
         * 6.doubleValue()
         * 将BigDecimal对象中的值转换为双精度数
         * 7.floatValue()
         * 将BigDecimal对象中值转换为单精度数
         * 8.longValue()
         * 将BIgDecimal对象中的值转换为长整数
         * 9.intValue()
         * 将BIgDecimal对象中的值转换为整数
         */
        BigDecimal a = BigDecimal.valueOf(30);
        BigDecimal b = BigDecimal.valueOf(6);

        BigDecimal addResult = a.add(b);
        System.out.println(a+"+"+b+"结果是："+addResult);

        BigDecimal subtractResult = a.subtract(b);
        System.out.println(a+"-"+b+"结果是："+subtractResult);

        BigDecimal multiplyResult = a.multiply(b);
        System.out.println(a+"*"+b+"结果是："+multiplyResult);

        BigDecimal divideResult = a.divide(b);
        System.out.println(a+"/"+b+"结果是："+divideResult);

        BigDecimal doubleStr = new BigDecimal("2.3");
        System.out.println("doubleStr本身"+doubleStr);

        System.out.println("转换为字符串："+doubleStr.toString());

        System.out.println("转换为double类型并且+1："+doubleStr.doubleValue()+1);

        System.out.println("转换为float类型"+doubleStr.floatValue());

        System.out.println("转换为long类型"+doubleStr.longValue());

        System.out.println("转换为int类型"+doubleStr.intValue());

    }
}
