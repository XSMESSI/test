package SGG.JavaBase.day_面向对象.day_11.java;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/11:51
 * @Description:
 */
public class Person extends Creature{

    String name;
    int age;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
    }

    private void sleep(){
        System.out.println("睡觉");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
