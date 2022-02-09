package _2022._02_Feb.test_0207;

import _2021._11_November.test_1110.Person;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 获取类中的属性
 * @Author XuShen
 * @Date 2022/2/7 18:08
 */
public class test_05 {
    public static void main(String[] args) {
        Class<Person> claSon = Person.class;
        Field[] fields = claSon.getDeclaredFields();
        List<Field> list = Arrays.asList(fields);
        System.out.println("list = " + list);
    }
}
