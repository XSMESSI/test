package _2023._09_Sep;

import org.apache.commons.lang.StringUtils;

/**
 * @Author Xu Shen
 * @Date 2023/9/19 9:33
 * @Version 1.0
 * @DESC :
 */
public class test_0919 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "abc";
        boolean b = StringUtils.equalsIgnoreCase(str1, str2);
        System.out.println(b);
    }
}
