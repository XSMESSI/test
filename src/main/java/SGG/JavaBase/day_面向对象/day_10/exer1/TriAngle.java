package SGG.JavaBase.day_面向对象.day_10.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/03/13/16:21
 * @Description:
 */

/**
 *  * 编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，同时声明公共方法访问私有变量。
 *  * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */

public class TriAngle { //angle:角，

    private double base;

    private double height;

    public TriAngle(){

    }

    public TriAngle(double b,double h){
        base = b;
        height = h;
    }

    public void setBase(double b){
        base = b;
    }

    public double getBase(){
        return base;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }




}
