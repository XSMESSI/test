package SGG.JavaBase.day_面向对象.day_11.java;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/12:04
 * @Description:
 */

/**
 * 面向对象的特征之二：继承性： why?
 *
 * 1.减少了代码的冗余，提高了代码的复用性
 * 2.便于功能的扩展
 * 3.为之后的多态性的使用，提供了前提；
 *
 *
 * 二、继承性的格式：class A extends B{}
 *
 *      A:子类，派生类，subclass
 *      B。.父类，超类，基类，superclass
 *
 *      1.体现，一旦子类A继承了父类B之后，子类A中就获取了父类B中声明的结构：属性和方法
 *      特别的：父类中声明为private的属性和方法，子类继承父类之后，仍然可以获取了父类中私有的结构
 *      只是因为封装性的原因，使得子类不能直接调用父类的结构而已
 *      2.子类继承父类之后，还可以声明自己特有的属性和方法：实现功能的拓展
 *      子类和父类的关系，不同于子集和集合的关系
 *      extends:延伸，扩展；
*  三。Java中关于继承性的规定
 *      1.一个类可以被多个子类继承；
 *      2.Java中类的单继承性，一个类只能有一个父类，
 *      3，子父类是相对的概念
 *      4.子类直接继承的父类，称为直接父类。间接继承的父类为：间接父类；
 *      5.子类继承父类之后，就获取了直接父类以及所有间接父类中的声明的属性和方法
 *
 * 四。如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
 * 2.所有的java类（除Java。lang.Object类之外）都直接或间接的继承于java.lang.Object类
 * 3.意味着：所有的java类具有java.lang。Object类声明的功能；
 *
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.getAge();
        s1.eat();
        s1.sleep();
        s1.breath();

        Creature c = new Creature();
        c.getClass();

    }
}
