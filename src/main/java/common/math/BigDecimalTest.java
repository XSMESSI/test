package common.math;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @Description BigDecimal概述:
 * @Author XuShen
 * @Date 2022/8/16 15:20
 */
public class BigDecimalTest {

    /**
     * 常用方法测试
     */
    @Test
    public void testMethod(){
        /**
         * BigDecimal概述:
         * ​ Java在java.math包中提供的API类BigDecimal，用来对超过16位有效位的数进行精确的运算。
         * 双精度浮点型变量double可以处理16位有效数，但在实际应用中，可能需要对更大或者更小的数进行运算和处理。
         * 一般情况下，对于那些不需要准确计算精度的数字，我们可以直接使用Float和Double处理，但是Double.valueOf(String)
         * 和Float.valueOf(String)会丢失精度。所以开发中，如果我们需要精确计算的结果，则必须使用BigDecimal类来操作。
         *
         * ​ BigDecimal所创建的是对象，故我们不能使用传统的+、-、*、/等算术运算符直接对其对象进行数学运算，
         * 而必须调用其相对应的方法。方法中的参数也必须是BigDecimal的对象。构造器是类的特殊方法，专门用来创建对象，特别是带有参数的对象。
         */

        /**
         * 常用构造函数:
         * 2.1、常用构造函数
         * BigDecimal(int)
         *
         * 创建一个具有参数所指定整数值的对象
         *
         * BigDecimal(double)
         *
         * 创建一个具有参数所指定双精度值的对象
         *
         * BigDecimal(long)
         *
         * 创建一个具有参数所指定长整数值的对象
         *
         * BigDecimal(String)
         *
         * 创建一个具有参数所指定以字符串表示的数值的对象
         */
        BigDecimal intBD = new BigDecimal(4);
        System.out.println(intBD);
        BigDecimal douBD = new BigDecimal(3.1);
        System.out.println(douBD);
        BigDecimal longBD = new BigDecimal(45L);
        System.out.println(longBD);
        BigDecimal strBD = new BigDecimal("78");
        System.out.println(strBD);

        //double类型使用构造器时,精度不准确问题
        BigDecimal a =new BigDecimal(0.1);
        System.out.println("a values is:"+a);
        System.out.println("=====================");
        BigDecimal b =new BigDecimal("0.1");
        System.out.println("b values is:"+b);

        /**
         * 原因分析：
         *
         * 1）参数类型为double的构造方法的结果有一定的不可预知性。有人可能认为在Java中写入newBigDecimal(0.1)所创建的BigDecimal正
         * 好等于 0.1（非标度值 1，其标度为 1），但是它实际上等于0.1000000000000000055511151231257827021181583404541015625。
         * 这是因为0.1无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。这样，传入到构造方法的值不会正好
         * 等于 0.1（虽然表面上等于该值）。
         *
         * 2）String 构造方法是完全可预知的：写入 newBigDecimal(“0.1”) 将创建一个 BigDecimal，它正好等于预期的 0.1。因此，比较而言，
         * 通常建议优先使用String构造方法。
         *
         * 3）当double必须用作BigDecimal的源时，请注意，此构造方法提供了一个准确转换；它不提供与以下操作相同的结果：
         * 先使用Double.toString(double)方法，然后使用BigDecimal(String)构造方法，将double转换为String。要获取该结果，
         * 请使用static valueOf(double)方法。
         */

        /**
         * 常用方法详解
         */
        BigDecimal methodA = BigDecimal.valueOf(10);
        BigDecimal methodB = BigDecimal.valueOf(3);

        //add(BigDecimal) BigDecimal 对象中的值相加，返回BigDecimal对象
        BigDecimal methodAdd = methodA.add(methodB);
        System.out.println("methodAdd = " + methodAdd);

        //subtract(BigDecimal) BigDecimal 对象中的值相减，返回BigDecimal对象
        BigDecimal methodSubtract = methodA.subtract(methodB);
        System.out.println("methodSubtract = " + methodSubtract);

        //multiply(BigDecimal) BigDecimal 对象中的值相乘，返回BigDecimal对象
        BigDecimal methodMultiply = methodA.multiply(methodB);
        System.out.println("methodMultiply = " + methodMultiply);

        //divide(BigDecimal) BigDecimal 对象中的值相除，返回BigDecimal对象
        BigDecimal methodDivide = methodA.divide(methodB);
        System.out.println("methodDivide = " + methodDivide);

        //将BigDecimal对象中的值转换成字符串
        String methodToStr = methodA.toString();
        System.out.println("methodToStr = " + methodToStr);

        //将BigDecimal对象中的值转换成双精度数
        Double methodToDou = methodA.doubleValue();
        System.out.println("methodToDou = " + methodToDou);

        //将BigDecimal对象中的值转换成单精度数
        Float methodToFloat = methodA.floatValue();
        System.out.println("methodToFloat = " + methodToFloat);

        //将BigDecimal对象中的值转换成长整数
        Long methodToLong = methodA.longValue();
        System.out.println("methodToLong = " + methodToLong);

        //将BigDecimal对象中的值转换成整数
        Integer methodToInt = methodA.intValue();
        System.out.println("methodToInt = " + methodToInt);
    }

    /**
     * BigDecimal 的比较和拓展
     */
    @Test
    public void testCompare(){
        BigDecimal comA = BigDecimal.valueOf(10);
        BigDecimal comB = BigDecimal.valueOf(2);
        /**
         * BigDecimal大小比较
         * comFlag = -1:表示methodA小于methodB;
         * comFlag = 0:表示methodA等于methodB;
         * comFlag = 1:表示methodA大于methodB;
         *   “ 正大 平等 负小 ”
         */
        int comFlag = comA.compareTo(comA);
        System.out.println("comFlag = " + comFlag);

        //拓展:3 >= 2
        boolean flag2 =  new BigDecimal(3).compareTo(new BigDecimal(2)) >= 0;
        System.out.println(flag2);
    }

    /**
     * 货币，利率格式
     */
    @Test
    public void testFormat(){

        //建立货币格式化引用
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        //建立百分比格式化引用
        NumberFormat percent = NumberFormat.getPercentInstance();
        //百分比小数点最多3位
        percent.setMaximumFractionDigits(3);

        //贷款金额
        BigDecimal loanAmount = new BigDecimal("15000.48");
        //利率
        BigDecimal interestRate = new BigDecimal("0.008");
        //相乘
        BigDecimal interest = loanAmount.multiply(interestRate);

        System.out.println("贷款金额:\t" + currency.format(loanAmount));
        System.out.println("利率:\t" + percent.format(interestRate));
        System.out.println("利息:\t" + currency.format(interest));
    }

    /**
     * 格式化保留两位小数
     */
    @Test
    public void testTwoFormat(){
        System.out.println(formatToNumber(new BigDecimal("3.435")));
        System.out.println(formatToNumber(new BigDecimal(0)));
        System.out.println(formatToNumber(new BigDecimal("0.00")));
        System.out.println(formatToNumber(new BigDecimal("0.001")));
        System.out.println(formatToNumber(new BigDecimal("0.006")));
        System.out.println(formatToNumber(new BigDecimal(0.206)));

    }

    /**
     * 1. 0 ~ 1 之间的BigDecimal小数，格式化后会失去前面的0,则前面直接加上0
     * 2. 传入的参数等于0 ，则直接返回字符串“0,00”
     * 3. 大于1的小数,直接格式化返回字符串
     * @param obj
     * @return
     */
    public static String formatToNumber(BigDecimal obj){
        DecimalFormat df = new DecimalFormat("#.00");
        if (obj.compareTo(BigDecimal.ZERO) == 0){
            return "0.00";
        }else if (obj.compareTo(BigDecimal.ZERO) > 0 && obj.compareTo(new BigDecimal(1)) < 0){
            return "0" + df.format(obj).toString();
        }else{
            return df.format(obj).toString();
        }
    }

    /**
     * 保留小数的六种常见方式
     */
    @Test
    public void testReminderScale(){
        /**
         *  BigDecimal.ROUND_UP
         * 舍入模式从零开始。始终在非零丢弃分数之前增加数字
         */
        BigDecimal decimal1 = new BigDecimal(12.1456).setScale(2,BigDecimal.ROUND_UP);
        System.out.println("decimal1 = " + decimal1);

        /**
         * BigDecimal.ROUND_DOWN
         * 舍入模式向零舍入。不要在丢弃的分数之前递增数字(即截断)
         */
        BigDecimal decimal2 = new BigDecimal(12.1456).setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println("decimal2 = " + decimal2);

        /**
         * BigDecimal.ROUND_CEILING
         * 圆形模式向正大无穷大转弯,如果BigDecimal为正，则表现为ROUND_UP；如果为负，则表现为ROUND_DOWN；
         */
        BigDecimal decimal3 = new BigDecimal(-12.1456).setScale(2,BigDecimal.ROUND_CEILING);
        System.out.println("decimal3 = " + decimal3);
        BigDecimal decimal4 = new BigDecimal(12.1456).setScale(2,BigDecimal.ROUND_CEILING);
        System.out.println("decimal4 = " + decimal4);

        /**
         * BigDecimal.ROUND_FLOOR
         * 舍入模式向负无穷大转弯。 如果BigDecimal为正，则表现为ROUND_DOWN ; 如果为负，表现为ROUND_UP 。
         */
        //-12.15   如果BigDecimal为正，则表现为ROUND_DOWN ; 如果为负，表现为ROUND_UP
        BigDecimal bigDecimal5 = new BigDecimal(-12.1456).setScale(2, BigDecimal.ROUND_FLOOR);
        System.out.println("bigDecimal5 = " + bigDecimal5);

        //12.14   如果BigDecimal为正，则表现为ROUND_DOWN ; 如果为负，表现为ROUND_UP
        BigDecimal bigDecimal6 = new BigDecimal(12.1456).setScale(2, BigDecimal.ROUND_FLOOR);
        System.out.println("bigDecimal6 = " + bigDecimal6);

        /**
         * BigDecimal.ROUND_HALF_UP
         * 四舍五入模式向“最近邻居”转弯，除非两个邻居都是等距的，在这种情况下是圆括弧的。 对于ROUND_UP如果丢弃的分数为0.5，则表现为; 否则，表现为ROUND_DOWN 。
         */
        //12.15   对于ROUND_UP如果丢弃的分数为0.5，则表现为; 否则，表现为ROUND_DOWN 。
        BigDecimal bigDecimal7 = new BigDecimal(12.1456).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("bigDecimal7 = " + bigDecimal7);

        /**
         * BigDecimal.ROUND_HALF_DOWN
         * 四舍五入模式向“最近邻居”转弯，除非这两个邻居都是等距离的，在这种情况下，这是倒圆的。 对于ROUND_UP如果丢弃的分数> 0.5，则表示行为; 否则，表现为ROUND_DOWN 。
         */
        //12.15   对于ROUND_UP如果丢弃的分数> 0.5，则表示行为; 否则，表现为ROUND_DOWN 。
        BigDecimal bigDecimal8 = new BigDecimal(12.1456).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("bigDecimal8 = " + bigDecimal8);
    }

}
