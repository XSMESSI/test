package _2022._01_January.test_0105;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/5 9:51
 */
@Data
public class Person {

    private String name;

    private Integer age;

    private String message;


    public Person(String name, int age, String message) {
        this.name =name;
        this.age = age;
        this.message = message;
    }
}
