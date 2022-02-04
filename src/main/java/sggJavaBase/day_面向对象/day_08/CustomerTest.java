package sggJavaBase.day_面向对象.day_08;

/**
 * @Author: Leo messi
 * @Date: 2022/02/02/11:05
 * @Description:
 */

/**
 * 类中方法的声明和使用：
 * 比如;Math类：sqrt（）、random()
 * Scanner类：nextXXX()
 * Arrays类：sort()\binarySearch()\toString
 *
 * 1.举例：
 * 方法的相关定义
 *
 * 2.方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
 *     方法体
 * }
 *static,final,abstract,来修饰的方法，后面再讲
 *
 * 3.说明：
 *      3.1关于权限修饰符：默认权限修饰符都使用public
 *           Java规定的权限修饰符：private，public，缺省，protected...封装性再细说
 *      3.2返回值类型：有返回值， vs 没有返回值
 *          3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型，同时，方法中，需要使用
 *          return关键字来返回指定类型的变量或常量；
 *          如果方法没有返回值，则声明方法时，使用void表示。通常没有返回值的方法中，就不使用return，但是，如果使用的话
 *          ，只能“retun；”表示结束此方法的意思；
 *          3.2.2我们在定义方法，该不该有返回值；
 *               1.题目要求
 *               2.凭经验：具体问题具体分析
 *      3.3方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 *      
 *      3.4形参列表：方法可以声明0个，1个，或多个形参
 *          3.4.1.格式：数据类型1 形参1，数据类型2 形参2 ，......
 *          3.4.2 我们定义方法时，该不该定义形参？
 *                1.题目要求
 *                2.凭经验：具体问题具体分析
 *
 *       3.5方法体：方法功能的体现

 *4.return关键字的使用：
 * 1.使用范围：使用在方法中
 * 2.作用：1，结束方法
 *        2.针对于有返回值类型的方法，使用“return 数据”方法
 *  3.注意点：renturn关键字后面不可以声明执行语句
 *
 *  5.方法的使用中，可以调用当前类的属性或方法
 *     特殊的：方法A中又调用了方法A：递归方法
 *     方法中，不可以定义方法
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        cus1.eat();
        
        int[] arr = new int[]{1,2,3,4,5};
        cus1.sort(arr);
        cus1.sleep(8);
    }
}


class Customer{


    //属性
    String name;
    int age;
    boolean isMale;

    //方法:方法的声明，方法体的使用
    public void  eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("休息了"+hour+"个小时");
        eat();
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){//形参
        String info = "我的国籍是"+nation;
        return info;
    }
    
    public void sort(int[] arr){
        
    }
}
