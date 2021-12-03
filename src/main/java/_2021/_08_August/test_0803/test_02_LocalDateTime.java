package _2021._08_August.test_0803;

import java.time.LocalDateTime;

/**
 * @Description  LocalDateTime用法
 * @Author XuShen
 * @Date 2021/8/3 14:47
 */
public class test_02_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        System.out.println(time.withDayOfMonth(12));
        System.out.println(time.withDayOfYear(99));

        System.out.println(time.minusDays(23));
    }
}
