package SGG.JavaBase.day_面向对象.day_15.exer3;

/**
 * @Author: Leo messi
 * @Date: 2022/05/01/21:05
 * @Description:
 */

/**
 * 定义一个Circle类，声明redius属性，提供getter和setter方法
 */
public class Circle {

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
