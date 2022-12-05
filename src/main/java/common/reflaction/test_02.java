package common.reflaction;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/11/16 9:03
 */
public class test_02 {

    //通过反射成功创建Student类的实例
    @Test
    public void test1(){
        //获取相关类的Class对象
        Class<?> c = Student.class;
        //使用newInstance()方法创建实例
        try {
            Student student = (Student) c.newInstance();
            System.out.println(student);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用反射获取实例对象中构造方法然后创建实例对象
     * 1.获取Class对象
     * 2.通过上述的方法获取构造器
     * 3.如果获取的是私有的构造方法，则需要记得通过构造器的setAccessible方法将访问权限开启。
     * 4.调用构造器中的newInstance方法获取对象。
     * @throws ClassNotFoundException
     */
    @Test
    public void test2() throws ClassNotFoundException {
        //1.获取Class对象
        Class<?> c = Class.forName("common.reflaction.Student");
        //2.获取指定参数列表的构造器,演示获取Student中的一个私有构造器,参数传形参列表类型
        try {
            Constructor<?> constructor = c.getDeclaredConstructor(String.class,int.class);
            //获取的私有构造方法,需要打开访问权限,默认关闭
            constructor.setAccessible(true);
            //3.根据获取到的构造器获取实例对象，使用newInstance方法，需要传入构造器需要的参数
            Student student = (Student) constructor.newInstance("张三",20);
            System.out.println(student);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过反射获取实例对象的属性
     *通过如下过程修改一个对象的私有属性
     * 1.获取Class对象
     * 2.创建或通过反射实例化一个需要修改其私有字段的类
     * 3.通过属性名,调用上述getDeclaredField方法获取对应的属性对象
     * 4.通过setAccessible方法设置为访问私有属性开权限
     * 5.通过Field对象的set方法,修改传入对象中的对应属性。
     */
    @Test
    public void test3() throws IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<?> c = Student.class;

        try {
            //2.通过反射创建实例对象
            Student student = (Student) c.newInstance();
            //3.获取私有属性name
            Field field = c.getDeclaredField("name");
            //4.给该私有属性开权限
            field.setAccessible(true);
            //5.修改该私有属性
            field.set(student,"被反射修改的私有属性");
            System.out.println(student);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过反射获取实例对象的方法
     * 通过如下过程获取Student对象中的私有方法function:
     * 1.获取相关Student类的Class对象
     * 2.创建或通过反射实例化一个Student
     * 3.通过class对象获取到实例对象中的方法对象,参数为方法名,形参为类型列表
     * 4.为获取的私有方法开访问权限
     * 5.通过invork方法调用方法
     */
    @Test
    public void test4(){

    }
}
