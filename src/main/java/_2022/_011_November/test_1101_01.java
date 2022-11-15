package _2022._011_November;

import org.apache.commons.lang.StringUtils;
import org.apache.xmlbeans.impl.regex.Match;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/1 14:21
 */
public class test_1101_01 {


    @Test
    public void test1() {
        String num = "abc123";
       boolean value = HasNumber(num);
        System.out.println(value);
    }

    @Test
    public void etst3(){
        String var = "孙兆杰（00010218）";
        String value = var.substring(var.indexOf("（") + 1 ,var.indexOf("）"));
        String value11= var.substring(0,var.indexOf("（"));
        System.out.println("value = " + value);
        System.out.println("value11 = " + value11);
    }

    public static boolean isNum(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (isNum.matches()) {
            return true;
        }
        return false;
    }

    public boolean HasDigit(String content) {
        boolean flag = false;
        Pattern p = Pattern.compile("^[-\\+]?[\\d]*$");
        Matcher m = p.matcher(content);
        if (m.matches()) {
            flag = true;
        }
        return flag;
    }

    public boolean HasNumber(String str){
        if (StringUtils.isBlank(str)){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                return true;
            }
        }
        return false;
    }



}


