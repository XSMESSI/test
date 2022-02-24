package sggJavaBase.day_面向对象.day_09;

/**
 * @Author: Leo messi
 * @Date: 2022/02/04/15:12
 * @Description:
 */

import common.mySelf.LeoException;

/**
 * 理解“万事万物皆对象”
 * 1.在JAVA语言范畴中，我们都将功能，结构等封装到类中，通过类的实例化，来调用具体的功能结构
 * 》》》Scanner,String等
 * 》文件路径;File
 * 网络地址：URL
 * 2.涉及到Java语言与前端Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类，对象
 * 3
 *
 * 三，内存解析说明：
 * 1.引用类型的变量，只能存储两类值，null或地址值（含变量的类型）
 * 2.
 *
 *
 * 三，匿名对象的使用：
 * 1.理解：我们创建的对象没有显式的赋给一个变量名，即为匿名对象
 * 2.特征，匿名对象只会调用一次
 *
 *
 */
public class InstanceTest {
    public static void main(String[] args)  {
        Phone p = new Phone();
        System.out.println(p);
        p.sendEmail();
        p.playGame();

        //匿名
        System.out.println("匿名对象输出");
        new Phone().playGame();
        new Phone().sendEmail();

        new Phone().price = 1999;
        new Phone().showPrice();

        //**********
        PhoneMall mall = new PhoneMall();
        //匿名对象的使用
        mall.show(new Phone());
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone{
    //价格
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("打游戏");
    }

    public void showPrice(){
        System.out.println(price);
    }
}
