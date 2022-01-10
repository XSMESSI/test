package _2021._07_July.test_0719;

import java.util.Arrays;
import java.util.Scanner;

public class _0719test1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int arr[] = new int[]{3,87,77,23,45,23,12,23,99};
        String arr1[] = new String[]{"a","b","A","R"};
        String arr2[] = new String[]{"a","b","A","R"};

        Arrays.sort(arr);//数字排序
        Arrays.sort(arr1);//字母排序
        Arrays.sort(arr2,String.CASE_INSENSITIVE_ORDER);
        String arr2_1 = Arrays.toString(arr2);//数组中的内容打印出来，不用循环方法
        System.out.println("arr排序");
        for (int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[arr.length-1]);
        System.out.println("arr1排序");
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("arr2排序--");
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println(arr2_1);

        /**
         * Integer.paresInt方法使用
         */
        System.out.println("Integer.paresInt方法使用");
        String a = "3";
        System.out.println(a+1);
        int a1 = Integer.parseInt(a);
        int a2 = Integer.valueOf("2");
        System.out.println(a1+1);
        System.out.println("a2 = " + a2);


    }
}
