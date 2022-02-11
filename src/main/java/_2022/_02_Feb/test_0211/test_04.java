package _2022._02_Feb.test_0211;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Description 字符串转换为数组的两种方式
 * @Author XuShen
 * @Date 2022/2/11 15:24
 */
public class test_04 {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";

        //方法1：
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        //方法2:
        Pattern pattern = Pattern.compile(" ");
        String[] words2 = pattern.split(str);
        System.out.println("Arrays.toString(words2) = " + Arrays.toString(words2));

    }
}
