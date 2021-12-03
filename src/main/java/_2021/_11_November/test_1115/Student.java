package _2021._11_November.test_1115;

import lombok.Data;

/**
 * @author mazhen
 * @className Student
 * @Description 学生类
 * @date 2020/11/9 15:20
 */
@Data
public class Student {

    private Integer id;
    private String name;
    private int age;

    public Student(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

