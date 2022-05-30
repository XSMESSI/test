package _2022._05_May.test_0523;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @Description 计算两个时间的相差天数，
 * @Author XuShen
 * @Date 2022/5/23 21:21
 */
public class test_03 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2020,2,13,2,23);
        LocalDateTime end = LocalDateTime.of(2022,5,2,3,19);
        Duration duration = Duration.between(start,end);
        long days = duration.toDays();//相差的天数
        System.out.println("days = " + days);
        long hours = duration.toHours();//相差的小时数
        System.out.println("hours = " + hours);
        long minutes = duration.toMinutes();//相差的分钟数
        System.out.println("minutes = " + minutes);
        long mills = duration.toMillis();//相差的毫秒数
        System.out.println("mills = " + mills);
        long nanos = duration.toNanos();//相差的纳秒数
        System.out.println("nanos = " + nanos);

        Long nu =199992L;
        System.out.println("nu/1000 = " + 1.0*nu/1000);


    }
}
