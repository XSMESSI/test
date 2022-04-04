package SGG.JavaBase.day_面向对象.day_13.exer3;

import java.util.Objects;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/13:49
 * @Description:
 */
public class Circle extends GeometricObject{

    private double radius;

    public Circle() {
        super();
        radius = 1.0;
        //冗余
//        color = "white";
//        weight = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Circle){
            Circle c = (Circle) o;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
