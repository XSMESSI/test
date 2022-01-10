package _2021._07_July.test_0719;

import java.math.BigDecimal;

/**
 * BIgDecimal的使用
 */
public class _0719test2 {
    public static void main(String[] args) {
        System.out.println(0.2+0.1);
        /**
         * 使用BigDecmial
         */
        BigDecimal intStr = BigDecimal.valueOf(3.66666666);
        BigDecimal doubleStr = new BigDecimal(Double.toString(3.66666666));
        System.out.println(intStr);
        System.out.println(doubleStr);

    }


}
