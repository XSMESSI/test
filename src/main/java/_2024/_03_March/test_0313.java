package _2024._03_March;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author Xu Shen
 * @Date 2024/3/13 15:45
 * @Version 1.0
 * @DESC :
 */
public class test_0313 {
    public static void main(String[] args) {


        List<User> list = new ArrayList<>();
        list.add(new User(1,"A"));
        list.add(new User(1,"B"));
        list.add(new User(2,"D"));
        list.add(new User(3,"E"));
        list.add(new User(4,"F"));

        Map<Integer,String> map = list.stream().collect(Collectors.toMap(User::getId,User::getName,(key1,key2) -> key1));
        System.out.println("输出信息");




    }
}
