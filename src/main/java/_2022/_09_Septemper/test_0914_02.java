package _2022._09_Septemper;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/14 14:54
 */
public class test_0914_02 {
    public static void main(String[] args) {
        String vaStr = "0.222333333";
        BigDecimal divalue = new BigDecimal(vaStr);
        System.out.println(divalue);


        String value = "2";
        Integer number = Integer.valueOf(value);
        boolean b = Objects.equals(number, 2);
        System.out.println(b);

    }
}
