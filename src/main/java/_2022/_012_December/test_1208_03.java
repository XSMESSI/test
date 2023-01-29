package _2022._012_December;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/8 15:33
 */
public class test_1208_03 {
    public static void main(String[] args) {
//        BigDecimal value1 = BigDecimal.valueOf(4.000111000000);
        BigDecimal value1 = BigDecimal.valueOf(0.000000);
//        BigDecimal result = BigDecimal.valueOf(value1.doubleValue());
//        BigDecimal result = value1;
//        System.out.println("result = " + result);


        BigDecimal valueStr = new BigDecimal(value1.toString());
        BigDecimal noZeros = valueStr.stripTrailingZeros();
        String result = noZeros.toPlainString();
        System.out.println("result = " + result);

    }
}
