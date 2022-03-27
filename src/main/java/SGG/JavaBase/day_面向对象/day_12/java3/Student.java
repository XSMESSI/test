package SGG.JavaBase.day_面向对象.day_12.java3;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/10:11
 * @Description:
 */
public class Student extends Person{

    String major;

    int id = 1002;//学号

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major) {
//        this.name = name;
//        this.age = age;
        //调用构造器
        super(name, age);
        this.major = major;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void walk(){
        System.out.println("走路"+"公里");
    }

    public void study(){
        System.out.println("学生学习");
        eat();
        super.eat();
        super.walk();
    }

    public void show(){
        System.out.println("学生姓名" + this.name + super.age);
        System.out.println("子类的"+id);
        System.out.println("父类的"+super.id);
    }

    @Override
    public String info(){
        return null;
    }

//    public int info1(){
//        return 1;
//    }
}
