package SGG.JavaBase.day_面向对象.day_11.java;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/11:51
 * @Description: 继承的学习；
 */
public class Student extends Person{
//
//    private String name;
//
//    private int age;

    String major;

    public Student(){

    }

    public Student(String name,int age,String major){
        this.name = name;
//        this.age = age;
        setAge(age);
        this.major = major;
    }

    	@Override
        public void eat(){
		System.out.println("吃饭");
	}

	public void sleep(){
		System.out.println("睡觉");
	}


	public void show(){
        System.out.println("学习");
    }
}
