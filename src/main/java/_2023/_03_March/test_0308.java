package _2023._03_March;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/8 14:17
 */
public class test_0308 {
    public static void main(String[] args) {
        String number = null;
        if (Objects.isNull(number)){
            number = "";
        }
        String number2 = "";
        BigDecimal value = new BigDecimal(number);
        BigDecimal value2 = new BigDecimal(number2);
        System.out.println("value = " + value);
    }
}
