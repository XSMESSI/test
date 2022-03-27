package SGG.JavaBase.day_面向对象.day_12.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/22:29
 * @Description:
 */
public class Student extends Person{

    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;

    }

    public void study(){
        System.out.println("学习"+major+"专业");
    }

    //对父类中的eat()进行重写
    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){
        System.out.println("我是一个学生");
    }

    @Override
    public String info(){
        return null;
    }

//    public int info1(){
//        return 1;
//    }
}
