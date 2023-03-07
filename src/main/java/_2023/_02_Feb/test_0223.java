package _2023._02_Feb;

import java.time.LocalDateTime;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/23 17:56
 */
public class test_0223 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime value = LocalDateTime.of(2021,1,23,18,20,10);
        boolean num = now.isBefore(value);
        boolean num1 = now.isAfter(value);
        System.out.println(num);

        System.out.println(num1);
    }
}
