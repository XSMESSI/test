package SGG.JavaBase.day_面向对象.day_12.java3;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/22:29
 * @Description:
 */
public class Person {

    String name;

    int age;

    int id = 1001;//身份号

    public Person() {
        System.out.println("我无处不在");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void walk(){
        System.out.println("走路"+"公里");
        show();
    }

    private void show(){
        System.out.println("我是一个人");
    }

    public Object info(){
        return null;
    }

//    public double info1(){
//        return 1;
//    }
}
