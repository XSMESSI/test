package _2022._01_January.test_0117;

import java.util.Collection;

/**
 * @Description 字符型数据
 * @Author XuShen
 * @Date 2022/1/17 16:51
 */
public class test_04 {

    public static void main(String[] args) {
        char c = 3+5;
        System.out.println("c = " + c);
        int a1 = 3;int a2 = 5;
        //强制转换才可以
        char c0 = (char)(a1+a2);
        System.out.println("c0 = " + c0);
        //char不能 表示负数
//        char c1 = -3;
//        System.out.println("c1 = " + c1);
        //编译正确，但是乱码
        char c2 = (char) -3;
        System.out.println("c2 = " + c2);
        char c3 = '3';
        System.out.println("c3 = " + c3);
        //双引号表示的是字符串
//        char c4 = "3";
        //65是两个字符
//        char c5 = '65';

    }
}
