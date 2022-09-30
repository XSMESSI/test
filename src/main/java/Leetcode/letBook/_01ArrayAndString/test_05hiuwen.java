package Leetcode.letBook._01ArrayAndString;

/**
 * @Description 最长回文字符串
 * @Author XuShen
 * @Date 2021/11/19 17:33
 */
public class test_05hiuwen {
    public static void main(String[] args) {
        String string = "babab";
//        System.out.println(longestPalindrome(string));
        System.out.println(string.substring(2));
        System.out.println(string.indexOf(2));
    }

    public static String longestPalindrome(String s) {

        for (int i = 0;i<s.length()-1;i++){
            String str = s.substring(i,s.length()+1);
            for (int j = 0;j<str.length()-1;j++){
                int m = j;
//                int n =
//                if (str.substring(j,j+1).equals(str.substring()))
            }
        }
        return "";
    }
}
