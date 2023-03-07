package _2023._02_Feb;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/23 18:37
 */
public class test_0223_01 {
    public static void main(String[] args) {
        String date ="2023-02-23";
//        date = date + " 00:00:00";
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime dateTime = LocalDateTime.parse(date,df);
//        System.out.println(dateTime);


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(date,dateFormatter);
        boolean before = LocalDate.now().isAfter(date1);
        boolean equal = LocalDate.now().equals(date1);
        System.out.println("date1 = " + date1);
        System.out.println(equal);
        System.out.println(before);
    }
}
