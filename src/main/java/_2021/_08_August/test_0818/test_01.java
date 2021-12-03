package _2021._08_August.test_0818;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/18 11:30
 */
public class test_01 {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.ONE;
        BigDecimal sum = BigDecimal.ZERO;


        BigInteger c = BigInteger.valueOf(5);
//        System.out.println(a.add(BigDecimal.valueOf(b)));
//        System.out.println(c.add(BigInteger.valueOf(b)));


        for (int i = 1;i<10;i++){
            sum = sum.add(BigDecimal.valueOf(i));
        }
        System.out.println(sum);
    }
}
