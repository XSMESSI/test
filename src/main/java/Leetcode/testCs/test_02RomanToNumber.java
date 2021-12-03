package Leetcode.testCs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 罗马数转换为数字
 * @Author XuShen
 * @Date 2021/12/3 16:51
 */
public class test_02RomanToNumber {
    public static void main(String[] args) {

//        String[] arr = romanToInt("IXV");
//        for (int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        System.out.println(romanToInt("IV"));
    }

    /**
     * 官方解答方式：
     *
     * @param s
     * @return
     */

    public static int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }


    /**
     * 考虑过于
     * @param s
     */
    public static void romanToInt1(String s) {
        char[] roman = {'I','V','X','L','C','D','M'};
        int[] romanNum = {1,5,10,50,100,500,1000};
        String[] tax = {"IV","IX","XL","XC","CD","CM"};
        List<String> taxList = Arrays.asList(tax);
        int[] taxNum = {4,9,40,90,400,900};
        String[] arr = new String[s.length()];
        for (int i = 0;i<s.length();i++){
            arr[i] = s.substring(i,i+1);
        }

        String[] arr1 = new String[arr.length-1];
        for (int i = 0;i<arr1.length;i++){
            arr1[i] = arr[i]+arr[i+1];
        }
        List<String> list = new ArrayList<>();
        for (int i = 0;i<arr1.length;i++){
            if (taxList.contains(arr1[i])){
                list.add(arr1[i]);
            }
        }

        System.out.println(list);
//        return arr1;
    }
}
