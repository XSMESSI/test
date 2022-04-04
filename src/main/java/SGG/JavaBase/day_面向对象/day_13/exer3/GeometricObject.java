package SGG.JavaBase.day_面向对象.day_13.exer3;

/**
 * @Author: Leo messi
 * @Date: 2022/04/04/13:47
 * @Description:
 */
public class GeometricObject {

    protected String color;

    protected double weight;

    public GeometricObject() {
        super();
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

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
}
