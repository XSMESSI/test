package _2022._02_Feb.test_0228;

import _2021._11_November.test_1110.Person;

import java.io.Serializable;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/2/8 11:20
 */
public class SerPerson implements Serializable {

    private String name;

    private String age;

    public SerPerson(){
        System.out.println("调用SerPerson的无参构造函数");
    }

    public SerPerson(String name,String age){
        this.name = name;
        this.age = age;
        System.out.println("调用SerPerson的有参构造函数");
    }

    @Override
    public String toString(){
        return "Person{'name'}" + name +",'age' :"+age+"}";
    }
}
