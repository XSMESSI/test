package _2024._01_January;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xu Shen
 * @Date 2024/1/12 14:51
 * @Version 1.0
 * @DESC :
 */
public class test_0112 {
    public static void main(String[] args) {
        printNumber(1,2,3);
        printNumber(1,2);
//        printNumber(list.toArray(arr));
        printNumber(new int[]{1,2,4,6});
    }

    private static void printNumber(int... numbers) {
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
