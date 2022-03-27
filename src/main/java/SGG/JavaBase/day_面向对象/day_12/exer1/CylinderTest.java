package SGG.JavaBase.day_面向对象.day_12.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/22:04
 * @Description:
 */
public class CylinderTest {
    public static void main(String[] args) {


        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);

        double volume = cy.findVolume();
        System.out.println("圆柱的体积+" + volume);

        double area = cy.findArea();
        System.out.println("底面圆的面积" + area);

        //重写findArea(){}
        double area1 = cy.findArea();
        System.out.println("圆柱的表面积"+area1);


    }
}
