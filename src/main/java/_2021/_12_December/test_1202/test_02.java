package _2021._12_December.test_1202;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 根据位运算计算平均值
 * @Author XuShen
 * @Date 2021/12/2 16:29
 */
public class test_02 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("计算a,b平均值" + (a&b)+((a^b)>>1));
        int avg = (a&b)+((a^b)>>1);
        System.out.println("avg = " + avg);
        System.out.println((a&b)+((a^b)>>1));
    }
}
