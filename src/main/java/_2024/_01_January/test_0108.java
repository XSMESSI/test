package _2024._01_January;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author Xu Shen
 * @Date 2024/1/8 16:00
 * @Version 1.0
 * @DESC :
 */
public class test_0108 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 使用 Lists.partition 将偶数和奇数分开
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<List<Integer>> partitioned = Lists.partition(numbers, numbers.size());

        System.out.println("偶数列表： " + partitioned.get(0));
        System.out.println("奇数列表： " + partitioned.get(1));
    }
}
