package com.atguigu.team.service;

/**
 * @Author: Leo messi
 * @Date: 2022/05/15/19:07
 * @Description:
 */

import com.atguigu.team.domain.Printer;

/**
 * 员工的状态
 */
//public class Status {
//
////    public static final Status FREE = ;
//    private final String NAME;
//    public Status(String name) {
//        this.NAME = name;
//    }
//
//    public static final Status FREE = new Status("FREE");
//    public static final Status BUSY = new Status("BUSY");
//    public static final Status VOCATION = new Status("VOCATION");
//    public String getNAME() {
//        return NAME;
//    }
//    @Override
//    public String toString() {
//        return "Status{" +
//                "NAME='" + NAME + '\'' +
//                '}';
//    }
//}

public enum Status {
    FREE,BUSY,VOCATION;
}
