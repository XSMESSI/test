package _2023._04_Aprial;

import cn.hutool.core.date.DatePattern;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/4/17 15:09
 */
public class test_0417 {


    @Test
    public void etst1(){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM");
        String ym = "2022-03-10";
        LocalDate ymLocal = LocalDate.parse(ym,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("ymLocal = " + ymLocal);
        System.out.println("ymLocal.getMonthValue() = " + ymLocal.getMonthValue());
        String last = ymLocal.minusMonths(1).format(pattern);
        System.out.println("last = " + last);
    }
}
