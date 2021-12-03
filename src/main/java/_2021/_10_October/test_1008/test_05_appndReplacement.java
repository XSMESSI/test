package _2021._10_October.test_1008;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/10/8 16:30
 */
public class test_05_appndReplacement {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //获取matcher对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
