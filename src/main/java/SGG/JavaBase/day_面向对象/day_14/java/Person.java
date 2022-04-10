package SGG.JavaBase.day_面向对象.day_14.java;

import java.util.Objects;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/17:46
 * @Description:
 */
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
