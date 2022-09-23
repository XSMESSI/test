package _2022._09_Septemper;

import java.math.BigDecimal;

/**
 * @Description 比较大小数据处理
 * @Author XuShen
 * @Date 2022/9/19 8:54
 */
public class test_0919_01 {
    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(10);
        BigDecimal value2 = BigDecimal.valueOf(20);
        BigDecimal value3 = BigDecimal.valueOf(10);
        BigDecimal value4 = BigDecimal.valueOf(5);
        Integer compare1 = value1.compareTo(value2);
        Integer compare2 = value1.compareTo(value3);
        Integer compare3 = value1.compareTo(value4);

        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
    }
}
