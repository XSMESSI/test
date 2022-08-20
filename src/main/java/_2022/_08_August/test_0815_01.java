package _2022._08_August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/8/15 17:04
 */
public class test_0815_01 {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1,2,6);
        List<Test> list = new ArrayList<>(Arrays.asList(new Test(1,2),new Test(2,4)));

        //lambda表达式实现
        Integer sum = intList.stream().reduce(0,(current,number) -> current + number);


    }


}
