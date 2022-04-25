package SGG.JavaBase.day_面向对象.day_15.exer;

/**
 * @Author: Leo messi
 * @Date: 2022/04/02/8:21
 * @Description:
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea(){
        return 3.14 * radius * radius;
    }
}
