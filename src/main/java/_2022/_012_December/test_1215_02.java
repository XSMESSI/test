package _2022._012_December;

import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/12/15 10:16
 */
public class test_1215_02 {
    public static void main(String[] args) {
        String str = "^[+-]?[\\d]+$";
        Pattern pattern = Pattern.compile(str);

        String strNum1="+";
        String strNum2="12334444444444444";
        String strNum3="+12345";
        String strNum4="-1234";
        String strNum5="-+1";

        System.out.println(pattern.matcher(strNum1).matches());
        System.out.println(pattern.matcher(strNum2).matches());
        System.out.println(pattern.matcher(strNum3).matches());
        System.out.println(pattern.matcher(strNum4).matches());
        System.out.println(pattern.matcher(strNum5).matches());
    }
}
