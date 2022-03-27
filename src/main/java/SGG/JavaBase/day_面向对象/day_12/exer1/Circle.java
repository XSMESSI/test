package SGG.JavaBase.day_面向对象.day_12.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/21:59
 * @Description:
 */

/**
 * 在CylinderTest类中创建Cylinder类的对象，设置圆
 * 柱的底面半径和高，并输出圆柱的体积。
 */
public class Circle {

    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //返回圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
