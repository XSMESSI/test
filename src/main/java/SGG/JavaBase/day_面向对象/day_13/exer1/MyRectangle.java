package SGG.JavaBase.day_面向对象.day_13.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/02/8:23
 * @Description:
 */
public class MyRectangle extends GeometricObject{

    private double width;
    private double height;


    public MyRectangle(double width,double height,String color, double weight) {
        super(color, weight);
        this.width = width;
        this.weight = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea(){
        return width * height;
    }
}
