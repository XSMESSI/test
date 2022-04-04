package SGG.JavaBase.day_面向对象.day_13.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/02/8:28
 * @Description:
 */

/**
 * 定义三个类，父类GeometricObject代表几何形状，子类Circle代表圆形，MyRectangle代表矩形。
 * 定义一个测试类GeometricTest，编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
 * 数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
 * 数类型，利用动态绑定技术）。
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle(2.3,"white",1.0);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3,"white",1.0);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1,c2);
        System.out.println("是否相等"+isEquals);


        MyRectangle rect = new MyRectangle(2.1,3.4,"RED",1);
        test.displayGeometricObject(rect);
    }

    /**
     * 测试两个对象面积是否相等
     * @param o1
     * @param o2
     * @return
     */
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为:" + o.findArea());
    }
}
