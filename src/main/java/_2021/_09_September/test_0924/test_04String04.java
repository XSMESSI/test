package _2021._09_September.test_0924;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/24 14:27
 */
public class test_04String04 {
    public static void main(String[] args) {
        /**
         * String当中与获取相关的常用的方法
         * public int length(),获取字符串当中含有的字符个数，拿到字符串长度
         * public String concat（String str） 将当前字符串和参数字符串拼接成为返回值新的字符串
         * public char charAt(int index)将获取指定索引位置的单个字符串（索引从0开始）
         * public int indexOf(String str) 查找参数字符串在本字符串当中首次出现索引位置，如果没有，返回-1值
         */
        //获取字符串长度
        int length = "asdsfdfdfdfdfdfdgfgfghj".length();
        System.out.println("字符串的长度是："+length);
        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("###########");
        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);
        System.out.println("******************");
        //查找参数字符串在本来字符串当中出现的第一次索引位置
        String original = "HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println(llo);
        System.out.println("Hello".indexOf("abc"));
    }
}
