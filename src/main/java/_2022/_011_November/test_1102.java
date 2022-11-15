package _2022._011_November;

import common.json_list_str.People;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/2 16:04
 */
public class test_1102 {

    @Test
    public void test1(){
        List<People> list = new ArrayList<>();
        People temp = new People();
        temp.setName("A");
        temp.setAge(20);

        People temp1 = new People();
        temp1.setName("A");
        temp1.setAge(21);
        String  string = "num";

        list.add(temp);
        list.add(temp1);
        list = list.stream().sorted(Comparator.comparing(People::getAge).reversed()).collect(Collectors.toList());
        System.out.println("list = " + list);
        String value = list.toString();
        System.out.println("list.toString() = " + list.toString());

    }
}
