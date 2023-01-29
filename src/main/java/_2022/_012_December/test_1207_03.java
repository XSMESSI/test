package _2022._012_December;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/7 16:59
 */
public class test_1207_03 {
    public static void main(String[] args) {
        BigDecimal value = new BigDecimal(12.00);
        BigDecimal value2 = new BigDecimal(4444.0000);
        NumberFormat nf = NumberFormat.getNumberInstance();
        String value111 = nf.format(value);
        String value22 = nf.format(value2);
        value22 = value22.replace(",","");
        System.out.println(value111);
        System.out.println(value22);


        BigDecimal value33 = value2.stripTrailingZeros();
        BigDecimal value44 = value.stripTrailingZeros();
        System.out.println(value33);
        System.out.println(value44);
    }

}
