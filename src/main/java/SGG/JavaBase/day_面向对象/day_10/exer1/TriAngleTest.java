package SGG.JavaBase.day_面向对象.day_10.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/03/13/16:25
 * @Description:
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println("base:"+t1.getBase()+",height:"+t1.getHeight());

        TriAngle t2 = new TriAngle(5.1,5.6);
        System.out.println("t2:"+t2.getBase()+","+t2.getHeight());


    }
}
