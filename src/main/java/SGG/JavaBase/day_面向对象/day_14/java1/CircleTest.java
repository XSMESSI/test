package SGG.JavaBase.day_面向对象.day_14.java1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/05/17:54
 * @Description://static关键字的应用
 */


public class CircleTest {
    public static void main(String[] args) {
        Circle c1 =  new Circle();
        Circle c2 =  new Circle();
        Circle c3 =  new Circle(3.4);

        System.out.println("c1  "+c1.getId());
        System.out.println("c2  "+c2.getId());
        System.out.println("c3  "+c3.getId());

        System.out.println("创建的圆的个数：" + Circle.getTotal());





    }



}

class Circle{
    private double radius;

    private int id;//自动赋值

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
//        id = init++;
//        total++;
        this.radius = radius;

    }

    private static int total;//记录创建圆的个数
    private static int init = 1001;//static声明的属性被所有对象共享

    public double finArea(){
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle.total = total;
    }
}
