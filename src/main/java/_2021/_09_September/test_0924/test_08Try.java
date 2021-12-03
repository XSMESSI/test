package _2021._09_September.test_0924;

import java.util.Scanner;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/24 17:33
 */
public class test_08Try {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        /**
         * cin.next():其中不能包含空格
         * cin.nextLine():其中可以包含空格；
         */
        String str = cin.nextLine();
        int numDx = 0;
        int numXx = 0;
        int numCount = 0;
        int other = 0;
        char[] charArray = str.toCharArray();

        for (int i = 0;i<charArray.length;i++){
            if (charArray[i] >= '0' && charArray[i]<='9'){
                numCount++;
            }else if (charArray[i] >= 'a' && charArray[i] <= 'z'){
                numXx++;
            }else if (charArray[i] >= 'A' && charArray[i] <= 'Z'){
                numDx++;
            }else{
                other++;
            }
        }
        System.out.println(str+"中有数字："+numCount+"个");
        System.out.println(str+"中大写字母"+numDx+"个");
        System.out.println(str+"中小写字母"+numXx+"个");
        System.out.println(str+"中其他字符"+other+"个");
    }
}
