package com.atguigu.team.junit;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import org.junit.Test;

/**
 * @Author: Leo messi
 * @Date: 2022/05/22/12:47
 * @Description:
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmplyees(){
        NameListService test = new NameListService();
        Employee[] employees = test.getAllEmployees();
        for (int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 1111;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println("employee = " + employee);
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
