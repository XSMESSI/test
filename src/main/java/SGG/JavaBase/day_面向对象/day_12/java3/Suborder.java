package SGG.JavaBase.day_面向对象.day_12.java3;

import SGG.JavaBase.day_面向对象.day_12.java2.Order;

/**
 * @Author: Leo messi
 * @Date: 2022/03/27/9:46
 * @Description:
 */
public class Suborder extends Order {

    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性和方法
//        private和default都不能调用
    }
}
