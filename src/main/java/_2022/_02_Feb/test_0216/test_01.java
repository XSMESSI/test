package _2022._02_Feb.test_0216;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/16 9:36
 */
public class test_01 {
    public static void main(String[] args) {
        String year = "2021年";
        System.out.println("year = " + year.substring(0,4));

        LocalDate date = LocalDate.of(2022,9,30);
        LocalDate date30 = date.minusDays(30);
        LocalDate dateMon = date.minusMonths(1);
        LocalDate dateWeek = date.minusWeeks(0);
        LocalDate dateWeek1 = date.minusWeeks(1);
        System.out.println("date30 = " + date30);
        System.out.println("dateMon = " + dateMon);
        System.out.println("dateWeek = " + dateWeek);
        System.out.println("dateWeek1 = " + dateWeek1);



    }
}
