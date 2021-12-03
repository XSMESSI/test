package _2021._09_September.test_0929;

import java.sql.ClientInfoStatus;
import java.util.*;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/29 19:44
 */
public class test_03 {
    public static void main(String[] args) {
        String num = "00001.00200";
        char[] cahNum = num.toCharArray();

        for (int i = cahNum.length-1;i<=0;i--){
            if (cahNum[i] != '0'){
                System.out.println(i);
            }
        }





    }
}
