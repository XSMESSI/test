package _2021._08_August.test_0819;

import java.math.BigDecimal;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/19 10:40
 */
public class test_0 {
    public static void main(String[] args) {

        BigDecimal sum = BigDecimal.valueOf(1335300);
        System.out.println(sum.divide(BigDecimal.valueOf(10000),2,BigDecimal.ROUND_HALF_UP)+"万元");


        String lwArray[] = {"核心论文","SCI","EI"};

        for (String string :lwArray){
            System.out.println(string);
        }

    }
}
