package common;

import java.time.LocalDate;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/12/9 10:14
 */
public class testEvery {
    public static void main(String[] args) {
        int nowYear = LocalDate.now().getYear();
        for (int i = nowYear-4;i<=nowYear;i++){
            System.out.print(i+"年"+" ");
        }
    }
}
