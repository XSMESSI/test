package _2021._09_September.test_0926;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Description BigDecimal之间的比较大小
 * @Author XuShen
 * @Date 2021/9/27 11:30
 */
public class test_04BigDecimal_03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigDecimal a  = cin.nextBigDecimal();
        BigDecimal b = cin.nextBigDecimal();
        if (a.compareTo(b) == -1){
            System.out.println(a+"<"+b);
        }else if (a.compareTo(b) == 0){
            System.out.println(a+"="+b);
        }else if (a.compareTo(b) == 1){
            System.out.println(a+">"+b);
        }
    }
}
