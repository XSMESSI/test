package SGG.JavaBase.day_面向对象.day_16.java2;

/**
 * @Author: Leo messi
 * @Date: 2022/05/14/21:12
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.regist(-1001);
            System.out.println("s = " + s);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("输入的数据非法");
        }
    }
}

class Student{

    private int id;

    public void regist(int id){
        if (id > 0){
            this.id = id;
        }else{
//            System.out.println("您输入的数据非法");
            //手动抛出异常对象
//            throw new RuntimeException("您输入的数据非法");
            throw new MyException("不能输入负数");
//            throw new Exception("您输入的数据非法");
        }
    }
}
