package Leetcode.testCs;

/**
 * @Description 一个字符串在另一个字符串中的位置
 * @Author XuShen
 * @Date 2022/2/11 14:27
 */
public class test_028strStr {
    public static void main(String[] args) {
        String str1 = "c";
        String str2 = "c";
        System.out.println(strStr(str1,str2));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }
        for (int i = 0;i<=haystack.length()-needle.length();i++){
            if (haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }



}
