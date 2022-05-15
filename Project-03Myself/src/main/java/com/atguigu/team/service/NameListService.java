package com.atguigu.team.service;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/21:57
 * @Description:
 */

import com.atguigu.team.domain.*;

/**
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 */
public class NameListService {

    private Employee[] employees;

    /**
     * 给employee及数组元素进行初始化
     */
    public NameListService() {

        /*
        * 1.根据项目提供的Data类构建相应大小的employees数组
        2.再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
        3.将对象存于数组中
        Data类位于com.atguigu.team.service包中
        */
        employees = new Employee[Data.EMPLOYEES.length];//数组初始化

        for (int i = 0; i < employees.length; i++) {
            //获取员工类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            //获取Employee的四个基本信息
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }


    }

    /**
     * 获取指定index位置上的员工设备
     *
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(Data.EQUIPMENTS[index][0]);
        String modelOrName = Data.EQUIPMENTS[index][1];
        switch (key) {
            case Data.PC://21
                String display = Data.EQUIPMENTS[index][2];
                return new PC(modelOrName,display);
//                break;
            case Data.NOTEBOOK://22
                double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
                return new NoteBook(modelOrName,price);
//                break;
            case Data.PRINTER://23
                return new Printer(modelOrName,Data.EQUIPMENTS[index][2]);
//                break;
        }
        return null;
    }

    public Employee[] getEmployees() {
        return null;
    }

    public Employee getEmployee(int id) {
        return null;
    }
}
