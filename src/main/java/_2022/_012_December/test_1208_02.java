package _2022._012_December;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/8 15:22
 */
public class test_1208_02 {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(4.9800);
        BigDecimal number2 = new BigDecimal("4.9800");
        BigDecimal number = BigDecimal.valueOf(4.980011111);
        String str = number.toString();
        //取小数部分
        str = str.substring(str.indexOf("."));
        System.out.println(str);
    }
}
