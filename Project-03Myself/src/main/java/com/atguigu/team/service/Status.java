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
public class Status {

    private final String NAME;
    public Status(String name) {
        this.NAME = name;
    }

    private static final Status FREE = new Status("FREE");
    private static final Status BUSY = new Status("BUSY");
    private static final Status VOCATION = new Status("VOCATION");
}
