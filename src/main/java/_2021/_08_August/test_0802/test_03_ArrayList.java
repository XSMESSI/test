package _2021._08_August.test_0802;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/2 16:43
 */
public class test_03_ArrayList {
    public static void main(String[] args) {

        String[] str = {"ssd","ss","pp","rr","yy","dd"};

        System.out.println(Arrays.toString(str));


        List<String> list = Arrays.asList(str);//数组转换成结合
        System.out.println(list);

        System.out.println("利用这种循环方式，输出的是数组的");
        for (String i : str) {
            System.out.print(i+" ");
        }
        System.out.println();

        //利用这种方式，输出的是list集合的
        System.out.println("利用这种方式，输出的是list集合的");
        for (String a : list){
            System.out.print(a+" ");
        }
    }
}
