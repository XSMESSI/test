package _2023._04_Aprial;

import org.junit.Test;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/4/10 19:44
 */
public class test_0410_01 {

    @Test
    public void etst1(){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM");
        String month = LocalDate.now().format(pattern);

        List<String> monthes = new ArrayList<>();
        LocalDate date = LocalDate.now();
        for (int i = 0; i < 24; i++) {
            date = date.plusMonths(1);
            String monthNew = date.format(pattern);
            monthes.add(monthNew);
            System.out.println("monthNew = " + monthNew);
        }
//        System.out.println("monthes = " + monthes);

        monthes = monthes.stream().sorted().collect(Collectors.toList());

        System.out.println("monthes = " + monthes);
    }
}
