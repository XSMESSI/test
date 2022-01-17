package _2022._01_January.test_0117;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/17 19:04
 */
public class test_10 {
    public static void main(String[] args) {
        int random = new Random().nextInt(100);
        System.out.println(random);
        while (true){
            String s = method(random);
            System.out.println(s);
            if (s=="猜对了") {
                break;//设置出口
            }
        }

    }

    private static String method(int n) {
        String msg;
        int rows = new Scanner(System.in).nextInt();
        if (rows>n){
            msg = "猜大了";
        }else if (rows < n){
            msg = "猜小了";
        }else{
            msg = "猜对了";
        }

        return msg;

    }
}
