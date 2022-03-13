package SGG.JavaBase.day_面向对象.day_10.exer;

/**
 * @Author: Leo messi
 * @Date: 2022/03/12/16:40
 * @Description:
 */

/**
 *  2.练习2：
 *  *  * 2.1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属性初始值都为18。
 *  *  * 2.2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person a1 = new Person();
//        a1.age = 1;
//        a1.setAge(12);

        System.out.println("年龄为："+a1.getAge());

        //get和set分开写
//        a1.doAge(122);

        Person p2 = new Person("Tom",21);
        System.out.println(p2.getName()+","+p2.getAge());

    }

}
