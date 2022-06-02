package SGG.JavaBase.day_面向对象.day_13.java;

import lombok.Data;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/17:46
 * @Description:
 */
@Data
public class Person {
    String name;
    int age;

    int id = 1001;

    public void eat(){
        System.out.println("人：吃饭");
    }

    public void walk(){
        System.out.println("人：走路");
    }

    public Person() {
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


}
