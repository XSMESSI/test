package sggJavaBase.day_面向对象.day_08;

/**
 * @Author: Leo messi
 * @Date: 2022/02/03/14:25
 * @Description:
 */
public class Person {

    String name;
    int age;
    /**
     * sex:1：男性 0：女性
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age = "+age);
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
