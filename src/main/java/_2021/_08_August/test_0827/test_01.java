package _2021._08_August.test_0827;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/27 14:29
 */
public class test_01 {
    public static void main(String[] args) {
        int nowYear = LocalDate.now().getYear();
        for (int i = nowYear - 4;i<=nowYear;i++){
            System.out.println(i);
        }
    }
}
