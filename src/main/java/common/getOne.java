package common;

/**
 * @Description 根据多个字段进行去重操作
 * @Author XuShen
 * @Date 2022/6/2 17:07
 */

import SGG.JavaBase.day_面向对象.day_13.java.Person;
import _2021._09_September.test_0917.People;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class getOne {

    public static void main(String[] args) {
        List<Person> lists =new ArrayList<>();
        Person user1=new Person("张三",18,2);
        Person user2=new Person("李四",19,3);
        Person user3=new Person("李四",19,3);
        Person user4=new Person("小花",11,6);
        Person user5=new Person("张三",18,2);
        lists.add(user1);
        lists.add(user2);
        lists.add(user3);
        lists.add(user4);
        lists.add(user5);
        lists = lists.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getName() + "#" + o.getId() + "#" + o.getAge()))), ArrayList::new));

        for (Person user:lists){
            System.out.println(user);
        }
    }

}
