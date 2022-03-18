package _2022._03_March.test_0315;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/15 16:58
 */
public class test_02 {
    public static void main(String[] args) {
        //获取当前日期
        LocalDate today = LocalDate.now();
        System.out.println("Current date:"+today);

        //当前日期增加一周
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week:"+nextWeek);

        //当前日期增加一月
        LocalDate nextMonth = today.plus(1,ChronoUnit.MONTHS);
        System.out.println("Next Month:"+nextMonth);

        //当前日期增加一年
//        LocalDate

    }
}
