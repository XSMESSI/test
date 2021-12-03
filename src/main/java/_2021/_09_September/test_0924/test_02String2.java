package _2021._09_September.test_0924;

/**
 * @Description 字符串的常量池
 * @Author XuShen
 * @Date 2021/9/24 10:51
 */
public class test_02String2 {
    public static void main(String[] args) {
        /**
         * 字符串的常量池：程序当中直接写上的双引号字符串，就在字符串常量池中
         * 对于基本类型来说，==是进行数值的比较
         * 对于引用类型来说，==是进行【地址值】的比较
         */
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
