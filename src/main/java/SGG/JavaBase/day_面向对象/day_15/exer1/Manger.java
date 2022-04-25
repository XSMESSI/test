package SGG.JavaBase.day_面向对象.day_15.exer1;

/**
 * @Author: Leo messi
 * @Date: 2022/04/17/11:49
 * @Description:
 */

/**
 * 对于Manger类来说，他既是员工，还具有奖金（bonus）的属性
 */
public class Manger extends Employee{
    private double bonus; //奖金

    public Manger(double bonus) {
        this.bonus = bonus;
    }

    public Manger(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行的效率");
    }
}
