package _2021._10_October.test_1008;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.tools.corba.se.idl.StringGen;
import org.apache.ibatis.annotations.Param;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description  matches和lookingAt方法
 * @Author XuShen
 * @Date 2021/10/8 14:27
 */
public class test_03_matches {
    private static final String REGEX = "foo";
    private static final String INPUT = "foooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is : "+REGEX);
        System.out.println("Current INPUT is : "+INPUT);


        System.out.println("lookingAt():"+matcher.lookingAt());
        System.out.println("matches():"+matcher.matches());
    }
}
