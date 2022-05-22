package com.atguigu.team.domain;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/19:47
 * @Description:
 */
public class Designer extends Programmer{

    private double bonus;//奖金

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "设计师{" +getStatus()+
                "bonus=" + bonus + getEquipment() +
                '}';
    }

    @Override
    public String getDetailsFrom(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t"
                + getAge() + "\t" + getSalary() +"\t设计师\t" +bonus ;
    }
}
