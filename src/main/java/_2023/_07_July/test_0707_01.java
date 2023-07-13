package _2023._07_July;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/7/7 10:43
 */
public class test_0707_01 {
    public static void main(String[] args) {
        List<BigDecimal> values = new ArrayList<>();
        values.add(BigDecimal.valueOf(10));
        values.add(BigDecimal.valueOf(3));
        values.add(BigDecimal.valueOf(20));
        values.add(BigDecimal.valueOf(50));
        BigDecimal max = values.stream().filter(Objects::nonNull).max(BigDecimal::compareTo).orElse(new BigDecimal(0));
        System.out.println("max = " + max);
    }
}
