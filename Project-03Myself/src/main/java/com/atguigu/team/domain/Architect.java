package com.atguigu.team.domain;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/21:55
 * @Description:
 */
public class Architect extends Designer{

    private int stock;//股票
    public Architect() {
    }

    public Architect(int id, String name, int age, double salary,
                     Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "架构师{" + getStatus() +
                "stock=" + stock + getStock()  + getEquipment() +
                '}';
    }

    @Override
    public String getDetailsFrom(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t"
                + getAge() + "\t" + getSalary() +"\t架构师\t" +getStock()  ;
    }
}
