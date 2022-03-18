package _2022._03_March.test_0317;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/17 9:14
 */
public class test_01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(2021,6,10);
        System.out.println(date.getMonthValue());
        System.out.println(now.getMonthValue());
        System.out.println(now.getMonth());
    }
}
