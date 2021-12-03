package _2021._10_October.test_1008;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description Matchers的start和end的使用
 * @Author XuShen
 * @Date 2021/10/8 14:19
 */
public class test_02 {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);//获取matcher对象
        int count = 0;

        while (m.find()){
            count++;
            System.out.println("Matcher number:"+count);
            System.out.println("start():"+m.start());
            System.out.println("end():"+m.end());
        }
    }
}
