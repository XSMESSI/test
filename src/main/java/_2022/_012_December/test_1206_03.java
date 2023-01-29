package _2022._012_December;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/6 18:18
 */
public class test_1206_03 {
    public static void main(String[] args) {
        String year = "2022-12-12";
        LocalDate localDate = LocalDate.parse(year);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = localDate.format(pattern);
        System.out.println("format = " + format);
    }
}
