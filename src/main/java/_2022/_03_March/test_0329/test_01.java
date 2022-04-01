package _2022._03_March.test_0329;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

/**
 * @Author: Leo messi
 * @Date: 2022/03/29/11:08
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
        //时间格式修改
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        LocalDateTime par = LocalDateTime.parse(time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("par = " + par);
        SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
        System.out.println(time.getYear()+"-"+time.getMonthValue()+"-"+time.getDayOfMonth());
    }
}
