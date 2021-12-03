package _2021._10_October.test_1008;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/8 16:21
 */
public class test_04_rplaceAll {

    private static String REGEX = "dog";
    private static String INPUT = "The dog says meow."+"All dogs say meow.";
    private static String REPLACE = "cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);

        Matcher m  =p.matcher(INPUT);
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}
