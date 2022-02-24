package _2022._02_Feb.test_0223;

import _2021._11_November.test_1110.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/23 18:44
 */
public class test_02 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person temp1 = new Person();
        temp1.setId(1);
        temp1.setName("A");
        temp1.setAge("30");
        list.add(temp1);
        Person temp2 = new Person();
        temp2.setId(2);
        temp2.setName("BB");
        temp2.setAge("100");
        list.add(temp2);


        System.out.println("list = " + list);

        //把符合删除条件的数据删除
        list.removeIf(o->o.getId().equals(1));
        System.out.println("过滤之后list = " + list);
    }
}
