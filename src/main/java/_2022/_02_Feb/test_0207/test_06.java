package _2022._02_Feb.test_0207;

import _2021._11_November.test_1110.Person;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/7 18:25
 */
public class test_06 {
    public static void main(String[] args) {
        Person p = new Person();
        Class cla = p.getClass();
        System.out.println("cla = " + cla);
        Class cla1 = Person.class;
        System.out.println("cla1 = " + cla1);

    }
}
