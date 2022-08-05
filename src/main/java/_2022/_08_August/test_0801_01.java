package _2022._08_August;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/1 16:16
 */
public class test_0801_01 {
    public static void main(String[] args) {
        Integer nowYear = LocalDate.now().getYear();
        for (int i = nowYear - 5;i < nowYear;i++){
            System.out.println("i = " + i);
        }
    }
}
