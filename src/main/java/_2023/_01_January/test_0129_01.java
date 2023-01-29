package _2023._01_January;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/1/29 16:37
 */
public class test_0129_01 {
    public static void main(String[] args) {
        Integer start = 2023;
        Integer end = 2025;
        List<String> subColumns = Arrays.asList("oneNum","twoNum","threeNum","fourthNum","fiveNum","teacher");
        List<String> titles = subColumns.subList(0,end - start + 1);
        System.out.println("titles = " + titles);
    }
}
