package _2022._10_October;

import org.omg.CORBA.INTERNAL;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/10/14 9:51
 */
public class test_1014_01 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        System.out.println(data);
        List<Integer> list = Arrays.asList(1,2,3);
        Integer num = 4;
//        System.out.println(list.indexOf(1));

        Integer size = 5;
        double floader = 0.75;
        double numss = size/floader;
//        System.out.println(numss);
        Integer capacity = (int) Math.ceil(numss);
//        System.out.println(capacity);


        Integer result = initMapCapacity(10);
        System.out.println(result);

    }

    private static Integer initMapCapacity(Integer num) {
        Integer number = 16;
        try {
            double count = num/0.75;
            number = (int) Math.ceil(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return number;
        }
    }
}
