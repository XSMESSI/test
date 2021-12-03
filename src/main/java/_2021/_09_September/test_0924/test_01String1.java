package _2021._09_September.test_0924;

/**
 * @Description 字符串的学习使用
 * @Author XuShen
 * @Date 2021/9/24 10:12
 */
public class test_01String1 {
    public static void main(String[] args) {
        /**
         * 创建字符串的常见的3+1中方式
         * 三种构造方法:
         * public String()创建一个空白字符串，不含有任何内容
         * public String(char[] array).根据字符数组的内容，来创建对应的字符串
         * public String(byte[] array).根据字节数组的内容，来创建对应的字符串
         * 直接创建：
         * String str = "hello";
         */

        //使用空参构造
        String str1 = new String();//小括号留空，说明字符串什么内容都没有
        System.out.println("第一个字符串:"+str1);

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是："+str2);
        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是："+str3);
        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串是"+str4);
    }
}
