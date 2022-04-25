package _2022._04_April.test_0415;

import java.math.BigDecimal;

/**
 * @Author: Leo messi
 * @Date: 2022/04/15/9:18
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(100);
        BigDecimal num2 = BigDecimal.valueOf(90);
        System.out.println(num1.compareTo(num2) == 1);
    }
}
