package _2021._09_September.test_0924;

/**
 * @Description 字符串的转换相关方法
 * @Author XuShen
 * @Date 2021/9/24 16:06
 */
public class test_06String06 {
    public static void main(String[] args) {
        /**
         * String当中与转换相关的常用方法有：
         * （1）public char[] toCharArray(),将当前字符串拆分成为字符数组作为返回值
         * （2）public byte[] getByte() 获得当前字符串的字节数组
         * （3）public String replace(CharSequence oldString,CharSequence newString)，
         * 将所有出现的老字符串替换成为新的字符串。返回替换之后的结果新字符串
         * 备注：CharSequence意思就是说可以接受字符串类型
         */
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("*************");
        //转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0;i<bytes.length;i++){
            System.out.println(bytes[i]);
        }

        System.out.println("*********");
        //替换
        String str1 = "How do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("***********");

        String lang1 = "会不会玩啊，你一边去";
        String s = lang1.replace("你一边去","*******");
        System.out.println(lang1);
        System.out.println(s);


    }
}
