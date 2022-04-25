package SGG.JavaBase.day_面向对象.day_15.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/17/12:10
 * @Description:
 */


/**
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类
 * 中提供必要的方法进行属性访问。
 */
public class EmployeeTest {
    public static void main(String[] args) {

        //多态的使用
        Employee manger = new Manger("库克",1001,5000,50000);
        manger.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
