package _2022._03_March.test_0307;

import _2021._09_September.test_0917.People;
import common.message;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/3/7 20:17
 */
public class test_01 {
    public static void main(String[] args) {
        BigDecimal num = BigDecimal.valueOf(100);
        List<message>  list = new ArrayList<>();
        message temp = new message();
        temp.setCount(BigDecimal.valueOf(12));
        temp.setName("A");
        list.add(temp);
        message temp1 = new message();
        temp1.setCount(BigDecimal.valueOf(21));
        temp1.setName("B");
        list.add(temp1);
       message temp11 = list.stream().max(Comparator.comparing(message::getCount)).get();
        System.out.println("temp11 = " + temp11);

        BigDecimal sum = list.stream().map(message::getCount).reduce(num,BigDecimal::add);
        System.out.println("sum = " + sum);

    }
}
