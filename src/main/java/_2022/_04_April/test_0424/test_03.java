package _2022._04_April.test_0424;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: Leo messi
 * @Date: 2022/04/25/19:40
 * @Description:
 */
public class test_03 {
    public static void main(String[] args) {
        List<String> list = ImmutableList.of("leo","messi");
        System.out.println("list = " + list);

        //Stream 遍历
        list.forEach(System.out::println);
        //遍历数据
        list.stream().forEach(System.out::println);
    }
}
