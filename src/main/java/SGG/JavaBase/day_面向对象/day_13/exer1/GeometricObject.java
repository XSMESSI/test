package SGG.JavaBase.day_面向对象.day_13.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/02/8:14
 * @Description:
 */
public class GeometricObject {

    protected String color;

    protected double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
