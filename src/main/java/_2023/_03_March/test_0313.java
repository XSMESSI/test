package _2023._03_March;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/3/13 14:45
 */
public class test_0313 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
//        for (int i = 0; i < 23000; i++) {
//
//            for (int j = 0; j < 5020; j++) {
//                System.out.println(i + ">>>>>>>>" + j);
//            }
//        }
        for (int i = 0; i < 23000; i++) {
            System.out.println("i = " + i);
        }
        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start,end);
        System.out.println("duration.toMillis() = " + duration.toMillis());
    }
}
