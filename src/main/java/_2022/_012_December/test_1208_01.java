package _2022._012_December;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/8 9:33
 */
public class test_1208_01 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.toString());

        BigDecimal value1 = BigDecimal.valueOf(12.0011);
        BigDecimal value2 = BigDecimal.valueOf(4444.0000);
        BigDecimal value3 = BigDecimal.valueOf(4444);
        BigDecimal value4 = BigDecimal.valueOf(150.1011222);
        NumberFormat nf = NumberFormat.getNumberInstance();
        String value11 = nf.format(value1);
        String value22 = nf.format(value2);
        String value33 = nf.format(value3);
        String value44 = nf.format(value4);
        value11 = value11.replace(",", "");
        value22 = value22.replace(",", "");
        value33 = value33.replace(",", "");
        value44 = value44.replace(",", "");


        BigDecimal value111 = new BigDecimal(value11);
        BigDecimal value222 = new BigDecimal(value22);
        BigDecimal value333 = new BigDecimal(value33);
        BigDecimal value444 = new BigDecimal(value44);
        System.out.println(value111);
        System.out.println(value222);
        System.out.println(value333);
        System.out.println(value444);

    }
}
