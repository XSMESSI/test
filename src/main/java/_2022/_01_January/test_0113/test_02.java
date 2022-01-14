package _2022._01_January.test_0113;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/13 15:11
 */
public class test_02 {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(23);
        BigDecimal num2 = BigDecimal.valueOf(100);
        BigDecimal count = num1.divide(num2,4,BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100));
        System.out.println("count = " + count);
    }
}
