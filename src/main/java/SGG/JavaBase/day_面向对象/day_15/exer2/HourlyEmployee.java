package SGG.JavaBase.day_面向对象.day_15.exer2;

/**
 * @Author: Leo messi
 * @Date: 2022/04/30/18:50
 * @Description:
 */


/**
 * 参照SalariedEmployee类定义HourlyEmployee类，实现按小时计算工资的
 * 员工处理。该类包括：
 * private成员变量wage和hour；
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值；
 * toString()方法输出员工类型信息及员工的name，number,birthday。
 */
public class HourlyEmployee extends Employee {
    private int wage;//每小时的工资
    private int hour;//月工作的小时数

    @Override
    public double earnings() {
        return wage * hour;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;
    }
}
