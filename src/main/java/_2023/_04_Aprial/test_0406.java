package _2023._04_Aprial;

import cn.hutool.core.date.DatePattern;
import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/4/6 9:19
 */
public class test_0406 {

    @Test
    public void test(){
//        String format = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        String ym = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        System.out.println("ym = " + ym);
    }

    @Test
    public void testOne(){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM");
        String ym = LocalDate.now().format(pattern);
        System.out.println("ym = " + ym);
        LocalDate last = LocalDate.now().minusMonths(1);
        System.out.println("last = " + last);
        String lastYm = last.format(pattern);
        System.out.println("lastYm = " + lastYm);

    }

    @Test
    public void testTwo(){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM");
        LocalDate now = LocalDate.of(2023,01,01);
        LocalDate last = now.minusMonths(1);
        String ym = last.format(pattern);
        System.out.println("last = " + last);
        System.out.println("ym = " + ym);
    }

    @Test
    public void testThree(){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM");
        String ym = "2022-03-01";
        LocalDate ymLocal = LocalDate.parse(ym,DateTimeFormatter.ofPattern(DatePattern.NORM_DATE_PATTERN));
        System.out.println("ymLocal = " + ymLocal);
        System.out.println("ymLocal.getMonthValue() = " + ymLocal.getMonthValue());
    }

}
