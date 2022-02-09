package _2022._02_Feb.test_0207;

import _2021._11_November.test_1110.Person;

/**
 * @Description java反射创建对象，
 * @Author XuShen
 * @Date 2022/2/7 17:12
 */
public class test_04 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<Person> person = Person.class;
        Person per = person.newInstance();
        per.setAge("20");
        per.setName("java反射创建对象测试用例");
        per.setId(222);
        System.out.println("per = " + per);
    }
}
