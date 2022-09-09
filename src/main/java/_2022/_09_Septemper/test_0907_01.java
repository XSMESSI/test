package _2022._09_Septemper;

import org.apache.commons.lang.StringUtils;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/9/7 14:12
 */
public class test_0907_01 {
    public static void main(String[] args) {
        String va1 = "1";
        String va2 = "1";
        boolean dd = StringUtils.endsWithIgnoreCase(va1,va2);
        System.out.println(dd);
    }
}
