package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * @Author: Leo messi
 * @Date: 2022/03/20/14:34
 * @Description:ustomerList为Customer对象的管理模块，
 *  *              内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法， 供CustomerView调用
 */
public class CustomerList {


   private Customer[] customers;//用来保存客户对象的数组
    private int total = 0                 ;//记录已保存客户对象的数量


    /**
     * 用来初始化数组的构造器
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的客户添加到数组中
     * @param customer
     * @return true 成功，false:失败
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
//        customers[total] = customer;
//        total++;
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改指定索引位置上的客户信息
     * @param index
     * @param cust
     * @return 修改成功：true 修改失败：false
     */
    public boolean replaceCustomer(int index, Customer cust){
        if (index < 0 || index >= total){
            return false;
        }

        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的客户
     * @param index
     * @return true删除成功  flase：删除失败
     */
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index;i < total - 1;i++){
            customers[i] = customers[i+1];
        }

        //最后有数据的元素需要置空
//        customers[total - 1] = null;
//        total --;
        customers[--total] = null;
        return true;
    }


    public Customer[] getAllCustomers(){
        //获取所有的客户信息
        Customer[] custs = new Customer[total];
        for (int i = 0;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }


    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }

        return customers[index];
    }


    /**
     * 获取客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }

}
