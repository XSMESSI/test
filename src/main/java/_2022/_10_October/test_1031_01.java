package _2022._10_October;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/31 8:42
 */
public class test_1031_01 {
    public static void main(String[] args) {
        String str = "2022-10-31 00:00:00";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(str,df);

        ldt.plusHours(23);
        ldt.plusMinutes(59);
        ldt.plusSeconds(59);

        LocalDateTime end = LocalDateTime.of(ldt.getYear(),ldt.getMonth(),ldt.getDayOfMonth(),23,59,59);
        System.out.println("ldt = " + ldt);
        System.out.println("end = " + end);
    }
}
