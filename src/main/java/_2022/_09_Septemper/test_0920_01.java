package _2022._09_Septemper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/20 14:22
 */
public class test_0920_01 {
    public static void main(String[] args) {
        Integer currentYear = LocalDateTime.now().getYear();
        Integer num = 3;
        List<String> list = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        for (int i = 0;i < num;i++){
            list.add(currentYear - i + "");
        }

        System.out.println(list);

        for (int var = 0; var < num; var++) {
            list1.add((currentYear - var) + "-" + (currentYear - var - 1));
        }

        System.out.println(list1);

    }
}
