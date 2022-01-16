package _2022._01_January.test_0116;

import _2021._11_November.test_1110.Person;

/**
 * @Description
 * @Auther xuShen
 * @Date 2022-01-16 16:58
 */
public class test_01 {
    public static void main(String[] args) {
        //判断一个对象是不是某个类的实例
        Person obj = new Person();
        boolean result = obj instanceof Person;
        System.out.println("result = " + result);

        Integer i = 0;
        System.out.println(i instanceof Integer);

        System.out.println(null instanceof Object);

        System.out.println(obj instanceof Object);


    }
}
