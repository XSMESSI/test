package _2021._09_September.test_0926;

import com.sun.jdi.IncompatibleThreadStateException;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Description 字符串中的数字的使用方法
 * @Author XuShen
 * @Date 2021/9/26 15:33
 */
public class test_01 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char[] chars = str.toCharArray();
        int count = 0;
        int num = 0;

        for (int i = 0;i < chars.length;i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                count+=chars[i]-'0';
            }
        }
        System.out.println(str+"中数字的和是："+count);

        /**
         * 使用BigDecimal方法进行计算：
         * 遍历字符串查找到数字的，
         * 把数字转换为字符串类型并且定义为BIgDecimal类型
         * 利用BigDeciaml中的方法中intValue进行计算结果
         */
        for (int i = 0;i < chars.length;i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                BigDecimal str1 = new BigDecimal(chars[i]+"");
                num+=str1.intValue();
            }
        }
        System.out.println("使用BigDecimal方法进行计算的结果："+num);


    }
}
