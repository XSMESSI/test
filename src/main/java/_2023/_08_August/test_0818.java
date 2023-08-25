package _2023._08_August;

import common.json_list_str.People;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author xu Shen
 * @version 1.0
 * @description
 * @date 2023/8/18 10:08
 */

public class test_0818 {

    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
        people.add(new People(1,"A",20));
        people.add(new People(2,"A",10));
        people.add(new People(3,"A",2));
        people.add(new People(1,"A",5));
        System.out.println(">>>>>>>>>>>打印原始");
        people.forEach(System.out::println);
        people = people.stream().filter(o-> Objects.equals(o.getId(),1)).collect(Collectors.toList());
        System.out.println(">>>>>>打印过滤");
        people.forEach(System.out::println);

        people.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
        System.out.println(">>>>>>>>>>打印排序");
        people.forEach(System.out::println);
    }
}
