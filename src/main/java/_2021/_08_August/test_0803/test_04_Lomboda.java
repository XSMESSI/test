package _2021._08_August.test_0803;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/8/3 16:15
 */

public class test_04_Lomboda {

    public static void main(String[] args) {

        List<Integer> lists = Arrays.asList(2, 3, 4, 5, 6, 1, 7, 8, 9);

        //第一种写法（未使用lambda表达式）
        List<Integer> newLists1 = lists.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return !integer.equals(1);
                    }
                })
                .limit(6)
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                }).map(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer list) {
                        Integer m = list;
                        if (list == 1) {
                            m = 10;
                        }
                        return m;
                    }
                }).collect(Collectors.toList());


        //第二种写法
        List<Integer> newLists2 = StreamSupport.stream(lists.spliterator(), false)
                .filter(x -> {
                    return !x.equals(1);
                })
                .limit(6)
                .sorted((o1, o2) -> {
                    return o2 - o1;
                })
                .map(list -> {
                    Integer m = list;
                    if (list == 1) {
                        m = 10;
                    }
                    return m;
                }).collect(Collectors.toList());


        //第三种写法
        List<Integer> newLists3 = lists.stream()
                .filter(x -> {
                    return !x.equals(1);
                })
                .limit(6)
                .sorted((o1, o2) -> {
                    return o2 - o1;
                })
                .map(list -> {
                    Integer m = list;
                    if (list == 1) {
                        m = 10;
                    }
                    return m;
                }).collect(Collectors.toList());

        System.out.println("newLists1:" + newLists1 + "\n" + "newLists2:" + newLists2 + "\n" + "newLists3:" + newLists3);


        //第四种写法
        StreamSupport.stream(lists.spliterator(), false)
                .filter(x -> {
                    return !x.equals(1);
                })
                .limit(6)
                .sorted((o1, o2) -> {
                    return o2 - o1;
                })
                .map(list -> {
                    Integer m = list;
                    if (list == 1) {
                        m = 10;
                    }
                    return m;
                }).collect(Collectors.toList()).forEach(System.out::println);
    }
}