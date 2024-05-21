package SGG.JavaBase.day_面向对象.day_12.exer;

/**
 * @Author: Leo messi
 * @Date: 2022/03/26/21:45
 * @Description:
 */

/**
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值。
 */
public class Kids extends ManKind{

    private int yearsOld;

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("我今年"+yearsOld);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    /**
     * 如果现在父类的一个方法定义成private访问权限，在子类中将此方
     * 法声明为default访问权限，那么这样还叫重写吗？(NO)
     * 2. 修改练习1.2中定义的类Kids，在Kids中重新定义employeed()方
     * 法，覆盖父类ManKind中定义的employeed()方法，输出“Kids
     * should study and no job.
     */
    @Override
    public void employeed(){
        System.out.println("kids should study and no job");
    }

}
