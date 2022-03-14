package _2022._03_March.test_0314;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/14 16:48
 */
public class test_02 {
    public static void main(String[] args) {
        BigDecimal num = BigDecimal.valueOf(100.00);
        BigDecimal rate = num.divide(BigDecimal.valueOf(3),BigDecimal.ROUND_HALF_UP,2);
        rate = rate.setScale(2, RoundingMode.HALF_UP);
        System.out.println("rate = " + rate);
    }
}
