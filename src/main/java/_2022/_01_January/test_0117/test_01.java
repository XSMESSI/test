package _2022._01_January.test_0117;

import _2021._11_November.test_1110.Person;
import org.apache.naming.EjbRef;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/17 11:49
 */
public class test_01 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person temp1 = new Person();
        temp1.setId(1);
        temp1.setName("测试数据001");
        temp1.setAge("20");

        Person temp2 = new Person();
        temp2.setId(2);
        temp2.setName("测试数据002");
        temp2.setAge("");
    }
}
