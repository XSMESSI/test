package _2021._11_November.test111001;

import lombok.Data;

/**
 * @author mazhen
 * @className Student
 * @Description 学生类
 * @date 2020/11/9 15:20
 */
@Data
public class Student {

    private Long id;
    private String name;
    private int age;
    private Long classId;
    private String className;
    private String master;

    public Student(Long id, String name, int age, Long classId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classId=" + classId +
                ", className='" + className + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}

