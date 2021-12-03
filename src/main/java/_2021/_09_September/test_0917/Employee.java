package _2021._09_September.test_0917;

import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2021/9/17 11:08
 */
@Data
public class Employee {

    /**
     * id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 状态
     */
    private String state;

    public Employee(int id, String name, int age, String state) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.state = state;
    }
}
