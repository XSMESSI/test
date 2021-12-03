package Leetcode.letBook._01ArrayAndString;

/**
 * @Description  最长公共前缀输出
 * @Author XuShen
 * @Date 2021/11/19 16:00
 */
public class test_04StringLongBefore {
    public static void main(String[] args) {
        String[] strs = {"messi","messiLeo","messiLeoBarce"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int min = strs[0].length();
        int a = 0;
        for (int i = 0;i<strs.length;i++){
            if (strs[i].length()<=min){
                min = strs[i].length();
                a=i;
            }
        }
        String staString = strs[a];
        int m;
        for (int i  = staString.length();i>=0;i--){
            int num = 0;
            for (int j = 0;j<strs.length;j++){
                if (staString.substring(0,i).equals(strs[j].substring(0,i))){
                    num++;
                }
            }
            if (num == strs.length){
                m = i;
                result = staString.substring(0,m);
                break;
            }
        }
        return result;
    }

}
