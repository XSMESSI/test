package _2022._01_January.test_0112;

import _2021._11_November.test_1110.Person;

import java.util.*;

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
        List<String> list = Arrays.asList("1","2","3");
        map.put("2",list);
        List<String> list1 = (List<String>) map.get("2");

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

    }
}
