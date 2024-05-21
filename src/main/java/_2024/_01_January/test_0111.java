package _2024._01_January;

import java.math.BigDecimal;

/**
 * @Author Xu Shen
 * @Date 2024/1/11 11:21
 * @Version 1.0
 * @DESC :
 */
public class test_0111 {
    public static void main(String[] args) {
        BigDecimal result = BigDecimal.valueOf(2).subtract(BigDecimal.valueOf(27).subtract(BigDecimal.valueOf(1))
                .divide(BigDecimal.valueOf(36)
                        .subtract(BigDecimal.valueOf(1)), 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(2)));
        System.out.println("result = " + result);
    }
}
