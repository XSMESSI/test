package com.atguigu.team.domain;

import com.atguigu.team.service.Data;
import com.atguigu.team.service.Status;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/19:05
 * @Description:
 */
public class Programmer extends Employee {

    private int memberId;//开发团队中的id
    private Status status = Status.FREE;
    //    private double salary;
    private Equipment equipment;

    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails()+"程序员{" +
                "memberId=" + memberId +
                ", status=" + status +"\t\t\t"+
                ", equipment=" + equipment +
                '}';
    }

//    public String getTeamBaseDetails(){
//        return getDetails() + ""
//    }

    public String getDetailsFrom(){
        return memberId + "/" + getId() + "\t" + getName() + "\t"
                + getAge() + "\t" + getSalary() +"\t程序员";
    }
}
