package _2023._01_January;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Description Date转换为LocalDate形式
 * @Author XuShen
 * @Date 2023/1/4 17:09
 */
public class test_0104 {
    public static void main(String[] args) {
        Date date = new Date();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(),zoneId);
        System.out.println("localDateTime = " + localDateTime);
    }
}
