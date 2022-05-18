package _2022._04_April.test_0424;

import java.math.BigDecimal;

/**
 * @Author: Leo messi
 * @Date: 2022/04/25/18:01
 * @Description:
 */
public class test_02 {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(100);
        BigDecimal num2 = BigDecimal.valueOf(20);
        BigDecimal num3 = BigDecimal.valueOf(30);
        BigDecimal num5 = BigDecimal.valueOf(10);
        BigDecimal num4 = num1.subtract(num2).subtract(num3).subtract(num5);
        System.out.println("num4 = " + num4);
        System.out.println();
    }
}
