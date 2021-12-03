package Leetcode._02testMath;

import org.apache.xmlbeans.impl.regex.Match;

import java.math.BigInteger;

/**
 * @Description 整数反转
 * @Author XuShen
 * @Date 2021/11/30 11:00
 */
public class test_01IntReverse {
    public static void main(String[] args) {
//        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
//        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
//        System.out.println();
//        System.out.println(Integer.MAX_VALUE/10);
        System.out.println(reverse1(123));
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int digit = x % 10;
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static BigInteger reverse1(int x) {
        BigInteger result = BigInteger.ZERO;
        String string = "";
        if (x < 0) {
            String a = x + "";
            string = a.substring(1, a.length());
        } else {
            string = x + "";
        }
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = string.length() - 1; i >= 0; i--) {
            Integer num1 = Integer.valueOf(string.substring(i, i + 1));
            BigInteger num2 = BigInteger.valueOf((long)Math.pow(10,i));
            BigInteger numRe = BigInteger.valueOf(num1).multiply(num2);
            sum = sum.add(numRe);
        }
        if (x < 0) {
            result = BigInteger.ZERO.subtract(result);
        } else {
            result = sum;
        }

        if (sum.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) == 1 || sum.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) == -1){
            return BigInteger.ZERO;
        }
        return result;
    }

}
