package _2022._04_April.test_0407;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @Author: Leo messi
 * @Date: 2022/04/07/9:16
 * @Description: NumberFormat  数字格式化类
 */
public class test_01 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat);

        /*
        * private static void decimalFormat() {
        double d1 = 123456.36987, d2 = 12.3698;
        DecimalFormat nf = new DecimalFormat("0000.000");
        System.out.println("d1=" + nf.format(d1) + " d2=" + nf.format(d2));//d1=123456.370 d2=0012.370
        nf = new DecimalFormat("#");
        System.out.println("d1=" + nf.format(d1));//d1=123456
        nf = new DecimalFormat(".####");
        System.out.println("d1=" + nf.format(d1));//d1=123456.3699
        nf = new DecimalFormat("0000,0000.00000");//注意“,”不能放在小数部分
        System.out.println("d1=" + nf.format(d1));//d1=0012,3456.36987
    }
        * */

        double d1 = 123456.36987;
        double d2 = 12.3698;
        DecimalFormat nf = new DecimalFormat("0000.0000");
        System.out.println("d1" + nf.format(d1) + "d2 = "+nf.format(d2));
        nf = new DecimalFormat("#");
        System.out.println("d1=" + nf.format(d1));
        nf = new DecimalFormat(".####");
        System.out.println("d1 = " + nf.format(d1));

    }
}
