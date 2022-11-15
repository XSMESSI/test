package _2022._10_October;

import org.apache.commons.lang.StringUtils;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/19 9:23
 */
public class test_1019_01 {
    public static void main(String[] args) {
        String num = null;
        String num1 = " ";
        String num2 = "   ";
        boolean va = StringUtils.isBlank(num);
        boolean va1 = StringUtils.isBlank(num1);
        boolean va2 = StringUtils.isBlank(num2);
        System.out.println(va);
        System.out.println(va1);
        System.out.println(va2);
    }
}
