package _2021._10_October.test_1008;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 字符串的正则表达式
 * @Author XuShen
 * @Date 2021/10/8 13:31
 */
public class test_01 {
    public static void main(String[] args) {
        /**
         * Pattern类：pattern对象是一个正则表达式的编译表示。
         * Matcher类：Matcher对象是对输入字符串进行解释和匹配操作的引擎。
         * PatternSyntaxException是一个非强制异常类，他表示一个正则表达模式中的语法错误
         */



        //按照指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        //创建pattern对象
        Pattern r = Pattern.compile(pattern);

        //创建matcher对象
        Matcher m = r.matcher(line);
        if (m.find()){
            System.out.println("Fond value:"+m.group(0));
            System.out.println("Fond value:"+m.group(1));
            System.out.println("Fond value:"+m.group(2));
        }else {
            System.out.println("NO MATCH");
        }
    }
}
