package _2022._02_Feb.test_0223;

import _2021._09_September.test_0917.People;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/23 8:54
 */
public class test_01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021,3,6);
        LocalDate date1 = date.plusDays(30);
        System.out.println("date1 = " + date1);
    }
}
