package SGG.JavaBase.day_面向对象.day_12.exer;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/21:51
 * @Description:
 */
public class KidsTest {
    public static void main(String[] args) {


        Kids someKid = new Kids(12);
        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employeed();
        someKid.manOrWoman();
    }
}
