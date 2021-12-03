package _2021._10_October.test_1009;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/9 10:29
 */
public class test_01 {
    public static void main(String[] args) {

        BigInteger n = BigInteger.valueOf(5);
        BigInteger m = BigInteger.valueOf(6);
        if (n.compareTo(m) == -1){
            System.out.println(n+"<"+m);
        }
        /*BigInteger n = BigInteger.valueOf(9376);
        BigInteger num = n.multiply(n);
        String nStr = String.valueOf(n);
        String numstr = String.valueOf(num);
        String str = numstr.substring(numstr.length()-nStr.length());
        if (str.equals(nStr)){
            System.out.println("是");
        }else {
            System.out.println("否");
        }*/
    }
}
