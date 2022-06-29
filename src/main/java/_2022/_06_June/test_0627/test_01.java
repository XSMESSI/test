package _2022._06_June.test_0627;

import _2021._11_November.test_1110.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/6/27 12:43
 */
public class test_01 {
    public static void main(String[] args) throws ClassNotFoundException {
//        Person
        //获取对象
        Class clazz = Class.forName("_2021._11_November.test_1110.Person");
        //获取Person类的所有方法信息
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m:methods){
            System.out.println(m.toString());
        }

        //获取Person类的所有成员属性信息
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.toString());
        }


        //获取Person类的所有构造方法信息
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.toString());
        }


    }
}
