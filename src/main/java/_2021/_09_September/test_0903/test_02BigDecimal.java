package _2021._09_September.test_0903;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/3 13:53
 */
public class test_02BigDecimal {
    public static void main(String[] args) {

        BigDecimal[] numArr = new BigDecimal[10];
        for (int i = 1;i<=10;i++){
            numArr[i-1] = BigDecimal.valueOf(i);
        }
        int sum = 4+8;
        List<BigDecimal> alist = Arrays.asList(numArr);

        System.out.println(alist);
        //由数组转换过来的
        List<BigDecimal> newList = new ArrayList<>();
        newList.addAll(alist);
        newList.add(BigDecimal.valueOf(99));
        System.out.println(newList);
    }
}
