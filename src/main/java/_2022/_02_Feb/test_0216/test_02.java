package _2022._02_Feb.test_0216;

import java.time.LocalDate;

/**
 * @Description 字符串形式的时间和LocalDate的时间格式进行转换
 * @Author XuShen
 * @Date 2022/2/16 10:14
 */
public class test_02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        String timStr = now.toString();
        System.out.println("timStr = " + timStr);
        LocalDate rever = LocalDate.parse(timStr);
        System.out.println("rever = " + rever);

        String year = rever.getYear()+"年";
        System.out.println("year = " + year);
    }
}
