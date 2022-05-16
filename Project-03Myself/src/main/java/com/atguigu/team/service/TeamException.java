package com.atguigu.team.service;

/**
 * @Author: Leo messi
 * @Date: 2022/05/17/7:38
 * @Description:
 */

/**
 * 自定义异常类
 */
public class TeamException extends Exception{

    static final long serialVersionUID = -3381516993124229948L;

    public TeamException() {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
