package _2022._04_April.test_0418;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Leo messi
 * @Date: 2022/04/18/11:23
 * @Description:
 */
public class test_01 {
    public static void main(String[] args) {
//        String regex = "[^ ]";
        String result = "%&";
        String regex = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z\\W]{6,50}$";
        String regex1 = "^(?![0-9]+$)(?![a-zA-Z]+$)(?![`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'\"。，、？]+$)[0-9A-Za-z`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'\"。，、？]{6,50}$";

        if(match(regex1,result)){
            System.out.println("字符串包含特殊");
        }
    }

    private static boolean match(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean result = matcher.matches();
        return result;
    }


}
