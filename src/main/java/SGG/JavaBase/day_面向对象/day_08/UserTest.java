package SGG.JavaBase.day_面向对象.day_08;

/**
 * @Author: Leo messi
 * @Date: 2022/02/02/10:11
 * @Description:
 */

/**
 * 类中属性的使用
 * 属性（成员变量） vs 局部变量
 *
 * 1.相同点：
 *        1.1定义变量的格式：数据类型 变量名 = 变量值
 *        1.2先声明，后使用
 *        1.3变量都有其对应的作用域
 *
 *
 * 2.不同点：
      2.1在类中声明的位置的不同
          属性：直接定义在类的一对{}内
         局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部变量
 *
 * 2.2关于权限修饰符的不同
 * 属性：可以在声明属性的时候，指明其属性，使用权限修饰符
 * 常用的权限修饰符：private,public,缺省(没写别的)，protected
 * 目前，大家声明属性时都使用缺省就行了
 *
 * 局部变量：不可以使用权限修饰符
 *
 * 2.3默认初始化值的情况：
 * 属性：类的属性，根据其类型，都有默认初始化值
 *      整型（byte，short，int，long）：0
 *      浮点型：（float，double）：0.0
 *      字符型（char）：0（或‘\u0000’）
 *      布尔型（boolean）:false;
 *      引用数据类型（类，数组，接口）：null
 *  局部变量：没有默认初始化值,意味着，我们在调用局部变量之前，一定要显式赋值
 *  特别的：形参在调用时，我们赋值即可
 *
 *  2.4在内存中加载的位置
 *  属性：加载到堆空间中（非static）
 *  局部变量：加载到栈空间
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.isMale);
        user.talk("日语");
        user.eat();

    }
}


class User{
    //属性（成员变量）
    String name;
    int age;
    boolean isMale;

    public void talk(String language){//language :形参
        System.out.println("我们使用"+language+"进行交流");
    }

    public void eat(){
        String food = "烙饼";//局部变量
        System.out.println("中国人喜欢吃:"+food);
    }


}