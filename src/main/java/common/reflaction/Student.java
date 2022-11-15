package common.reflaction;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/15 17:39
 */
public class Student{

    /**
     * 私有属性name
     */
    private String name = "rong";

    /**
     * 公有属性age
     */
    public int age = 18;

    /**
     * 不带参数的构造方法
     */
    public Student(){
        System.out.println("Student()");
    }

    /**
     * 带两个参数的构造方法
     * @param name
     * @param age
     */
    private Student(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String,name)");
    }

    private void eat(){
        System.out.println("i am eating");
    }

    public void sleep(){
        System.out.println("i am sleeping");
    }

    private void function(String str) {
        System.out.println("私有方法function被调用:"+str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

