package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/19:05
 * @Description:
 */
public class Programmer extends Employee {

    private int memberId;//开发团队中的id
    private Status status;
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
}
