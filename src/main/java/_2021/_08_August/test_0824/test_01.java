package _2021._08_August.test_0824;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/24 9:17
 */
public class test_01 {
    public static void main(String[] args){


        Integer nowYear = LocalDate.now().getYear();

        for (int i = nowYear - 3;i<=nowYear;i++){
            System.out.println(i+"年");
        }

    }
}
