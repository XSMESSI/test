package _2023._02_Feb;

import common.json_list_str.People;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2023/2/6 15:13
 */
public class test_0206 {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        People temp1 = new People();
        temp1.setId(1);
        temp1.setName("数据1");
        temp1.setAge(20);
        list.add(temp1);

        People temp2 = new People();
        temp2.setId(2);
        temp2.setName("数据2");
        temp2.setAge(10);
        list.add(temp2);

        People temp3 = new People();
        temp3.setId(3);
        temp3.setName("数据3");
        temp3.setAge(15);
        list.add(temp3);


        People temp4 = new People();
        temp4.setId(3);
        temp4.setName("数据4");
        temp4.setAge(10);
        list.add(temp4);

        for (People people : list) {
            System.out.println("排序之前" + list.indexOf(people) + " " + people);
        }

        System.out.println(">>>>>>>>>>");

        //根据id字段进行升序，age字段进行降序排序集合数据
        list.sort(Comparator.comparing(People::getId,Comparator.naturalOrder()).thenComparing(People::getAge,Comparator.reverseOrder()));

        for (People people : list) {
            System.out.println("排序之后" + list.indexOf(people) + " " + people);
        }

    }
}
