package common.reflaction;

/**
 * @Description 获取对应类的Class对象
 * @Author XuShen
 * @Date 2022/11/14 14:34
 */
public class test_01 {
    public static void main(String[] args) {
        //有3种方式可以获取Class对象
        //1.通过对象的getClass()方法
        Student student1 = new Student();
        Class<?> c1 = student1.getClass();

        //2.通过类名.class获取
        Class<?> c2 = Student.class;
        //3.forName("路径")
        Class<?> c3 = null;
        try {
            c3 = Class.forName("common.reflaction.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
    }
}
