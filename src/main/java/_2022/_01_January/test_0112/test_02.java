package _2022._01_January.test_0112;

import _2021._11_November.test_1110.Person;
import io.swagger.models.auth.In;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/12 13:42
 */
public class test_02 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("1",2);
        Integer num1 = (Integer) map.get("1");
        System.out.println("num1 = " + num1);
        List<String> list = Arrays.asList("1","2","3");
        map.put("2",list);
        List<String> list1 = (List<String>) map.get("2");
        System.out.println("list1 = " + list1);

        List<Person> personList = new ArrayList<>();
        Person temp = new Person();
        temp.setId(1);
        temp.setName("测试数据");
        temp.setAge("20");
        personList.add(temp);

        Person temp1 = new Person();
        temp1.setId(2);
        temp1.setName("chsi数据");
        temp1.setAge("30");
        personList.add(temp1);
        map.put("3",personList);

        List<Person> list3 = (List<Person>) map.get("3");
        System.out.println(list3);
        //字符串数字转换为整数
        List<Person> list4 = list3.stream().filter(o-> Integer.valueOf(o.getAge()) <=20).collect(Collectors.toList());
        System.out.println("list4 = " + list4);

    }
}
