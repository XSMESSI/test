package _2023._01_January;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 类型转换数据
 * @Author XuShen
 * @Date 2023/1/12 10:02
 */
public class test_0112 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        for (Integer anInt : ints) {
            System.out.println("ints.indexOf(anInt) = " + ints.indexOf(anInt));
        }

        List<String> strings = ints.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println("strings = " + strings);
        System.out.println("strings.indexOf(\"3\") = " + strings.indexOf("3"));


        List<Long> longs = strings.stream().map(Long::valueOf).collect(Collectors.toList());


        List<Integer> integers = JSONArray.parseArray(longs.toString(),Integer.class);
        System.out.println("integers = " + integers);


    }
}
