package common.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description 计算两个时间差的计算方式
 * @Author XuShen
 * @Date 2023/3/13 14:37
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.parse("2020-11-25 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Duration duration = Duration.between(dateTime2,dateTime1);

//总天数
        System.out.println("duration.toDays() = " + duration.toDays());
//总小时数
        System.out.println("duration.toHours() = " + duration.toHours());
//总分钟数
        System.out.println("duration.toMinutes() = " + duration.toMinutes());
//总毫秒数
        System.out.println("duration.toMillis() = " + duration.toMillis());


    }
}
