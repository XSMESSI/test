package _2022._09_Septemper;

import common.XSS.XSSUtil;

import java.util.regex.Pattern;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/13 13:33
 */
public class test_0913_01 {

    public static void main(String[] args) {
        String s = XSSUtil.stripXss("<IMG SRC = http://3w.org/XSS/xss.js/>");
        System.out.println(s);
        boolean xssPass = XSSUtil.isXssPass("<img src = 0 onerror = alert (1)>");
        System.out.println(xssPass);
    }
}
